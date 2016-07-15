<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Ajax</title>

</head>
<body>
<button id="btn">发出ajax</button>

<script>
    (function(){
        function creatXmlHttp() {

            var xmlhttp = null;

            if (Window.ActiveXObject) {
                xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
            } else {
                xmlhttp = new XMLHttpRequest();
            }
            return xmlhttp;
        }
        document.querySelector("#btn").onclick=function(){
            var xmlHttp = creatXmlHttp();
            xmlHttp.open("get","ajax");
            xmlHttp.send();
        };

    })();
</script>

</body>
</html>
