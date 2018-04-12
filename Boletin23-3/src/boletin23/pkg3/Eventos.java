
package boletin23.pkg3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author dfernandezguerreiro
 */

//3- Implementa unha aplicación que teña dous botons co titulo “ saudo “ e “ despedida “,
//de xeito que se prememos  o botón saudo visualicemos  “ un saudo a DAM “ e, se prememos  
//despedida visualicemos “ fin do programa “.
public class Eventos implements ActionListener{
    
    JFrame marco;
    JPanel panel;
    JButton boton1,boton2;
    JLabel jlText;
    
    public Eventos(){
        marco=new JFrame(" Boletin 23 - 3 ");
        panel=new JPanel();
        boton1=new JButton("saudo");
        boton2=new JButton("despedida");
        jlText=new JLabel();
        
        marco.setSize(400,200);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(jlText);
        marco.add(panel);
        boton1.addActionListener(this); //Al boton le ponemos un "escuchador".
        boton2.addActionListener(this); //Al boton le ponemos un "escuchador".
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton=e.getSource();
        if(boton==boton1){
            this.jlText.setVisible(true);
            jlText.setText("un saudo a DAM"); //.setText(): modificamos el texto del JLabel.
        }else{
            this.jlText.setVisible(true);
            jlText.setText("fin do programa"); //.setText(): modificamos el texto del JLabel.
        }
    }
    
}
