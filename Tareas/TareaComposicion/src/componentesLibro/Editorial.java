/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentesLibro;

/**
 *
 * @author omarl
 */
public class Editorial {
    private String nombre;
    private String isbn;

    public Editorial() {
    }

    public Editorial(String nombre, String isbn) {
        this.nombre = nombre;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", isbn=" + isbn + '}';
    }
    
    public void distrubir(){
        System.out.println("La editorial " + this.nombre + "está distribuyendo libros");
    }
    
    
}
