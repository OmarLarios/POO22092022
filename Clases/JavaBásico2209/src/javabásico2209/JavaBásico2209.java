/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabásico2209;

import javax.swing.JOptionPane;

/**
 *
 * @author omarl
 */
public class JavaBásico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 19;
        System.out.println("Edad = " + edad );
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double x = edad2.doubleValue(); //lo convierte en decimal
        System.out.println(x);
        System.out.println(edad2.shortValue());   //ocupa la mitad de espacio en memora
        System.out.println("--------------------------");
        
        //convertir string a entero
        
        String cadena="99";
        int altura = Integer.parseInt(cadena);   //método miembro o método de clase
        altura=altura+1;
        System.out.println("Altura= " + altura);
        
        Float y= Float.parseFloat(cadena);
        y= y+0.5f;
        System.out.println("Altura= "+ y);
        
        System.out.println("--------------------------");
        
        Arbol tree1 = new Arbol(2.4f, 15);
        System.out.println(tree1);
        
        System.out.println("Troncos de un árbol =" + Arbol.tronco);
        Arbol.generarOxígeno();
        //un atributo de clase o metodo de clase (elementos miembro) son identificadores que almacenan un valor constante o un comportamineto constante igual para todos los objetos de la misma. Al ser constantes no es necesario crear una instancia (objeto) para acceder a ellos.
        
        /*JOptionPane.showMessageDialog(null, "Hello world", "tituo", JOptionPane.INFORMATION_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);*/
        
        //Código sin operador ternario
        int edad3=20;
        String resultado = "";
        if(edad3<18){
            resultado = "Menor de edad";
        }else{
            resultado = "Mayor de edad, ten un tequila para la garganta";
        }
        System.out.println(resultado);
        
        // mismo codigo pero con operador ternario
        int edad4=15;
        String res="";
        res = edad4 < 18? "Menor de edad edad 4": "Mayor de edad, tequila";
        System.out.println(res);
        
        int edad5 = 19;
        System.out.println( edad5 < 18? "Menor de edad 5":"Ya, el tequila");
        
        
        int val1 = 1;
        int val2 = 5;
        //comparacion or a nivel de bits es dcer
        System.out.println(val1 | val2);
        
        int val3=1; // 0000...0001
        int val4=0;
        val4=val3<<2;
        System.out.println(val4);
       
        System.out.println("-----ARREGLOS-------");
        
        int[] edades; //primero se declara que es un arreglo
                      // en este punto aun no se reserva memoria
                      // 2do paso es reservarlo de un tamaño especifico
        edades= new int[5];
        System.out.println(edades);
        edades[0] = 10;
        System.out.println("La primera edad es: "+edades[0]);
        
        //declarar e inicializar en una sola línea
        
        int []estaturas = new int[5];
        int[]pesos= {86,99,56,76,77}; //en kilos
        System.out.println(pesos[0]); 
        System.out.println(pesos[1]);
        System.out.println(pesos[2]);
        System.out.println(pesos[3]);
        System.out.println(pesos[4]);
        
        System.out.println(" For");
        for(int i=0;i<pesos.length; i++){
            System.out.println(pesos[i]);
        }
        System.out.println(" ejercicio ");
        for(int i=pesos.length-1;i>=0; i--){
            System.out.println(pesos[i]);
        }
        
        System.out.println("--------Arreglo de alumnos------");
        Alumno[]lista=new Alumno[5];  // 5 alumnos
        lista[0]=new Alumno("99999",2,9.0f);
        lista[1]=new Alumno("77777",2,7.0f);
        lista[2]=new Alumno("55555",2,7.0f);
        lista[3]=new Alumno("88888",2,8.0f);
        lista[4]=new Alumno("66666",2,6.0f);
        
        for (int i = 0; i < lista.length; i++) {    //fori + tab
            Alumno alumno = lista[i];
            System.out.println(alumno.evaluarDesempenio());
        }
        
        /*For each es un FOR especial, introducido
        en la version 2 de java, esa version fue la que sufrio cambios muy grandes
        El for each fue introducido para simplificar los 
        for con arreglos
        
        */
        System.out.println("Con for each");
        for (Alumno alumno : lista) {
            System.out.println(alumno.evaluarDesempenio());
            
        }
        
        
    }
    
}
