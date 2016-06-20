<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <button id="btn">发出post请求</button>

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
                xmlHttp.open("post","ajax",true);

                xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
                xmlHttp.send();
            };



        })();
    </script>

</body>
</html>
