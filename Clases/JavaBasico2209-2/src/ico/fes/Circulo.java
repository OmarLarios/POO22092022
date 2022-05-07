/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author omarl
 */
//java bean / POJO es dfi a los EJB enterprise java beans
public class Circulo implements Figuras {
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return Figuras.PI * (this.radio*this.radio);
    }
    /*
    Principio de diseño de l.P: 0,1 e infinito: solo los valores
    0,1 e infinitos son válidos para usarse en la codificación de
    algoritmos. El lenguaje de programación debe proporcionar un
    mecanismo para evitar usar literales numericas en el programa.
    */
    
    
    
}
