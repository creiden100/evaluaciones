<%@page import="Dao.Crud_Resultados"%>
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


        <form method="post" action="Resultados_Servlet">


            <%
                Crud_Resultados cresul = new Crud_Resultados();
                HttpSession misession = request.getSession(true);
                String tempcedulaestudiante = misession.getAttribute("cedula_estudiante").toString();
                int temp2 = Integer.parseInt(tempcedulaestudiante);
                String name_examen = null;

                for (int i = 0; i < cresul.findAll().size(); i++) {

                    if (cresul.findAll().get(i).getCedula_estudiante() == temp2) {
                        if (cresul.findAll().get(i).getId_examenes() == 1) {
                            name_examen = "Bases de datos";
                        }

                        if (cresul.findAll().get(i).getId_examenes() == 2) {
                            name_examen = "Analisis de señales";
                        }

                        if (cresul.findAll().get(i).getId_examenes() == 3) {
                            name_examen = "Fisica mecanica";
                        }

                        if (cresul.findAll().get(i).getId_examenes() == 4) {
                            name_examen = "Digitales";
                        }

                        out.println("<h3>" + "Tu nota del examen de: " + name_examen +" "+ "fue de : " +" "+ cresul.findAll().get(i).getPuntaje() +" "+ "puntos" + "</h3>");
                    }

                }


            %>


            <input type="submit" value="Volver"  style="background-color: #FF9900">

        </form>



    </center>
</body>
</html>
