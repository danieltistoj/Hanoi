/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Barra {
  private JLabel barra1, barra2, barra3;

  
    public Barra(){
        barra1 = new JLabel();
        barra2 = new JLabel();
        barra3 = new JLabel();
        
        barra1.setIcon(new ImageIcon("barra.png"));
        barra2.setIcon(new ImageIcon("barra.png"));
        barra3.setIcon(new ImageIcon("barra.png"));
        
        barra3.setBounds(1200, 100, 20, 500);
        barra2.setBounds(700, 100, 20, 500);
        barra1.setBounds(200, 100, 20, 500);
    } 
 
    public JLabel getBarra1() {
        return barra1;
    }

    public JLabel getBarra2() {
        return barra2;
    }

    public JLabel getBarra3() {
        return barra3;
    }
 
   
 
  
   
}
