/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author omarl
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista,Artista{
    private String carrera;
    private String numCta;
    private String disciplinaDeportiva;
    private String generoArtistico;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numCta, String disciplinaDeportiva, String géneroArtistico) {
        this.carrera = carrera;
        this.numCta = numCta;
        this.disciplinaDeportiva = disciplinaDeportiva;
        this.generoArtistico = géneroArtistico;
    }

    public String getGéneroArtistico() {
        return generoArtistico;
    }

    public void setGéneroArtistico(String géneroArtistico) {
        this.generoArtistico = géneroArtistico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumCta() {
        return numCta;
    }

    public void setNumCta(String numCta) {
        this.numCta = numCta;
    }

    public String getDisciplinaDeportiva() {
        return disciplinaDeportiva;
    }

    public void setDisciplinaDeportiva(String disciplinaDeportiva) {
        this.disciplinaDeportiva = disciplinaDeportiva;
    }

    @Override
    public String toString() {
        return "EstudianteDeportistaArtista{" + "carrera=" + carrera + ", numCta=" + numCta + ", disciplinaDeportiva=" + disciplinaDeportiva + ", generoArtistico=" + generoArtistico + '}';
    }

    @Override
    public void entrenar() {
        System.out.println(this.nombre+" está entrenando "+this.disciplinaDeportiva);
    }

    @Override
    public void jugar() {
        System.out.println(this.nombre+" está jugando "+this.disciplinaDeportiva);
         }

    @Override
    public void ensayar() {
        System.out.println(this.nombre+" está ensyannado "+this.generoArtistico);
    }

    @Override
    public void presentar() {
        System.out.println(this.nombre+ " esta presentando su obra de "+this.generoArtistico);
    }
    
    
}
