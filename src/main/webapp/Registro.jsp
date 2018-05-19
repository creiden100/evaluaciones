<%-- 
    Document   : Registro
    Created on : 16-may-2018, 21:59:31
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


        <img src="https://userscontent2.emaze.com/images/d4303289-5bb0-421e-87b3-e40cd9719e60/acf344d6a09d07fd76ea0eb5cb34d334.png" alt="Árbol con ramas" />
        <p>&nbsp;</p>

        <form method="post" action="Registro_Servlet">
            Ingrese Nombre de usuario:
            <input type="text" name="nombre" size="20"><br>
            <p>&nbsp;</p>
            Ingrese Genero de usuario:
            <input type="text" name="genero" size="20"><br>
            <p>&nbsp;</p>
            Ingrese Carrera o profesion de usuario:
            <input type="text" name="carrera" size="20"><br>
            <p>&nbsp;</p>
            Ingrese Cedula de usuario:
            <input type="text" name="cedula" size="20"><br>
            <p>&nbsp;</p>
            <input type="radio" name="Role" onClick="value = 1" value="profesor"> Profesor
            <input type="radio" name="Role" onClick="value = 2" value="estudiante"> Estudiante
            <p>&nbsp;</p>

            <input type="submit" value="Registrar" style="background-color: #FF9900">
             <p>&nbsp;</p>
            <input type="submit" value="Volver" style="background-color: #FF9900">
            
        </form>



    </center>




</body>
</html>
