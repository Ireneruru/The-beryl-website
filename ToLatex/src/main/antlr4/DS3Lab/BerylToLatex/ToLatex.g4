grammar ToLatex;

@parser::header {
import java.io.*;
import java.util.*;
}
@parser::members{
FileWriter open(String s) {
    try {
        return new FileWriter(s, false);
    }
    catch (IOException e) {
        throw new ParseCancellationException(e);
    }
}

FileWriter f = open("latex.txt");

void wr(String s) {
    try {
        f.write(s);
        f.flush();
    }
    catch (IOException e) {
        throw new ParseCancellationException(e);
    }
}
}

program :
        {
            wr("\\documentclass{article}\n\\usepackage{CJK}\n\\usepackage{amsmath}\n\\pagestyle{empty}\n\\allowdisplaybreaks\n\\begin{document}\n\\begin{align*}\n");
        }
        (
            { wr("&  "); }
            statement
            { wr(" \\\\\n"); }
        )*
        {
            wr("\\end{align*}\n\\end{document}\n");
        }
    ;

index : ID | INT ;

set_index : '{'{wr("{ ");} expression (','{wr(", ");} expression )*  '}'{wr("} ");}
             | index{wr($index.text);} ;

var_desc : var_range ( ','{wr(", \\ ");} var_range )* ;

var_range : ID{wr($ID.text);} '='{wr("=");} expression '...'{wr("...");} expression ;

statement : const_def{wr($const_def.text);} | schema | assignment | feed | evaluation ;

const_def : ID ':=' ( INT | FLOAT ) ;

schema :
    tensor{wr($tensor.text+' ');} ( ','{wr(",\\ ");} tensor{wr($tensor.text+ ' ');}  )* 'in' {wr("\\in ");}
 ID{wr($ID.text);} ( '^'{wr("^");} set_index )? ( ','{wr(",\\  ");} var_desc )?  ;

tensor :
    ID ( '_' ( ID | '{' ID ( ',' ID )* '}' ) )? ;

assignment : ID{wr($ID.text);} ( '_'{wr("_");} set_index )? '='{wr("\\ =\\ ");} expression ( ','{wr(",\\ ");} var_desc )? ;

expression : expression '+'{wr("+");} expression_m
          | expression '-'{wr("-");} expression_m
          | expression_m ;

expression_m : expression_m '*'{wr("*");} expression_o
            | expression_m '.'{wr("\\cdot ");} expression_o
            | expression_m '/'{wr("/");} expression_o
            | expression_o ;

expression_o : '-'{wr("-");} expression_t
            | expression_t '\''{wr("^{\\rm T}");}
            | expression_t ;

expression_t : ID {wr($ID.text);}'('{wr("(");} params? ')'{wr(")");}
             | ID{wr("\\"+$ID.text);} '_' '{'{wr("_{");} ID{wr($ID.text);} '='{wr("=");} expression '}' '^'{wr("}^{");} '{' expression '}' '{' {wr("}{");}expression '}'{wr("}");}
             | '('{wr("(");} expression ')'{wr(")");}
             | ID{wr($ID.text);} ( '_'{wr("_");} set_index  )?
             | num {wr($num.text);};

params : expression ( ','{wr(",\\ ");} expression )* ;

feed : ID{wr($ID.text);} (','{wr(",\\ ");} ID{wr($ID.text);} )* '~'{wr("\\ \\sim \\  ");} ( STRING{wr($STRING.text);} | ID {wr($ID.text);} '('{wr("(");}  params? ')' {wr(")");} ) ;

evaluation  : 'min'{wr("\\min");} '_' {wr("_");} '{' {wr("{");} ID{wr($ID.text);}  ( ','{wr(",");}  ID{wr($ID.text);} )* '}' '{'{wr("}{ ");} expression '}' { wr("}"); }  | expression ;

num : INT | FLOAT ;

ID : [a-zA-Z][a-zA-Z0-9]* ;

STRING : '"' (~["])+ '"' ;

INT : [0-9]+ ;

FLOAT : [0-9]+'.'[0-9]+ ;

WS : [ \t\r\n]+ -> skip ;
