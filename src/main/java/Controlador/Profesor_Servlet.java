package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Profesor_Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();

        String role = request.getParameter("Role");

        if (role.equals("1")) {

            request.getRequestDispatcher("/Asignar.jsp").forward(request, response);

        }
        
        if (role.equals("2")) {

            request.getRequestDispatcher("/Crear_Examen.jsp").forward(request, response);

        }
        
        if (role.equals("3")) {

            request.getRequestDispatcher("/Materia.jsp").forward(request, response);
        }

    }

}
