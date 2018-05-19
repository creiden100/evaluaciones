<%-- 
    Document   : Login
    Created on : 09-may-2018, 15:19:23
    Author     : MONSTER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    </head>
    <body>


        <style type="text/css">
            body{
                background:#ccccff;
            }
        </style>

    <center>


        <form method="post" action="Login_Servlet">
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>

            <img src="https://userscontent2.emaze.com/images/d4303289-5bb0-421e-87b3-e40cd9719e60/acf344d6a09d07fd76ea0eb5cb34d334.png" alt="Árbol con ramas" />
            <p>&nbsp;</p>

            Ingrese nombre de usuario:
            <input type="text" name="usuario" size="20"><br>
            <p>&nbsp;</p>
            Ingrese clave:
            <input type="password" name="clave" size="20" onKeypress="if (event.keyCode < 45 || event.keyCode > 57) event.returnValue = false;"><br>
            <p>&nbsp;</p>
            <input type="submit" value="Ingresar"  style="background-color: #FF9900">
            
            
        </form>

        <p>&nbsp;</p>
        
        <form method="post" action="Registro_Servlet">
         <input type="submit" value="Registar"  style="background-color: #FF9900"  onClick="newPage('Registro.jsp')">
        </form>


    </center>
</body>
</html>
