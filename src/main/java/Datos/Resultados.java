/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;


public class Resultados {

    private int id_resultados;
    private int id_examenes;
    private int puntaje;
    private int cedula_estudiante;

    public Resultados(int id_examenes, int puntaje, int cedula_estudiante) {
        this.id_examenes = id_examenes;
        this.puntaje = puntaje;
        this.cedula_estudiante = cedula_estudiante;
    }

    public Resultados() {
    }

    public int getId_resultados() {
        return id_resultados;
    }

    public void setId_resultados(int id_resultados) {
        this.id_resultados = id_resultados;
    }

    public int getId_examenes() {
        return id_examenes;
    }

    public void setId_examenes(int id_examenes) {
        this.id_examenes = id_examenes;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCedula_estudiante() {
        return cedula_estudiante;
    }

    public void setCedula_estudiante(int cedula_estudiante) {
        this.cedula_estudiante = cedula_estudiante;
    }

    
    
}
