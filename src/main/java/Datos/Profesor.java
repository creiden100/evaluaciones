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
public class Profesor {

    private String nombre;
    private String Genero;
    private String Profesion;
    private int Cedula_Profesor;

    public Profesor(String nombre, String Genero, String Profesion, int Cedula_Profesor) {
        this.nombre = nombre;
        this.Genero = Genero;
        this.Profesion = Profesion;
        this.Cedula_Profesor = Cedula_Profesor;
    }

    public Profesor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }

    public int getCedula_Profesor() {
        return Cedula_Profesor;
    }

    public void setCedula_Profesor(int Cedula_Profesor) {
        this.Cedula_Profesor = Cedula_Profesor;
    }

}
