/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.cifradoC;

/**
 *
 * @author omarl
 */
public class Cifrado {
    private String lMayus;
    private String lMinus;

    public Cifrado() {
    }

    public Cifrado(String lMayus, String lMinus) {
        this.lMayus = lMayus;
        this.lMinus = lMinus;
    }
    
    public String cifrar(String texto, int num){
        String salida="";
    
        for(int i=0; i < texto.length(); i++){
            if(this.lMayus.indexOf(texto.charAt(i))!=-1 ||(this.lMinus.indexOf(texto.charAt(i))!=-1)){
            salida += (this.lMayus.indexOf(texto.charAt(i)) != -1) ? this.lMayus.charAt((this.lMayus.indexOf(texto.charAt(i))+num)%this.lMayus.length()):this.lMinus.charAt((this.lMinus.indexOf(texto.charAt(i))+num)%this.lMinus.length());
        }else{
                salida += texto.charAt(i);
            }
        }
        
        
        
        return salida;
    }}
    

