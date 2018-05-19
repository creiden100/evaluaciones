<%-- 
    Document   : Estudiante
    Created on : 16-may-2018, 22:28:56
    Author     : MONSTER
--%>

<%@page import="Dao.Crud_Estudiante"%>
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


        <form method="post" action="Estudiante_Servlet">
            <p>&nbsp;</p>
            <p>&nbsp;</p>
            <p>&nbsp;</p>

            <img src="https://userscontent2.emaze.com/images/d4303289-5bb0-421e-87b3-e40cd9719e60/acf344d6a09d07fd76ea0eb5cb34d334.png" alt="Árbol con ramas" />
            <p>&nbsp;</p>

            <%

                HttpSession misession = request.getSession(true);
                String temp = misession.getAttribute("name").toString();
                Crud_Estudiante ce = new Crud_Estudiante();

                for (int i = 0; i < ce.findAll().size(); i++) {
                    if (ce.findAll().get(i).getNombre().equals(temp)) {
                        out.println("<h1 >" + "Nombre" + ":  " + ce.findAll().get(i).getNombre() + "</h1>");
                        out.println("<h1  >" + "Genero" + ":  " + ce.findAll().get(i).getGenero() + "</h1>");
                        out.println("<h1 >" + "Carrera" + ":  " + ce.findAll().get(i).getCarrera() + "</h1>");
                    }
                }


            %>


            <input type="radio" name="Role" onClick="value = 1" value="Asignar"> Realizar examenes
            <p>&nbsp;</p>
            <input type="radio" name="Role" onClick="value = 2" value="Crear"> Ver resultados de examenes
            <p>&nbsp;</p>
            <input type="submit" value="Comenzar" style="background-color: #FF9900">
           



        </form>

    </center>
</body>
</html>
