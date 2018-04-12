
package boletin23.pkg4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dfernandezguerreiro
 */

//4- Implementa unha aplicación  que teña 2 ventás .Na ventá 1 poñedes un boton, 
//de xeito que se o prememos activa a ventá  2.
public class Eventos implements ActionListener{
    
    JFrame marco,marco2;
    JPanel panel;
    JButton boton;
    
    public Eventos(){
        marco=new JFrame(" Boletin 23 - 4 ");
        panel=new JPanel();
        boton=new JButton("boton");
        
        marco.setSize(400,200);
        panel.add(boton);
        marco.add(panel);
        boton.addActionListener(this); //Al boton le ponemos un "escuchador".
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        marco2=new JFrame(" VENTANA 2 ");
        marco2.setSize(400,200);
        
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setVisible(true);
    }
    
    
    
}
