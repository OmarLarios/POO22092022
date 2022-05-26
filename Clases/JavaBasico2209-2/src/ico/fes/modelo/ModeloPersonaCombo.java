/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.modelo;

import ico.fes.db.PersonaDAO;
import ico.fes.herencia.Persona;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
import org.sqlite.SQLiteException;

/**
 *
 * @author omarl
 */
public class ModeloPersonaCombo implements ComboBoxModel<Persona>{
    private ArrayList<Persona> datos;
    private Persona selected;

    public ModeloPersonaCombo() {
    }

    public ModeloPersonaCombo(ArrayList datos, Persona selected) {
        this.datos = datos;
        this.selected = selected;
    }

    public ArrayList getDatos() {
        return datos;
    }

    public void setDatos(ArrayList datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.selected = (Persona)anItem;  //convertir el objeto a tipo persona
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
       //regresara el numero de elementos a mostrar
        return datos.size();  //tamaño del arraylist de acuerdo a los datos
    }

    @Override
    public Persona getElementAt(int index) {
        //regresara un objeto de tipo persona 
        return datos.get(index);
        
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
   
    }
    
    public void consultarBaseDatos(){
          //simular una consulta a una bd
        PersonaDAO pdao=new PersonaDAO();
        
        try {
            datos=pdao.obtenerTodo();
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        }
      
    }
   
    public void agregarPersona(Persona p){
        try {
            //insert a BD...
            PersonaDAO pdao = new PersonaDAO();
            datos.add(p);
            pdao.insertar(p);
        } catch (SQLiteException ex) {
            ex.printStackTrace();
        }
    }
    
}
