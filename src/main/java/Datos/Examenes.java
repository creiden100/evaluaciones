/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


public class Examenes {

    private int Id_examen;
    private String nombre;
    private int Cedula_Profesor;

    public Examenes(String nombre, int Cedula_Profesor) {
        this.nombre = nombre;
        this.Cedula_Profesor = Cedula_Profesor;
    }

    public Examenes() {
    }

    public int getId_examen() {
        return Id_examen;
    }

    public void setId_examen(int Id_examen) {
        this.Id_examen = Id_examen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula_Profesor() {
        return Cedula_Profesor;
    }

    public void setCedula_Profesor(int Cedula_Profesor) {
        this.Cedula_Profesor = Cedula_Profesor;
    }

}
