/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

/**
 *
 * @author Usuario
 */
public class Pila {
    private Nodo_disco tope;
    private int size=0;
    
    public void Apilar(Nodo_disco nuevo){
        if(Vacia()){
            tope = nuevo;    
        }
        else
        {
            Nodo_disco aux = tope;
            nuevo.setSig(aux);
            tope = nuevo;  
        }
        size++;
    }

    public int getSize() {
        return size;
    }
    
    public void Desapilar(){
        Nodo_disco aux = tope;
        tope = aux.getSig();
        aux =null;
        size--;
    }
    

    public Nodo_disco getTope() {
        return tope;
    }
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
    
}
