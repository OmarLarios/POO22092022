/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author omarl
 */
public class Foco {
    private String color;
    private String tipo;
    private int tam;

    public Foco() {
    }

    public Foco(String color, String tipo, int tam) {
        this.color = color;
        this.tipo = tipo;
        this.tam = tam;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Foco{" + "color=" + color + ", tipo=" + tipo + ", tam=" + tam + '}';
    }
    
    
    
}
