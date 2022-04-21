/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptosbásicos;
import ico.fes.Alumno;
import ico.fes.Automovil;
import ico.fes.Persona;
import ico.fes.silla;
import java.awt.Color;

/**
 *
 * @author omarl
 */
public class ConceptosBásicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola de nuevo");
        silla s1 = new silla(); 
        System.out.println(s1);
        System.out.println(s1.toString());
        
        
        Automovil miBocho= new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);
    Automovil miMustang=new Automovil("Ford", "Mustang", 2010, Color.YELLOW);
        System.out.println(miMustang);
        Automovil miAkura=new Automovil("Akura","N3X",2013, Color.GRAY);
        System.out.println(miAkura);
        
        Persona per1=new Persona();
       // per1.edad=200000; no se permite por seguridad
       per1.setEdad(25);
        System.out.println(per1);
        
        Alumno al = new Alumno();
        al.setNombre("José");
        al.setNumeroCuenta("31912800-2");
        System.out.println(al);
    }
}
