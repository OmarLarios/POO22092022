/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omarl
 */

public class Libro {
   private String color;
   private String titulo;
   private String editorial;
   private int numPaginas;
   private int capitulos;
    
   public Libro() {
    }
    
   public Libro(String color, String titulo, String editorial, int numPaginas, int capitulos) {
        this.color = color;
        this.titulo = titulo;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.capitulos = capitulos;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void aventar(){
        System.out.println("El libro " + this.titulo + " lo aventaron");
    }
    
    public void contar(String paginas){
        System.out.println("El libro tiene " + this.numPaginas + paginas);
    }
}
