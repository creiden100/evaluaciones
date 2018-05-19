/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author MONSTER
 */
public class Preguntas {

    private int Id_Pregunta;
    private String Contenido;
    private String Respuesta_Correcta;
    private int Id_Examen;

    public Preguntas(String Contenido, String Respuesta_Correcta, int Id_Examen) {
        this.Contenido = Contenido;
        this.Respuesta_Correcta = Respuesta_Correcta;
        this.Id_Examen = Id_Examen;
    }

    public Preguntas() {
    }

    public Preguntas(int Id_Examen) {
        this.Id_Examen = Id_Examen;
    }

    
    public int getId_Pregunta() {
        return Id_Pregunta;
    }

    public void setId_Pregunta(int Id_Pregunta) {
        this.Id_Pregunta = Id_Pregunta;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public String getRespuesta_Correcta() {
        return Respuesta_Correcta;
    }

    public void setRespuesta_Correcta(String Respuesta_Correcta) {
        this.Respuesta_Correcta = Respuesta_Correcta;
    }

    public int getId_Examen() {
        return Id_Examen;
    }

    public void setId_Examen(int Id_Examen) {
        this.Id_Examen = Id_Examen;
    }

}
