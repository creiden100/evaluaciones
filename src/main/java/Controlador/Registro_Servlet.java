package Controlador;

import Dao.Crud_Estudiante;
import Dao.Crud_Profesor;
import Datos.Estudiante;
import Datos.Profesor;
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

public class Registro_Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final static Logger LOGGER = Logger.getLogger(Login_Servlet.class.getCanonicalName());

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();

        String nombre = request.getParameter("nombre");
        String genero = request.getParameter("genero");
        String carrera = request.getParameter("carrera");
        String clave = request.getParameter("cedula");
        String role = request.getParameter("Role");

        if (nombre == null) {

            request.getRequestDispatcher("/Estudiante.jsp").forward(request, response);

        } else {

            int clavef = Integer.parseInt(clave);

            if (role.equals("1")) {
                try {
                    //profesor
                    Profesor p = new Profesor(nombre, genero, carrera, clavef);
                    Crud_Profesor cp = new Crud_Profesor();
                    cp.insert(p);
                    request.getRequestDispatcher("/Login.jsp").forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(Registro_Servlet.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (role.equals("2")) {
                try {
                    //estudiante

                    Estudiante e = new Estudiante(nombre, genero, carrera, clavef);
                    Crud_Estudiante ce = new Crud_Estudiante();
                    ce.insert(e);
                    request.getRequestDispatcher("/Login.jsp").forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(Registro_Servlet.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

    }

}
