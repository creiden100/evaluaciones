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
public class Respuestas {

    private int Id_Respuesta;
    private String Contenido;
    private int Id_pregunta;

    public Respuestas(String Contenido, int Id_pregunta) {
        this.Contenido = Contenido;
        this.Id_pregunta = Id_pregunta;
    }

    public Respuestas() {
    }

    public int getId_Respuesta() {
        return Id_Respuesta;
    }

    public void setId_Respuesta(int Id_Respuesta) {
        this.Id_Respuesta = Id_Respuesta;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String Contenido) {
        this.Contenido = Contenido;
    }

    public int getId_pregunta() {
        return Id_pregunta;
    }

    public void setId_pregunta(int Id_pregunta) {
        this.Id_pregunta = Id_pregunta;
    }

}
