/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import javax.swing.JLabel;

public class Nodo_disco {
    private Nodo_disco Sig;
    private Disco disco;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Nodo_disco getSig() {
        return Sig;
    }

    public void setSig(Nodo_disco Sig) {
        this.Sig = Sig;
    }

    public Disco getDisco() {
        return disco;
    }

    public void setDisco(Disco disco) {
        this.disco = disco;
    }
    
}
