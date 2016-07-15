<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Ajax</title>

</head>
<body>


<script>
    (function(){

        function createXmlHttp(){
            var  xmlHttp=null;

            if(window.ActiveXObject){
                xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
            }else {
                xmlHttp = new XMLHttpRequest();
            }
            alert(xmlHttp);
        }

    })();
</script>

</body>
</html>
