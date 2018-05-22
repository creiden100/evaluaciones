package Controlador;

import Dao.Crud_Estudiante;
import Dao.Crud_Examenes;
import Dao.Crud_Usuarios;
import Datos.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Asignar_Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            response.setContentType("text/html; charset=iso-8859-1");
            PrintWriter out = response.getWriter();

            HttpSession misession = request.getSession(true);

            String tempcedupro = misession.getAttribute("cedula_profesor").toString();

            int cedula_profesor = Integer.parseInt(tempcedupro);

            Crud_Estudiante ce = new Crud_Estudiante();

            Crud_Usuarios cu = new Crud_Usuarios();
            Crud_Examenes crex = new Crud_Examenes();
            String[] nombre = new String[crex.findAll().size()];
            String[] nombre2 = new String[crex.findAll().size()];

            Map<Integer, String> treeMap = new TreeMap<Integer, String>();
            Map<Integer, String> treeMap1 = new TreeMap<Integer, String>();

            String decision = request.getParameter("Bases de datos0");

//            if (decision == null) {
//                request.getRequestDispatcher("/Profesor.jsp").forward(request, response);
//
//            } else {
            for (int i = 0; i < ce.findAll().size(); i++) {

                for (int j = 0; j < crex.findAll().size(); j++) {
                    String temporalito = crex.findAll().get(j).getNombre() + j;
                    treeMap1.put(j, temporalito);
                }

                for (int j = 0; j < crex.findAll().size(); j++) {
                    nombre[j] = request.getParameter(treeMap1.get(j));

                }

                for (int j = 0; j < nombre.length; j++) {
                    if (nombre[j] == null) {
                        nombre[j] = "null";
                    }
                }

                for (int j = 0; j < nombre.length; j++) {
                    if (nombre[j].equals("1")) {
                        treeMap.put(j, treeMap1.get(j));
                    }
                }

                for (int j = 0; j < crex.findAll().size(); j++) {

                    if (treeMap.get(j) == null) {
                        nombre2[j] = "null";

                    } else {
                        nombre2[j] = crex.findAll().get(j).getNombre();

                    }

                }

                StringBuffer cadena = new StringBuffer();
                for (int x = 0; x < nombre2.length; x++) {
                    cadena = cadena.append(nombre2[x]+",");
                }

                String examenes=String.valueOf(cadena);
                Usuarios user = new Usuarios(cedula_profesor, ce.findAll().get(i).getCedula_Estudiante(), examenes);
                cu.insert(user);
                request.getRequestDispatcher("/Prosefor.jsp").forward(request, response);

            }
            //  }
        } catch (SQLException ex) {
            Logger.getLogger(Asignar_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
