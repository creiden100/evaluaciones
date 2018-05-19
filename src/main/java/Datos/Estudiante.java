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
public class Estudiante {

    private String nombre;
    private String Genero;
    private String Carrera;
    private int Cedula_Estudiante;

    public Estudiante(String nombre, String Genero, String Carrera, int Cedula_Estudiante) {
        this.nombre = nombre;
        this.Genero = Genero;
        this.Carrera = Carrera;
        this.Cedula_Estudiante = Cedula_Estudiante;
    }

    public Estudiante() {
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

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public int getCedula_Estudiante() {
        return Cedula_Estudiante;
    }

    public void setCedula_Estudiante(int Cedula_Estudiante) {
        this.Cedula_Estudiante = Cedula_Estudiante;
    }

}
