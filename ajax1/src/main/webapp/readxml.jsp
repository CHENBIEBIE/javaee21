<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/6/21
  Time: 10:32
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
        <h3>Ajax读取xml</h3>
    </div>
    <button id="btn">read</button>
    <div id="userBox">
        <%--<div>--%>
            <%--<h4>Tom <small>101</small></h4>--%>
            <%--<p>China</p>--%>
        <%--</div>--%>
    </div>
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

        function createUserDic(id,username,address) {

            var div = document.createElement("div");
            var h4 = document.createElement("h4");
            var small= document.createElement("small");
            var p = document.createElement("p");

            var idText = document.createTextNode(id);
            var addressText = document.createTextNode(address);
            var nameText = document.createTextNode(username);
            p.appendChild(addressText);
            small.appendChild(idText);
            h4.appendChild(nameText);
            h4.appendChild(small);
            div.appendChild(h4);
            div.appendChild(p);
            document.getElementById("userBox").appendChild(div);

        }



        document.getElementById("btn").onclick=function(){

            var xmlHttp = creatXmlHttp();

            xmlHttp.open("get","/user.xml",true);


            xmlHttp.onreadystatechange=function(){
                if (xmlHttp.readyState==4){
                    var status = xmlHttp.status;
                    if (status==200){
                        
                        document.getElementById("userBox").innerHTML="";

                        var xmlDoc = xmlHttp.responseXML;

                        var userArray = xmlDoc.getElementsByTagName("user");

                        for(var i=0;i<userArray.length;i++){

                            var user = userArray[i];

                            var id=user.getAttribute("id");

                            var username = user.getElementsByTagName("username")[0].childNodes[0].nodeValue;

                            var address=user.getElementsByTagName("address")[0].childNodes[0].nodeValue;

                            console.log("ID:"+id+"UaerName"+username+"Address:"+address);

                            createUserDic(id,username,address);


                        }


                    }else {
                        alert("服务器请求异常:"+status)
                    }
                }
            };

            xmlHttp.send();

        };

    })();

</script>

</body>
</html>
