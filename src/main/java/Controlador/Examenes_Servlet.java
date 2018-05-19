package Controlador;

import Dao.Crud_Estudiante;
import Dao.Crud_Usuarios;
import Datos.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Examenes_Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();

        String Bases_de_datos = request.getParameter("Bases_de_datos");
        String Analisis_de_senales = request.getParameter("Analisis_de_senales");
        String Fisica_mecanica = request.getParameter("Fisica_mecanica");
        String Digitales = request.getParameter("Digitales");
        HttpSession misession = request.getSession(true);

        

            if (Bases_de_datos == null) {
                Bases_de_datos = "null";
            }

            if (Analisis_de_senales == null) {
                Analisis_de_senales = "null";
            }

            if (Fisica_mecanica == null) {
                Fisica_mecanica = "null";
            }
            if (Digitales == null) {
                Digitales = "null";
            }

            if (Bases_de_datos.trim().equals("1")) {
                misession.setAttribute("opcion", "Bases de datos");
                request.getRequestDispatcher("/Cuestionario.jsp").forward(request, response);
            }

            if (Analisis_de_senales.trim().equals("1")) {
                misession.setAttribute("opcion", "Analisis de señales");
                request.getRequestDispatcher("/Cuestionario.jsp").forward(request, response);
            }

            if (Fisica_mecanica.trim().equals("1")) {
                misession.setAttribute("opcion", "Fisica mecanica");
                request.getRequestDispatcher("/Cuestionario.jsp").forward(request, response);
            }
            if (Digitales.trim().equals("1")) {
                misession.setAttribute("opcion", "Digitales");
                request.getRequestDispatcher("/Cuestionario.jsp").forward(request, response);
            }

        
    }

}
