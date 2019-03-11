/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import javax.swing.JComboBox;

/**
 *
 * @author Usuario
 */
public class ComboBox {
    private JComboBox combo;
      public ComboBox(){
        combo = new JComboBox();
        combo.setBounds(50, 700, 100, 30);
        combo.addItem("1 disco");
        combo.addItem("2 disco");
        combo.addItem("3 disco");
       
      }

    public JComboBox getCombo() {
        return combo;
    }
      
}
