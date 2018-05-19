package Controlador;

import Dao.Crud_Estudiante;
import Dao.Crud_Preguntas;
import Dao.Crud_Usuarios;
import Datos.Preguntas;
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

public class Materia_Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            response.setContentType("text/html; charset=iso-8859-1");
            PrintWriter out = response.getWriter();

            Crud_Preguntas cp = new Crud_Preguntas();
            
            String desicion=request.getParameter("Volver");
            
            if(desicion == null){
                request.getRequestDispatcher("/Profesor.jsp").forward(request, response);
            }else{
                
            for (int i = 0; i < cp.findAll().size(); i++) {
                int temppre = i;
                temppre++;

                String temp1 = "Bases_de_datos" + i;
                String temp2 = "Analisis_de_senales" + i;
                String temp3 = "Fisica_mecanica" + i;
                String temp4 = "Digitales" + i;

                String Bases_de_datos = request.getParameter(temp1);
                String Analisis_de_senales = request.getParameter(temp2);
                String Fisica_mecanica = request.getParameter(temp3);
                String Digitales = request.getParameter(temp4);

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

                if (Bases_de_datos.equals("1")) {
                    cp.update(1, temppre);
                }

                if (Analisis_de_senales.equals("2")) {
                    cp.update(2, temppre);
                }

                if (Fisica_mecanica.equals("3")) {
                    cp.update(3, temppre);
                }
                if (Digitales.equals("4")) {
                    cp.update(4, temppre);
                }

            }
        }
        } catch (SQLException ex) {
            Logger.getLogger(Asignar_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
