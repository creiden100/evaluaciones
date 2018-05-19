package Controlador;

import Dao.Crud_Estudiante;
import Dao.Crud_Profesor;
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


public class Resultados_Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final static Logger LOGGER = Logger.getLogger(Login_Servlet.class.getCanonicalName());

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();

         request.getRequestDispatcher("/Estudiante.jsp").forward(request, response);
        
       

    }

}
