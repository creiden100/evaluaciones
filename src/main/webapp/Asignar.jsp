<%-- 
    Document   : Asignar
    Created on : 17-may-2018, 23:19:19
    Author     : MONSTER
--%>

<%@page import="java.util.TreeMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Map"%>
<%@page import="Dao.Crud_Examenes"%>
<%@page import="Dao.Crud_Estudiante"%>
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

        <form method="post" action="Asignar_Servlet">

            <img src="https://userscontent2.emaze.com/images/d4303289-5bb0-421e-87b3-e40cd9719e60/acf344d6a09d07fd76ea0eb5cb34d334.png" alt="Árbol con ramas" />
            <p>&nbsp;</p>


            <%
                HttpSession misession = request.getSession(true);

                out.println("<h1>" + "Bienvenido profesor: " + misession.getAttribute("name") + "</h1>");
                out.println("<h1>" + "Documento: " + misession.getAttribute("cedula_profesor") + "</h1>");
                Crud_Estudiante ce = new Crud_Estudiante();
                Crud_Examenes crex = new Crud_Examenes();
                
                 Map<Integer, String> treeMap = new TreeMap<Integer, String>();
                
            

                for (int i = 0; i < ce.findAll().size(); i++) {
                    out.println("<h1>" + "Estudiante" + "       " + "Carrera" + "</h1>");
                    out.println(ce.findAll().get(i).getNombre() + "  " + ce.findAll().get(i).getCarrera());

                    for (int i2 = 0; i2 < crex.findAll().size(); i2++) {
                        String tempo=crex.findAll().get(i2).getNombre()+i2;
                        treeMap.put(i2,tempo);
                    }
                    
                    for (int i3 = 0; i3 < crex.findAll().size(); i3++) {
                            
                        

            %>

            <p>&nbsp;</p>
            <input type="radio" name="<%=treeMap.get(i3)%>" onClick="value = 1" value="<%=treeMap.get(i3)%>"> <%=treeMap.get(i3)%>
            <p>&nbsp;</p>
            


            <%             }
}
            %>

            <input type="submit" value="Confirmar" style="background-color: #FF9900">
            <p>&nbsp;</p>
            <input type="submit" value="Volver" style="background-color: #FF9900">
        </form>


    </center>




</body>
</html>
