package Controlador;

import Dao.Crud_Estudiante;
import Dao.Crud_Preguntas;
import Dao.Crud_Respuesta;
import Dao.Crud_Resultados;
import Dao.Crud_Usuarios;
import Datos.Preguntas;
import Datos.Resultados;
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

public class Cuestionario_Servlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int puntaje = 0;
            HttpSession misession = request.getSession(true);
            String temp = misession.getAttribute("opcion").toString();

            response.setContentType("text/html; charset=iso-8859-1");
            PrintWriter out = response.getWriter();

            Crud_Respuesta cr = new Crud_Respuesta();
            Crud_Preguntas cp = new Crud_Preguntas();

            int pivo1 = 0;
            int pivo2 = 4;
            int pivo3 = 7;
            int pivo4 = 10;

            if (temp.equals("Bases de datos")) {

                for (int i = 0; i < cr.findAll().size(); i++) {

                    String temp1 = "A)" + i;
                    String temp2 = "B)" + i;
                    String temp3 = "C)" + i;
                    String temp4 = "D)" + i;

                    String a = request.getParameter(temp1);
                    String b = request.getParameter(temp2);
                    String c = request.getParameter(temp3);
                    String d = request.getParameter(temp4);

                    if (a == null) {
                        a = "null";
                    }

                    if (b == null) {
                        b = "null";
                    }

                    if (c == null) {
                        c = "null";
                    }
                    if (d == null) {
                        d = "null";
                    }
                    if (a.equals("null") && b.equals("null") && c.equals("null") && d.equals("null")) {

                    } else {

                        if (a.equals("null")) {

                        } else {
                            System.out.println(a);
                            System.out.println(cp.findAll().get(pivo1).getRespuesta_Correcta());

                            if (a.trim().equals(cp.findAll().get(pivo1).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo1++;
                        }

                        if (b.equals("null")) {

                        } else {
                            System.out.println(b);
                            System.out.println(cp.findAll().get(pivo1).getRespuesta_Correcta());
                            if (b.trim().equals(cp.findAll().get(pivo1).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo1++;
                        }

                        if (c.equals("null")) {

                        } else {
                            System.out.println(c);
                            System.out.println(cp.findAll().get(pivo1).getRespuesta_Correcta());
                            if (c.trim().equals(cp.findAll().get(pivo1).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo1++;
                        }

                        if (d.equals("null")) {

                        } else {
                            System.out.println(d);
                            System.out.println(cp.findAll().get(pivo1).getRespuesta_Correcta());
                            if (d.trim().equals(cp.findAll().get(pivo1).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo1++;
                        }

                        System.out.println("-----------------------");
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(d);
                        System.out.println("-----------------------");

                    }
                }

            }

            if (temp.equals("Analisis de señales")) {

                for (int i = 0; i < cr.findAll().size(); i++) {

                    String temp1 = "A)" + i;
                    String temp2 = "B)" + i;
                    String temp3 = "C)" + i;
                    String temp4 = "D)" + i;

                    String a = request.getParameter(temp1);
                    String b = request.getParameter(temp2);
                    String c = request.getParameter(temp3);
                    String d = request.getParameter(temp4);

                    if (a == null) {
                        a = "null";
                    }

                    if (b == null) {
                        b = "null";
                    }

                    if (c == null) {
                        c = "null";
                    }
                    if (d == null) {
                        d = "null";
                    }
                    if (a.equals("null") && b.equals("null") && c.equals("null") && d.equals("null")) {

                    } else {

                        if (a.equals("null")) {

                        } else {
                            System.out.println(a);
                            System.out.println(cp.findAll().get(pivo2).getRespuesta_Correcta());

                            if (a.trim().equals(cp.findAll().get(pivo2).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo2++;
                        }

                        if (b.equals("null")) {

                        } else {
                            System.out.println(b);
                            System.out.println(cp.findAll().get(pivo2).getRespuesta_Correcta());
                            if (b.trim().equals(cp.findAll().get(pivo2).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo2++;
                        }

                        if (c.equals("null")) {

                        } else {
                            System.out.println(c);
                            System.out.println(cp.findAll().get(pivo2).getRespuesta_Correcta());
                            if (c.trim().equals(cp.findAll().get(pivo2).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo2++;
                        }

                        if (d.equals("null")) {

                        } else {
                            System.out.println(d);
                            System.out.println(cp.findAll().get(pivo2).getRespuesta_Correcta());
                            if (d.trim().equals(cp.findAll().get(pivo2).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo2++;
                        }

                        System.out.println("-----------------------");
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(d);
                        System.out.println("-----------------------");

                    }
                }

            }

            if (temp.equals("Fisica mecanica")) {

                for (int i = 0; i < cr.findAll().size(); i++) {

                    String temp1 = "A)" + i;
                    String temp2 = "B)" + i;
                    String temp3 = "C)" + i;
                    String temp4 = "D)" + i;

                    String a = request.getParameter(temp1);
                    String b = request.getParameter(temp2);
                    String c = request.getParameter(temp3);
                    String d = request.getParameter(temp4);

                    if (a == null) {
                        a = "null";
                    }

                    if (b == null) {
                        b = "null";
                    }

                    if (c == null) {
                        c = "null";
                    }
                    if (d == null) {
                        d = "null";
                    }
                    if (a.equals("null") && b.equals("null") && c.equals("null") && d.equals("null")) {

                    } else {

                        if (a.equals("null")) {

                        } else {
                            System.out.println(a);
                            System.out.println(cp.findAll().get(pivo3).getRespuesta_Correcta());

                            if (a.trim().equals(cp.findAll().get(pivo3).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo3++;
                        }

                        if (b.equals("null")) {

                        } else {
                            System.out.println(b);
                            System.out.println(cp.findAll().get(pivo3).getRespuesta_Correcta());
                            if (b.trim().equals(cp.findAll().get(pivo3).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo3++;
                        }

                        if (c.equals("null")) {

                        } else {
                            System.out.println(c);
                            System.out.println(cp.findAll().get(pivo3).getRespuesta_Correcta());
                            if (c.trim().equals(cp.findAll().get(pivo3).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo3++;
                        }

                        if (d.equals("null")) {

                        } else {
                            System.out.println(d);
                            System.out.println(cp.findAll().get(pivo3).getRespuesta_Correcta());
                            if (d.trim().equals(cp.findAll().get(pivo3).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo3++;
                        }

                        System.out.println("-----------------------");
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(d);
                        System.out.println("-----------------------");

                    }
                }

            }

            if (temp.equals("Digitales")) {

                for (int i = 0; i < cr.findAll().size(); i++) {

                    String temp1 = "A)" + i;
                    String temp2 = "B)" + i;
                    String temp3 = "C)" + i;
                    String temp4 = "D)" + i;

                    String a = request.getParameter(temp1);
                    String b = request.getParameter(temp2);
                    String c = request.getParameter(temp3);
                    String d = request.getParameter(temp4);

                    if (a == null) {
                        a = "null";
                    }

                    if (b == null) {
                        b = "null";
                    }

                    if (c == null) {
                        c = "null";
                    }
                    if (d == null) {
                        d = "null";
                    }
                    if (a.equals("null") && b.equals("null") && c.equals("null") && d.equals("null")) {

                    } else {

                        if (a.equals("null")) {

                        } else {
                            System.out.println(a);
                            System.out.println(cp.findAll().get(pivo4).getRespuesta_Correcta());

                            if (a.trim().equals(cp.findAll().get(pivo4).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo4++;
                        }

                        if (b.equals("null")) {

                        } else {
                            System.out.println(b);
                            System.out.println(cp.findAll().get(pivo4).getRespuesta_Correcta());
                            if (b.trim().equals(cp.findAll().get(pivo4).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo4++;
                        }

                        if (c.equals("null")) {

                        } else {
                            System.out.println(c);
                            System.out.println(cp.findAll().get(pivo4).getRespuesta_Correcta());
                            if (c.trim().equals(cp.findAll().get(pivo4).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo4++;
                        }

                        if (d.equals("null")) {

                        } else {
                            System.out.println(d);
                            System.out.println(cp.findAll().get(pivo4).getRespuesta_Correcta());
                            if (d.trim().equals(cp.findAll().get(pivo4).getRespuesta_Correcta().trim())) {

                                puntaje++;
                            }
                            pivo4++;
                        }

                        System.out.println("-----------------------");
                        System.out.println(a);
                        System.out.println(b);
                        System.out.println(c);
                        System.out.println(d);
                        System.out.println("-----------------------");

                    }
                }

            }
            System.out.println(puntaje);

            System.out.println("estas en cuestionario");

            String tempcedula1 = misession.getAttribute("cedula_estudiante").toString();
            int tempcedula = Integer.parseInt(tempcedula1);
            Crud_Resultados cresul = new Crud_Resultados();

            if (temp.equals("Bases de datos")) {
                try {
                    Resultados resul1 = new Resultados(1, puntaje, tempcedula);
                    cresul.insert(resul1);
                    request.getRequestDispatcher("/Estudiante.jsp").forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(Cuestionario_Servlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (temp.equals("Analisis de señales")) {
                try {
                    Resultados resul2 = new Resultados(2, puntaje, tempcedula);
                    cresul.insert(resul2);
                    request.getRequestDispatcher("/Estudiante.jsp").forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(Cuestionario_Servlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (temp.equals("Fisica mecanica")) {
                try {
                    Resultados resul3 = new Resultados(3, puntaje, tempcedula);
                    cresul.insert(resul3);
                    request.getRequestDispatcher("/Estudiante.jsp").forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(Cuestionario_Servlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (temp.equals("Digitales")) {
                try {
                    Resultados resul4 = new Resultados(4, puntaje, tempcedula);
                    cresul.insert(resul4);
                    request.getRequestDispatcher("/Estudiante.jsp").forward(request, response);
                } catch (SQLException ex) {
                    Logger.getLogger(Cuestionario_Servlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Cuestionario_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
