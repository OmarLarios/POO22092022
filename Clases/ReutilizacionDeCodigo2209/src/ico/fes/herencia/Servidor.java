/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

import Asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;

/**
 *
 * @author omarl
 */
public class Servidor extends Computadora{
    private int numFuentesPoder;
    private int numTarjetasRed;
    private int TipoRaid;

    public Servidor() {
    }

    public Servidor(int numFuentesPoder, int numTarjetasRed, int TipoRaid) {
        this.numFuentesPoder = numFuentesPoder;
        this.numTarjetasRed = numTarjetasRed;
        this.TipoRaid = TipoRaid;
    }

    public Servidor(int numFuentesPoder, int numTarjetasRed, int TipoRaid, String modelo, String marca, Monitor pantalla, Mouse raton, Teclado teclado, Procesador cpu) {
        super(modelo, marca, pantalla, raton, teclado, cpu);
        this.numFuentesPoder = numFuentesPoder;
        this.numTarjetasRed = numTarjetasRed;
        this.TipoRaid = TipoRaid;
    }

    public int getTipoRaid() {
        return TipoRaid;
    }

    public void setTipoRaid(int TipoRaid) {
        this.TipoRaid = TipoRaid;
    }

    public int getNumFuentesPoder() {
        return numFuentesPoder;
    }

    public void setNumFuentesPoder(int numFuentesPoder) {
        this.numFuentesPoder = numFuentesPoder;
    }

    public int getNumTarjetasRed() {
        return numTarjetasRed;
    }

    public void setNumTarjetasRed(int numTarjetasRed) {
        this.numTarjetasRed = numTarjetasRed;
    }

    @Override
    public String toString() {
        return super.toString() + "Servidor{" + "numFuentesPoder=" + numFuentesPoder + ", numTarjetasRed=" + numTarjetasRed + ", TipoRaid=" + TipoRaid + '}';
    }
    
    
    
    
}
