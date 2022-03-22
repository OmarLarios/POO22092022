/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asus.com;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author omarl
 */
public class Computadora {
    private String modelo;
    private String marca;
    private Monitor pantalla;
    private Mouse raton;
    private Teclado teclado;
    private Procesador cpu;

    public Computadora() {
        pantalla = new Monitor();
        raton= new Mouse();
        teclado= new Teclado();
        cpu= new Procesador();
    }

    public Computadora(String modelo, String marca, Monitor pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        this.modelo = modelo;
        this.marca = marca;
        this.pantalla = pantalla;
        this.raton = raton;
        this.teclado = teclado;
        this.cpu = cpu;
    }

    public Procesador getCpu() {
        return cpu;
    }

    public void setCpu(Procesador cpu) {
        this.cpu = cpu;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Monitor getPantalla() {
        return pantalla;
    }

    public void setPantalla(Monitor pantalla) {
        this.pantalla = pantalla;
    }

    public Mouse getRaton() {
        return raton;
    }

    public void setRaton(Mouse raton) {
        this.raton = raton;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
    /*String estado="Marca: " + this.marca + "\n";
    estado = estado +"Modelo: " + this.modelo + "\n";
    estado = estado + "Ratón: Marca: " + this.raton.getMarca()+", Tipo: " + this.getRaton().getTipo()+"\n";
     return estado;
   */
    return "Computadora{" + "modelo=" + modelo + ", marca=" + marca + ", pantalla=" + pantalla + ", raton=" + raton + ", teclado=" + teclado + ", cpu=" + cpu + '}';
    }
    
    
    
}
