<%-- 
    Document   : Profesor
    Created on : 16-may-2018, 22:28:39
    Author     : MONSTER
--%>

<%@page import="Dao.Crud_Profesor"%>
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


        <%

            HttpSession misession = request.getSession(true);
            String temp = misession.getAttribute("name").toString();
            Crud_Profesor ce = new Crud_Profesor();

            for (int i = 0; i < ce.findAll().size(); i++) {
                if (ce.findAll().get(i).getNombre().equals(temp)) {
                    out.println("<h1 >" +"Buenos dias"+" "+ "Nombre" + ":  " + ce.findAll().get(i).getNombre() + "</h1>");
                    out.println("<h1  >" + "Genero" + ":  " + ce.findAll().get(i).getGenero() + "</h1>");
                    out.println("<h1 >" + "Carrera" + ":  " + ce.findAll().get(i).getProfesion()+ "</h1>");
                }
            }


        %>


        <form method="post" action="Profesor_Servlet">

            <p>&nbsp;</p>
            <input type="radio" name="Role" onClick="value = 1" value="Asignar"> Asignar examenes
            <p>&nbsp;</p>
            <input type="radio" name="Role" onClick="value = 2" value="Crear"> Crear Examen
            <p>&nbsp;</p>
            <input type="radio" name="Role" onClick="value = 3" value="Agregar"> Agregar preguntas de examen
            <p>&nbsp;</p>

            <input type="submit" value="Comenzar"  style="background-color: #FF9900">


        </form>




    </center>



</body>
</html>
