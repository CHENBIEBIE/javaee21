
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button id="btn">Get Json</button>
<ul id="list">

</ul>

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

            var xmHttp = creatXmlHttp();

            xmHttp.open("get","/user.json",true);

            xmHttp.onreadystatechange=function(){
                if (xmHttp.readyState ==4){
                    if (xmHttp.status==200){

                        var result = xmHttp.responseText;

                        //字符串转成json
                        var json = JSON.parse(result);


                        for (var i= 0;i<json.length;i++){

                            var user = json[i];
                            var id = user.id;
                            var name = user.name;
                            var score = user.score;

                            var li = document.createElement("li");

                            var text = document.createTextNode(id+"-->"+name)
                            li.appendChild(text);
                            document.getElementById("list").appendChild(li);

                        }
                    }
                }
            }


            xmHttp.send();

        };


        /*var object = {
            "name":"java",
            "type":"language"
        };
        alert(object.name);
        alert(object["name"])


        var array = [
                {

                    "name":"java",
                    "type":"language"

                },

                {
                    "name":"java",
                    "type":"zz"

                }

        ];

        for (var i=0;i<array.length;i++){

            var a = array[i];
            console.log(a.name +"--->"+ a.type);

        }*/

    })();
</script>

</body>
</html>
