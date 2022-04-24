/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacuentahabiente;

/**
 *
 * @author omarl
 */
public class PruebaEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  /*Se debe crear un arreglo de 5 cuentahabientes 
    con datos de ejemplo y con un FOR EACH deben 
    mostrar quien es Premium y quien es Regular*/  
        
     Cuentahabiente[] cuenta= new Cuentahabiente[5];
     cuenta[0]=new Cuentahabiente(555881885, "Juan perez", 19570.09f);
     cuenta[1]=new Cuentahabiente(125562964, "Omar Larios", 110250.69f);
     cuenta[2]=new Cuentahabiente(451156884, "Danna Flores", 91092.00f);
     cuenta[3]=new Cuentahabiente(516545118, "Karen Gutierrez", 23050.50f);
     cuenta[4]=new Cuentahabiente(515304238, "Ernesto Juarez", 79859.85f);
    
        for (Cuentahabiente cuentahabiente : cuenta) {
            System.out.println(cuentahabiente.evaluarNivelCliente());
        }
        
        System.out.println("\n-------------------------------------Ejemplo Retiro cuenta-------------------------------------\n");
    System.out.println(cuenta[3]);
    cuenta[3].retirarDinero(2000);
        System.out.println(cuenta[3]);
        
    }
    
}
