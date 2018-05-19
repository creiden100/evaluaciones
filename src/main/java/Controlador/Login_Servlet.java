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


public class Login_Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private final static Logger LOGGER = Logger.getLogger(Login_Servlet.class.getCanonicalName());

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html; charset=iso-8859-1");
        PrintWriter out = response.getWriter();

        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        int clavef = Integer.parseInt(clave);
        HttpSession misession = request.getSession(true);

        if (usuario == null && clave == null) {

            request.getRequestDispatcher("/Registro.jsp").forward(request, response);
            System.out.println("yes");

        } else {

            try {
                Crud_Profesor cp = new Crud_Profesor();
                Crud_Estudiante ce = new Crud_Estudiante();

                for (int i = 0; i < cp.findAll().size(); i++) {
                    if (usuario.equals(cp.findAll().get(i).getNombre()) && clavef == cp.findAll().get(i).getCedula_Profesor()) {
                        misession.setAttribute("name", cp.findAll().get(i).getNombre());
                        misession.setAttribute("cedula_profesor", cp.findAll().get(i).getCedula_Profesor());
                        request.getRequestDispatcher("/Profesor.jsp").forward(request, response);
                    }
                }

                for (int i = 0; i < ce.findAll().size(); i++) {
                    if (usuario.equals(ce.findAll().get(i).getNombre()) && clavef == ce.findAll().get(i).getCedula_Estudiante()) {
                        misession.setAttribute("name", ce.findAll().get(i).getNombre());
                        misession.setAttribute("cedula_estudiante", ce.findAll().get(i).getCedula_Estudiante());
                        request.getRequestDispatcher("/Estudiante.jsp").forward(request, response);
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(Login_Servlet.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
