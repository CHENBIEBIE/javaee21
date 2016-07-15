<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/21
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
</head>
<body>

    <div class="container">

        <div class="page-header">
            <h3>RRS</h3>
        </div>
        <button id="loadBtn">Read</button>
    </div>
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

            document.querySelector("#loadBtn").onclick=function(){

                var xmlHttp =creatXmlHttp();

                xmlHttp.open("get","http://www.36kr.com/feed",true);
                xmlHttp.send();
            };



        })();

    </script>

</body>
</html>
