/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.cifradoC;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author omarl
 */
public class VentanaSwing extends JFrame{
    private JTextField cuadroTexto;
    private JTextField cuadroNum;
    private JButton boton;
    private JLabel resultado;
    private JLabel etiqueta;
    private JLabel etiqueta2; 
    private JLabel etiqueta3;
    
    public VentanaSwing()throws HeadlessException{
        setTitle("Cifrado César");
        setSize(400, 300);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        etiqueta = new JLabel("Ingresa el mensaje");
        cuadroTexto= new JTextField(5);
        etiqueta2 = new JLabel("Tipo de desplazamiento");
        cuadroNum = new JTextField(5);
        
        boton =new JButton();
        boton.setBackground(Color.CYAN);
        boton.setOpaque(true);
        boton.setToolTipText("Click para cifrar");
        etiqueta3 = new JLabel("Texto cifrado: ");
        resultado = new JLabel(" ");
        this.getContentPane().add(etiqueta);
        this.getContentPane().add(cuadroTexto);
        this.getContentPane().add(etiqueta2);
        this.getContentPane().add(cuadroNum);
        this.getContentPane().add(boton);
        this.getContentPane().add(etiqueta3);
        this.getContentPane().add(resultado);  
        this.validate();
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
            
        });
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String lMayus ="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                String lMinus="abcdefghijklmnñopqrstuvwxyz";
                String texto;
                String textoCC;
                int num=0;
                try {
                    texto = cuadroTexto.getText();
                    num = (int) Float.parseFloat(cuadroNum.getText());
                    Cifrado obj = new Cifrado(lMayus,lMinus); 
                    textoCC = obj.cifrar(texto, num);
                    resultado.setText(textoCC);
                    
                } catch (NumberFormatException ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor correcto", "Error de captura", JOptionPane.ERROR_MESSAGE);
                    
                }
               
            }
            
        });
    }
    
    
}

