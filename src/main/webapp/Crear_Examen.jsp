<%-- 
    Document   : Crear_Examen
    Created on : 18-may-2018, 23:50:38
    Author     : MONSTER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <style type="text/css">
            body{
                background:#ccccff;
            }
        </style>

    <center>

        <img src="https://userscontent2.emaze.com/images/d4303289-5bb0-421e-87b3-e40cd9719e60/acf344d6a09d07fd76ea0eb5cb34d334.png" alt="Árbol con ramas" />
        <p>&nbsp;</p>

        <form method="post" action="Crear_Examen_Servlet">

            Ingrese nombre de Examen
            <input type="text" name="name" size="20"><br>
            <p>&nbsp;</p>
            <input type="submit" value="Crear"  style="background-color: #FF9900">

        </form>





    </center>


</body>
</html>
