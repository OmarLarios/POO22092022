/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentesPelícula;

/**
 *
 * @author omarl
 */
public class Productora {
    private String nombreProdcutora;
    private String genero;

    public Productora() {
    }

    public Productora(String nombreProdcutora, String genero) {
        this.nombreProdcutora = nombreProdcutora;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombreProdcutora() {
        return nombreProdcutora;
    }

    public void setNombreProdcutora(String nombreProdcutora) {
        this.nombreProdcutora = nombreProdcutora;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombreProdcutora = " + nombreProdcutora + ", genero = " + genero + '}';
    }
    
    public void producir(){
        System.out.println("La productora " + this.nombreProdcutora + "está empezando la producción ");
    }
}
