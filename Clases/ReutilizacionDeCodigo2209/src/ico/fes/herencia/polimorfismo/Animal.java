/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.polimorfismo;

/**
 *
 * @author omarl
 */
public class Animal {
    private int numPatas;

    public Animal() {
    }

    public Animal(int numPatas) {
        this.numPatas = numPatas;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return "Animal{" + "numPatas=" + numPatas + '}';
    }
    
    public void emitirSonido(){
        System.out.println("Emitiendo sonido...");
    }
}
