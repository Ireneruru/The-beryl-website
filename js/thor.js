var last_batch = 0;
function htmlencode(s){
    var div = document.createElement('div');
    div.appendChild(document.createTextNode(s));
    return div.innerHTML.replace(/\n/g,"<br>");
}
function showlatex()
{
    var str = document.getElementById("source").value;
    var xmlHttp=new XMLHttpRequest();
    xmlHttp.onreadystatechange=function() {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            if (xmlHttp.responseText == "ok\n") {
                document.getElementById("latex").innerHTML = "<img src='/target.jpg?t=" + Math.random() + "'>";
            }
            else {
                document.getElementById("latex").innerHTML = htmlencode(xmlHttp.responseText);
            }
        }
    };
    var url="http://localhost:80/compile.py";
    xmlHttp.open("POST",url,true);
    xmlHttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
    xmlHttp.send(str);
}

function parsesource()
{
    var str = document.getElementById("source").value;
    var xmlHttp=new XMLHttpRequest();
    var load_code = false;
    xmlHttp.onreadystatechange=function() {
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
            if (xmlHttp.responseText == "ok\n") {
                document.getElementById("latex").innerHTML = "<img src='/target.jpg?t=" + Math.random() + "'>";
                Highcharts.chart('chart', {
                    chart: {
                        type: 'spline',
                        animation: Highcharts.svg, // don't animate in old IE
                        marginRight: 10,
                        events: {
                            load: function () {
                                // set up the updating of the chart each second
                                var series = this.series[0];
                                var loop = setInterval(function () {
                                    var xmlHttp=new XMLHttpRequest();
                                    xmlHttp.onreadystatechange=function()
                                    {
                                        if (xmlHttp.readyState==4 && xmlHttp.status==200)
                                        {
                                            document.getElementById("output").innerHTML=htmlencode(xmlHttp.responseText);
                                            var s = xmlHttp.responseText;
                                            var arr = s.split("\n");
                                            if (arr[0].length > 0) {
                                                if (arr[0] != 'train') {
                                                    clearInterval(loop);
                                                }
                                                else if (!load_code) {
                                                    var q = new XMLHttpRequest();
                                                    q.open("GET", "http://localhost:80/code.txt", false);
                                                    q.send(null);
                                                    document.getElementById("tensorflow").innerHTML = "<pre>" + q.responseText + "</pre>";
                                                    load_code = true;
                                                }
                                            }
                                            for (var i = 1; i < arr.length - 1; ++i) {
                                                if (arr[i].length > 0 && i > last_batch) {
                                                    var last = arr[i];
                                                    var value = last.split(" ")[9];
                                                    var x = i;
                                                    var y = parseFloat(value);
                                                    if (i < 100) {
                                                        series.addPoint([x, y], true, false);
                                                    }
                                                    else {
                                                        series.addPoint([x, y], true, true);
                                                    }
                                                    last_batch = i;
                                                }
                                            }
                                        }
                                    };
                                    var url="http://localhost:80/query.py";
                                    xmlHttp.open("POST",url,true);
                                    xmlHttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
                                    xmlHttp.send("refresh");
                                }, 2000);
                            }
                        }
                    },
                    title: {
                        text: 'Training Result'
                    },
                    xAxis: {
                        title: {
                            text: 'Batch'
                        },
                        tickPixelInterval: 150
                    },
                    yAxis: {
                        title: {
                            text: 'Value'
                        },
                        plotLines: [{
                            value: 0,
                            width: 1,
                            color: '#808088'
                        }]
                    },
                    tooltip: {
                        formatter: function () {
                            return '<b>' + this.series.name + '</b><br/>' +
                                'batch : ' + Highcharts.numberFormat(this.x) + '<br/>' +
                                'target : ' + Highcharts.numberFormat(this.y, 2);
                        }
                    },
                    legend: {
                        enabled: false
                    },
                    exporting: {
                        enabled: false
                    },
                    series: [{
                        name: 'Training Result',
                        data: (function () {
                            return [];
                        }())
                    }]
                });
            }
            else {
                document.getElementById("latex").innerHTML = htmlencode(xmlHttp.responseText);
            }
        }
    };
    var url="http://localhost:80/query.py";
    xmlHttp.open("POST",url,true);
    xmlHttp.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
    xmlHttp.send(str);
}
