/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Usuario
 */
public class Disco {
      private JLabel disco;

    public Disco(int dato) {
        disco = new JLabel();
        if(dato==1){
           disco.setIcon(new ImageIcon("disco.png")); 
        }
        if(dato==2){
            disco.setIcon(new ImageIcon("disco_verde.png"));
        }
        if(dato==3){
           disco.setIcon(new ImageIcon("disco_naranja.png")); 
        }

    }
   
    public JLabel getDisco() {
        return disco;
    }

    public void setDisco(JLabel disco) {
        this.disco = disco;
    }
    
    public void setSize_Ubicacion(int x, int y,int ancho, int alto){
        disco.setBounds(x,y,ancho, alto);
    }
    
   
    
}
