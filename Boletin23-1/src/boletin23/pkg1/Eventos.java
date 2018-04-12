
package boletin23.pkg1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dfernandezguerreiro
 */

// 1- Crear  unha aplicación gui que teña un botón “ premer “ e visualice a etiqueta  premiches o botón.
public class Eventos implements ActionListener {
    
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel jlEtiqueta;
    
    public Eventos(){
        marco=new JFrame(" BOTON PREMER ");
        panel=new JPanel();
        boton=new JButton("boton");
        jlEtiqueta=new JLabel("Premiches o botón");
        
        marco.setSize(400,200);
        panel.add(boton);
        marco.add(panel);
        
        boton.addActionListener(this);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.add(jlEtiqueta);
        marco.setVisible(true);
    }
    
}
