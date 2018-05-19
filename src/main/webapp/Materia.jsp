<%-- 
    Document   : Materia
    Created on : 18-may-2018, 0:48:24
    Author     : MONSTER
--%>

<%@page import="Dao.Crud_Preguntas"%>
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

        <form method="post" action="Materia_Servlet">
            <%

                Crud_Preguntas cp = new Crud_Preguntas();

                for (int i = 0; i < cp.findAll().size(); i++) {
                    int op = i;
                    op++;
                    out.println("<h1>" + "Pregunta N°" + op + " " + cp.findAll().get(i).getContenido() + "</h1>");

                    String temp1 = "Bases_de_datos" + i;
                    String temp2 = "Analisis_de_senales" + i;
                    String temp3 = "Fisica_mecanica" + i;
                    String temp4 = "Digitales" + i;


            %>

            <p>&nbsp;</p>
            <input type="radio" name="<%=temp1%>" onClick="value = 1" value="<%=temp1%>"> Bases de datos
            <p>&nbsp;</p>
            <input type="radio" name="<%=temp2%>" onClick="value = 2" value="<%=temp2%>"> Analisis de señales
            <p>&nbsp;</p>
            <input type="radio" name="<%=temp3%>" onClick="value = 3" value="<%=temp3%>"> Fisica mecanica
            <p>&nbsp;</p>
            <input type="radio" name="<%=temp4%>" onClick="value = 4" value="<%=temp4%>"> Digitales
            <p>&nbsp;</p>



            <%            }
            %>


            <input type="submit" value="Confirmar" style="background-color: #FF9900" >
            <p>&nbsp;</p>
            <input type="submit" value="Volver" style="background-color: #FF9900" onClick="value = 1" >
        </form>



    </center>
</body>
</html>
