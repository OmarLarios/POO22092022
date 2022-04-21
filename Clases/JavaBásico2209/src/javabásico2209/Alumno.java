/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabásico2209;

/**
 *
 * @author omarl
 */
public class Alumno {
     private String numCuenta;
     private int semestre;
     private float promedio;

    public Alumno() {
    }

    public Alumno(String numCuenta, int semestre, float promedio) {
        this.numCuenta = numCuenta;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numCuenta=" + numCuenta + ", semestre=" + semestre + ", promedio=" + promedio + '}';
    }
     
    public void estudiar (int minutos){
        System.out.println("Estudiando..." + minutos+ " minutos");
    }
    public String evaluarDesempenio(){
        return this.promedio>8.0f?"sobresaliente":"Regular";
    }
     

   
}
