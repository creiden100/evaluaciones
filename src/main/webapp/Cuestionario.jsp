<%@page import="java.util.TreeMap"%>
<%@page import="java.util.Map"%>
<%@page import="Dao.Crud_Respuesta"%>
<%@page import="Dao.Crud_Preguntas"%>
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


        <form method="post" action="Cuestionario_Servlet">

            <%

                HttpSession misession = request.getSession(true);
                String temp = misession.getAttribute("opcion").toString();

                Crud_Preguntas cp = new Crud_Preguntas();
                Crud_Respuesta cr = new Crud_Respuesta();
                Map<Integer, String> treeMap = new TreeMap<Integer, String>();
                treeMap.put(0, "A)");
                treeMap.put(1, "B)");
                treeMap.put(2, "C)");
                treeMap.put(3, "D)");
                int tempo = 0;
                int numeral = 0;
                int desicion = 0;

                if (temp.trim().equals("Bases de datos")) {
                    desicion = 1;
                }

                if (temp.trim().equals("Analisis de señales")) {
                    desicion = 2;
                }

                if (temp.trim().equals("Fisica mecanica")) {
                    desicion = 3;
                }

                if (temp.trim().equals("Digitales")) {
                    desicion = 4;
                }

               
                    for (int i = 0; i < cp.findAll().size(); i++) {
                        if (cp.findAll().get(i).getId_Examen() == desicion) {
                            numeral = i;
                            numeral++;
                            out.println("<h4>" + numeral + ".  " + cp.findAll().get(i).getContenido() + "</h4>");
                            for (int i2 = 0; i2 < cr.findAll().size(); i2++) {

                                if (tempo == 4) {
                                    tempo = 0;
                                }

                                if (cr.findAll().get(i2).getId_pregunta() == cp.findAll().get(i).getId_Pregunta()) {
                                    // out.println("<h1>" + treeMap.get(tempo) + cr.findAll().get(i2).getContenido() + "</h1>");
                                    String tempocon = treeMap.get(tempo) + i2;


            %>

            <p>&nbsp;</p>
            <%=treeMap.get(tempo)%><input type="radio" name="<%=tempocon%>" onClick="value = <%=cr.findAll().get(i2).getContenido()%>" value="<%=cr.findAll().get(i2).getContenido()%>"> <%=cr.findAll().get(i2).getContenido()%>

            <%
                                    tempo++;
                                }

                            }

                        }

                    }

                


            %>


            <p>&nbsp;</p>
            <input type="submit" value="Finalizar" style="background-color: #FF9900">
            <p>&nbsp;</p>


        </form>






    </center>
</body>
</html>
