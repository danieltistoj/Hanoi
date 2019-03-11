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
    private Nodo_disco tope=null;
    private int size=0;
    
    public void Apilar(Disco disco, int tamano){
        Nodo_disco nuevo = new Nodo_disco();
        nuevo.setSize(tamano);
        nuevo.setDisco(disco);
        if(Vacia()){
            tope = nuevo;
            nuevo.setSize(3);
        }
        else
        {
            int valor = tope.getSize()-1;
            Nodo_disco aux = tope;
            nuevo.setSig(aux);
            tope = nuevo;
            nuevo.setSize(valor);
            
        }
        size++;
    }

    public int getSize() {
        return size;
    }
    
    public void Desapilar(){
        Nodo_disco aux = tope;
        aux.setDisco(null);
        tope = aux.getSig();
        aux =null;
    }
    

    public Nodo_disco getTope() {
        return tope;
    }
    public boolean Vacia(){
        return(tope==null)?true:false;
    }
    
}
