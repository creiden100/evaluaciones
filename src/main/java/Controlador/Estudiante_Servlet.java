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

public class Estudiante_Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();

        String role = request.getParameter("Role");

        if (role == null) {
            request.getRequestDispatcher("/Login.jsp").forward(request, response);
        } else {

            if (role.equals("1")) {

                request.getRequestDispatcher("/Examenes.jsp").forward(request, response);

            }

            if (role.equals("2")) {

                request.getRequestDispatcher("/Resultados.jsp").forward(request, response);
            }

        }

    }

}
