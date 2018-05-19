<%-- 
    Document   : Examenes
    Created on : 18-may-2018, 1:30:10
    Author     : MONSTER
--%>

<%@page import="Dao.Crud_Usuarios"%>
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

        <form method="post" action="Examenes_Servlet">

            <img src="https://userscontent2.emaze.com/images/d4303289-5bb0-421e-87b3-e40cd9719e60/acf344d6a09d07fd76ea0eb5cb34d334.png" alt="Árbol con ramas" />
            <p>&nbsp;</p>


            <%

                HttpSession misession = request.getSession(true);
                String temp = misession.getAttribute("cedula_estudiante").toString();
                int temp2 = Integer.parseInt(temp);
                Crud_Usuarios cu = new Crud_Usuarios();
                String Examenes = null;

                for (int i = 0; i < cu.findAll().size(); i++) {
                    if (cu.findAll().get(i).getCedula_estudiante() == temp2) {
                        Examenes = cu.findAll().get(i).getExamenes();
                    }

                }

                String[] parts = Examenes.split(",");
                String part1 = parts[0];
                String part2 = parts[1];
                String part3 = parts[2];
                String part4 = parts[3];


            %>




            <%                if (part1.trim().equals("null")) {
                } else {

            %>

            <p>&nbsp;</p>
            <input type="radio" name="Bases_de_datos" onClick="value = 1" value="Bases_de_datos"> Bases de datos

            <%                }
            %>

            <%
                if (part2.trim().equals("null")) {
                } else {

            %>

            <p>&nbsp;</p>
            <input type="radio" name="Analisis_de_senales" onClick="value = 1" value="Analisis_de_senales"> Analisis de senales

            <%                }
            %>

            <%
                if (part3.trim().equals("null")) {
                } else {

            %>

            <p>&nbsp;</p>
            <input type="radio" name="Fisica_mecanica" onClick="value = 1" value="Fisica_mecanica"> Fisica mecanica

            <%                }
            %>

            <%
                if (part4.trim().equals("null")) {
                } else {

            %>

            <p>&nbsp;</p>
            <input type="radio" name="Digitales" onClick="value = 1" value="Digitales"> Digitales

            <%                }
            %>
            
            <p>&nbsp;</p>

            <input type="submit" value="Iniciar" style="background-color: #FF9900">
            
        </form>



    </center>
</body>
</html>
