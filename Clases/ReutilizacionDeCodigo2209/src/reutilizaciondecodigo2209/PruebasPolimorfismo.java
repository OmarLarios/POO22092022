/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reutilizaciondecodigo2209;

import ico.fes.herencia.Alumno;
import ico.fes.herencia.Persona;

/**
 *
 * @author omarl
 */
public class PruebasPolimorfismo {
    public static void main(String[] args) {
        System.out.println("hola polimorfismo");
        Persona per1=new Persona();
        per1.setNombre("Omar");
        per1.dormir();
        
        Alumno alu1= new Alumno();
        alu1.setNombre("Emilio");
        alu1.dormir();
        alu1.dormir(4);
    }
}
