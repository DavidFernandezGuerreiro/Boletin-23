
package boletin23.pkg2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author David
 */

//2- Crea unha aplicación con  un marco que ten de título “ CURSO DAM “ e 2 botons: 
//programación e outro bases . Se prememos o botón programación  o titulo do JFrame debe 
//ser  programación  e se prememos bases debe ser bases de datos.
public class Eventos implements ActionListener{
    
    JFrame marco,marco1,marco2;
    JPanel panel;
    JButton boton1,boton2;
    
    public Eventos(){
        marco=new JFrame(" CURSO DAM ");
        panel=new JPanel();
        boton1=new JButton("programación");
        boton2=new JButton("bases");
        
        marco.setSize(400,200);
        panel.add(boton1);
        panel.add(boton2);
        marco.add(panel);
        boton1.addActionListener(this); //Al boton le ponemos un "escuchador".
        boton2.addActionListener(this); //Al boton le ponemos un "escuchador".
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object boton=ae.getSource();
        if(boton==boton1){
            marco.setTitle("PROGRAMACIÓN");
        }else{
            marco.setTitle("BASES DE DATOS");
        }
    }
    
}
