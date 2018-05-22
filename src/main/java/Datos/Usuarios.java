/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


public class Usuarios {

    private int id_usuarios;
    private int cedula_profesor;
    private int cedula_estudiante;
    private String examenes;

    public Usuarios(int cedula_profesor, int cedula_estudiante, String examenes) {
        this.cedula_profesor = cedula_profesor;
        this.cedula_estudiante = cedula_estudiante;
        this.examenes = examenes;
    }

    public Usuarios() {
    }

    public int getId_usuarios() {
        return id_usuarios;
    }

    public void setId_usuarios(int id_usuarios) {
        this.id_usuarios = id_usuarios;
    }

    public int getCedula_profesor() {
        return cedula_profesor;
    }

    public void setCedula_profesor(int cedula_profesor) {
        this.cedula_profesor = cedula_profesor;
    }

    public int getCedula_estudiante() {
        return cedula_estudiante;
    }

    public void setCedula_estudiante(int cedula_estudiante) {
        this.cedula_estudiante = cedula_estudiante;
    }

    public String getExamenes() {
        return examenes;
    }

    public void setExamenes(String examenes) {
        this.examenes = examenes;
    }

}
