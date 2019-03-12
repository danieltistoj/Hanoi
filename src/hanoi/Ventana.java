/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Ventana {
     JFrame ventana;
     JPanel panel;
     JButton boton_iniciar=new JButton("Iniciar"); 
     JButton boton_salir = new JButton("Salir");
     JButton boton_barra2, boton_barra3, boton_barra1,boton_barra3_2,boton_barra1_3,boton_barra2_3;
     
     JLabel texto1, texto2, texto3, texto4, prueba;
       Pila pila_barra1 = new Pila();
       Pila pila_barra2 = new Pila();
       Pila pila_barra3 = new Pila();
       int inicio;
         
     public Ventana(){
        
        ventana = new JFrame();
        panel=new JPanel();
        Barra barra = new Barra();//barras 
        ComboBox combo = new ComboBox();//objeto combobox
        boton_iniciar.setBounds(670, 700, 100, 30);
        boton_salir.setBounds(1160, 700, 100, 30);
        boton_barra2 = new JButton("Barra2");//boton para mover a la barra 2 de la barra 1
        boton_barra2.setBounds(60, 620, 80, 30);
        boton_barra3 = new JButton("Barra3");//boton para mover a la barra 3 de la barra 1
        boton_barra3.setBounds(280, 620, 80, 30);
        boton_barra1 = new JButton("Barra1");//boton para mover a la barra 1 de la barra 2
        boton_barra1.setBounds(550, 620, 80, 30);
        boton_barra3_2 = new JButton("Barra3");//boton para mover a la barra 3 de la barra 2
        boton_barra3_2.setBounds(800, 620, 80, 30);
        boton_barra1_3 = new JButton("Barra1");//boton para mover a la barra 1 de la barra 3
        boton_barra1_3.setBounds(1050, 620, 80, 30);
        boton_barra2_3 = new JButton("Barra2");//boton para mover a al barra 2 de la barra 3
        boton_barra2_3.setBounds(1290, 620, 80, 30);
        
        
        prueba = new JLabel();
        texto1 = new JLabel();
        texto2 = new JLabel();
        texto3 = new JLabel();
        texto4 = new JLabel();
        
        texto2.setText("Barra 1");
        texto2.setBounds(195, 50, 100, 30);
        
        texto3.setText("Barra 2");
        texto3.setBounds(700, 50, 100, 30);
        
        texto4.setText("Barra 3");
        texto4.setBounds(1200, 50, 100, 30);
        
        texto1.setText("Numero de discos");
        texto1.setBounds(200, 700, 200, 30);
        //ventana
        ventana.setTitle("Hanoi");
        ventana.setSize(1500, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);
        ventana.setResizable(false);
        //caracteristicas panel........
        panel.setSize(ventana.getSize());
        panel.setLayout(null);
        //............................
        //ingresar opciones a panel.................
        panel.add(barra.getBarra3());
        panel.add(barra.getBarra1());
        panel.add(barra.getBarra2());
        panel.add(combo.getCombo());//ingresar el combobox
        panel.add(boton_iniciar);
        panel.add(boton_salir);
        panel.add(texto1);
        panel.add(texto2);
        panel.add(texto3);
        panel.add(texto4);
        panel.add(prueba);
        panel.add(boton_barra2);
        panel.add(boton_barra3);
        panel.add(boton_barra1);
        panel.add(boton_barra3_2);
        panel.add(boton_barra1_3);
        panel.add(boton_barra2_3);
        //........................................
        int x=60 ,y=570, ancho=300, alto=30, altura_P2=530, altura_P3=485, altura_p1=570;
        //accion boton iniciar....
        boton_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               
               if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="1 disco"){
                   Nodo_disco nodo = new Nodo_disco();
                  Disco disco = new Disco(1);
                  disco.setSize_Ubicacion(x,y,ancho,alto); 
                  nodo.setDisco(disco);
                  nodo.setSize(3);
                  pila_barra1.Apilar(nodo);
                  panel.add(disco.getDisco());
                  panel.add(barra.getBarra1());
                  panel.repaint();
                  inicio=1;
                  
               }
               if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="2 disco"){
                   int conta=0;
                   while(conta<2){
                      Nodo_disco nodo = new Nodo_disco();
                       if(conta==0){
                  Disco disco = new Disco(1);
                  disco.setSize_Ubicacion(x,y,ancho,alto); 
                  nodo.setDisco(disco);
                  nodo.setSize(3);
                  pila_barra1.Apilar(nodo);
                  panel.add(disco.getDisco());
                  panel.add(barra.getBarra1());
                  panel.repaint();  
                       }
                       if(conta==1){
                  Disco disco = new Disco(2);
                  disco.setSize_Ubicacion(x+30,y-40,ancho-50,alto); 
                  nodo.setDisco(disco);
                  nodo.setSize(2);
                  pila_barra1.Apilar(nodo);
                  panel.add(disco.getDisco());
                  panel.add(barra.getBarra1());
                  panel.repaint();
                           
                       }
                
                       conta++;
                   }
                   inicio=2;
                   
               }
               
               if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="3 disco"){
                   int conta=0;
                   while(conta<3){
                    Nodo_disco nodo = new Nodo_disco();
                        if(conta==0){
                  Disco disco = new Disco(1);
                  disco.setSize_Ubicacion(x,y,ancho,alto); 
                  nodo.setDisco(disco);
                  nodo.setSize(3);
                  pila_barra1.Apilar(nodo);
                  panel.add(disco.getDisco());
                  panel.add(barra.getBarra1());
                  panel.repaint();  
                       }
                       if(conta==1){
                  Disco disco = new Disco(2);
                  disco.setSize_Ubicacion(x+30,y-40,ancho-50,alto); 
                  nodo.setDisco(disco);
                  nodo.setSize(2);
                  pila_barra1.Apilar(nodo);
                  panel.add(disco.getDisco());
                  panel.add(barra.getBarra1());
                  panel.repaint();
                           
                       }
                       if(conta==2){
                  Disco disco = new Disco(3);
                  disco.setSize_Ubicacion(x+60,y-85,ancho-100,alto); 
                  nodo.setDisco(disco);
                  nodo.setSize(1);
                  pila_barra1.Apilar(nodo);
                  panel.add(disco.getDisco());
                  panel.add(barra.getBarra1());
                  panel.repaint();
                            
                       }
                       conta++;
                   }
                   inicio=3;
               }
            }
        });
        //...................................................................
        //accion salir boton salir 
        boton_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //........................................
        //***ACCIONES DE LA BARRA 1 BOTONES PARA MOVER A LA BARRA 2 Y 3***
        //boton mover a al barra 2 de la barra 1......
        boton_barra2.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                int ancho,alto,size,x,y;
               
          if(pila_barra1.Vacia()!=true){// ve primero si la barra 1 tiene discos o no.
               Nodo_disco nodo = new Nodo_disco();
              ancho=pila_barra1.getTope().getDisco().getDisco().getWidth();
              alto=pila_barra1.getTope().getDisco().getDisco().getHeight();
              size = pila_barra1.getTope().getSize();
              if(pila_barra2.Vacia()){ //si la barra dos esta basia...       
              if(size==3){
                   panel.remove(pila_barra1.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra1.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(1);
                   disco1.setSize_Ubicacion(550, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(3);
                   pila_barra2.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra2());
              }
              if(size==2){
                  
                   panel.remove(pila_barra1.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra1.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(570, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra2.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra2());      
              }
              
              if(size==1){
                   panel.remove(pila_barra1.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra1.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(600, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra2.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra2());
                   
                  
              }
                 panel.repaint();
                }//fin condicion 2
              
              
                                              }//fin condicion 1
            }
        });
        //................................................................
        //boton mover a la barra 3 de la barra 1.....................
        boton_barra3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           if(pila_barra1.Vacia()!=true){//condicion 1
                if(pila_barra3.Vacia()){  //nueve el disco a la barra 3 solo si esta esta vacia
              int size,ancho,alto;
              ancho=pila_barra1.getTope().getDisco().getDisco().getWidth();
              alto=pila_barra1.getTope().getDisco().getDisco().getHeight();
              size = pila_barra1.getTope().getSize();
              Nodo_disco nodo = new Nodo_disco();            
              if(size==3){
                   panel.remove(pila_barra1.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra1.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(1);
                   disco1.setSize_Ubicacion(1050, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(3);
                   pila_barra3.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra3());
              
              }
              if(size==2){
                  
                   panel.remove(pila_barra1.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra1.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(1090, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra3.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra3()); 
                  
              }
              
              if(size==1){
                   panel.remove(pila_barra1.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra1.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(1100, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra3.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra3());
                  
              }
             panel.repaint();
                }//fin condicion2
                }//fin condicion1
               
            }
        });
        //***ACCIONES DE LA BARRA 2 BOTONES PARA MOVER A LA BARRA 1 Y 2***
        //boton mover a a la barra 1 de la barra 2. accion.....
        boton_barra1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ancho,alto,size;
                if(pila_barra2.Vacia()!=true){//condicion 1
              ancho=pila_barra2.getTope().getDisco().getDisco().getWidth();
              alto=pila_barra2.getTope().getDisco().getDisco().getHeight();
              size = pila_barra2.getTope().getSize();
              Nodo_disco nodo = new Nodo_disco();
                    if(pila_barra1.Vacia()){//mueve el disco a la barra 1 solo si esta esta vacia!
              if(size==3){
                  
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(1);
                   disco1.setSize_Ubicacion(60, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(3);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1());  

                  
              }
              if(size==2){
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(90, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1()); 
              }
              if(size==1){
                  panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(120, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1());    
              }
                    panel.repaint();   
                    }//fin de la condicion 2
                    
                    else{//si la barra uno no esta vacia !!!!!!!!*---
                        int size_discoB3=pila_barra1.getTope().getSize();
                        int size_pila = pila_barra1.getSize();
                        if(size<size_discoB3){
                            if(size_pila==1){//si la barra tres solo tiene un disco
                                if(size==2){
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(90, altura_P2, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1());
                  
                                }
                                if(size==1){
                                    
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(120, altura_P2, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1()); 
                                
                                }
                                panel.repaint(); 
                            }//fin de la condicion si la barra 1 solo tiene un disco
                            if(size_pila==2){                 
                        if(size==1){//se crea el disco segun el tamano que tenga
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(120, altura_P3, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1()); 
                                   }
                                   if(size==2){
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(90, altura_P3, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1()); 
                                       
                                   }
                                
                                panel.repaint();
                            }
                            
                        }
                        else{
                            System.out.println("disco pila 2 mayor al de pila 3");
                        }
                    }
                    
                                 
                }//fin condicion 1
                else{
                    System.out.println("vacia");
                }
            }//fin de action performed
        });//fin de la accio del boton....
        
        //boton mover a la barra 3 de la barra 2.........................
        boton_barra3_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int ancho,alto,size;
                if(pila_barra2.Vacia()!=true){
              ancho=pila_barra2.getTope().getDisco().getDisco().getWidth();
              alto=pila_barra2.getTope().getDisco().getDisco().getHeight();
              size = pila_barra2.getTope().getSize();
              Nodo_disco nodo = new Nodo_disco();
                    if(pila_barra3.Vacia()){

             
              if(size==3){
                  
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(1);
                   disco1.setSize_Ubicacion(1050, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(3);
                   pila_barra3.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra3());  

                  
              }
              if(size==2){
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(1090, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra3.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra3()); 
              }
              if(size==1){
                  panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(1100, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra3.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra3());    
              }
                    panel.repaint();   

                        
                    }
                    else{//si la barra tres no esta vacia
                        int size_discoB3=pila_barra3.getTope().getSize();
                        int size_pila = pila_barra3.getSize();
                        if(size<size_discoB3){
                            if(size_pila==1){//si la barra tres solo tiene un disco
                                if(size==2){
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(1090, altura_P2, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra3.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra3());
                  
                                }
                                if(size==1){
                                    
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(1100, altura_P2, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra3.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra3()); 
                                
                                }
                                panel.repaint(); 
                            }//fin de la condicion si la barra 3 solo tiene un disco
                            if(size_pila==2){
                                
                                
                        if(size==1){//se crea el disco segun el tamano que tenga
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(1100, altura_P3, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra3.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra3()); 
                                   }
                                   if(size==2){
                   panel.remove(pila_barra2.getTope().getDisco().getDisco());
                   pila_barra2.Desapilar();
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(1090, altura_P3, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra3.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra3()); 
                                       
                                   }
                                
                                panel.repaint();
                            }
                            
                        }
                        else{
                            System.out.println("disco pila 2 mayor al de pila 3");
                        }
                    }
                   
                        
                    
            }//fin de la condicion si pila 2 esta vacia 
                else{
                    System.out.println("vacia");
                }
            }
        });//fin del boton**/*/*/*/*
        
        //***ACCIONES DE LA BARRA 3 BOTONES PARA MOVER A LA BARRA 1 Y 2***
        //boton para pasar a la barra 1...
       boton_barra1_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                  int ancho,alto,size,x,y;
               
          if(pila_barra3.Vacia()!=true){// ve primero si la barra 1 tiene discos o no.
               Nodo_disco nodo = new Nodo_disco();
              ancho=pila_barra3.getTope().getDisco().getDisco().getWidth();
              alto=pila_barra3.getTope().getDisco().getDisco().getHeight();
              size = pila_barra3.getTope().getSize();
              if(pila_barra1.Vacia()){ //si la barra dos esta basia...       
              if(size==3){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra3.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(1);
                   disco1.setSize_Ubicacion(60, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(3);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1());
              }
              if(size==2){
                  
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra3.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(90, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1());      
              }
              
              if(size==1){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra3.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(120, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1());
                   
                  
              }
                 panel.repaint();
                }//fin condicion 2
              else{//si la barra no esta vacia...
                   int size_discoB1=pila_barra1.getTope().getSize();
                   int size_pila = pila_barra1.getSize();
                   if(size<size_discoB1){
                       if(size_pila==1){//altura_p2
                          if(size==2){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());
                   pila_barra3.Desapilar();
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(90, altura_P2, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1());
                          } 
                          
                          if(size==1){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());
                   pila_barra3.Desapilar();
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(120, altura_P2, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1()); 
                              
                          }
                          
                          panel.repaint();
                       }
                       if(size_pila==2){//si la pila tiene dos discos altura_p3
                           
                             if(size==2){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());
                   pila_barra3.Desapilar();
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(90, altura_P3, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1());
                          } 
                          
                          if(size==1){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());
                   pila_barra3.Desapilar();
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(120, altura_P3, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra1.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra1()); 
                              
                          }
                          
                          panel.repaint();                           
                       }
                   }
              }
              
                    }//fin condicion 1
                
                
                
                
            }
        });//fin del boton 1 de la barra 3
       
       //boton mover a la barra 2
       boton_barra2_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                  int ancho,alto,size,x,y;
               
          if(pila_barra3.Vacia()!=true){// ve primero si la barra 1 tiene discos o no.
               Nodo_disco nodo = new Nodo_disco();
              ancho=pila_barra3.getTope().getDisco().getDisco().getWidth();
              alto=pila_barra3.getTope().getDisco().getDisco().getHeight();
              size = pila_barra3.getTope().getSize();
              if(pila_barra2.Vacia()){ //si la barra dos esta basia...       
              if(size==3){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra3.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(1);
                   disco1.setSize_Ubicacion(550, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(3);
                   pila_barra2.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra2());
              }
              if(size==2){
                  
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra3.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(570, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra2.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra2());      
              }
              
              if(size==1){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());//esta funcion es para que el label no sea visible en el panel
                   pila_barra3.Desapilar();//luego se elimina el nodo que contiene a label con desapilar
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(600, 570, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra2.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra2());
                   
                  
              }
                 panel.repaint();
                }//fin condicion 2
               else{//si la barra no esta vacia...
                   int size_discoB2=pila_barra2.getTope().getSize();
                   int size_pila = pila_barra2.getSize();
                   if(size<size_discoB2){
                       if(size_pila==1){//altura_p2
                          if(size==2){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());
                   pila_barra3.Desapilar();
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(570, altura_P2, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra2.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra2());
                          } 
                          
                          if(size==1){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());
                   pila_barra3.Desapilar();
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(600, altura_P2, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra2.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra2()); 
                              
                          }
                          
                          panel.repaint();
                       }
                       if(size_pila==2){//si la pila tiene dos discos altura_p3
                           
                             if(size==2){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());
                   pila_barra3.Desapilar();
                   Disco disco1 = new Disco(2);
                   disco1.setSize_Ubicacion(570, altura_P3, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(2);
                   pila_barra2.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra2());
                          } 
                          
                          if(size==1){
                   panel.remove(pila_barra3.getTope().getDisco().getDisco());
                   pila_barra3.Desapilar();
                   Disco disco1 = new Disco(3);
                   disco1.setSize_Ubicacion(600, altura_P3, ancho, alto);
                   nodo.setDisco(disco1);
                   nodo.setSize(1);
                   pila_barra2.Apilar(nodo);
                   panel.add(disco1.getDisco());
                   panel.add(barra.getBarra2()); 
                              
                          }
                          
                          panel.repaint();                           
                       }
                   }
              }
              
                   
                    }//fin condicion 1            
            }
        });//fin del boton 1 de la barra 3
        
        //Inicializar ventana y panel.............
        panel.setVisible(true);
        ventana.add(panel);
        ventana.setVisible(true);
        //........................................
     }
    
}
