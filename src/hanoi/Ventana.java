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
     JButton boton_barra2, boton_barra3;
     
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
        boton_iniciar.setBounds(1000, 700, 100, 30);
        boton_salir.setBounds(1300, 700, 100, 30);
        boton_barra2 = new JButton("barra2");
        boton_barra2.setBounds(60, 620, 80, 30);
        boton_barra3 = new JButton("Barra3");
        boton_barra3.setBounds(250, 620, 80, 30);
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
        
        //........................................
        //accion boton iniciar....
        boton_iniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int x=60 ,y=570, ancho=300, alto=30;
               if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="1 disco"){
                  Disco disco = new Disco(1);
                  disco.setSize_Ubicacion(x,y,ancho,alto); 
                  pila_barra1.Apilar(disco,3);
                  panel.add(disco.getDisco());
                  panel.add(barra.getBarra1());
                  panel.repaint();
                  inicio=1;
                  
               }
               if(combo.getCombo().getItemAt(combo.getCombo().getSelectedIndex())=="2 disco"){
                   int conta=0;
                   while(conta<2){
                       if(conta==0){
                  Disco disco = new Disco(1);
                  disco.setSize_Ubicacion(x,y,ancho,alto); 
                  pila_barra1.Apilar(disco,3);
                  panel.add(disco.getDisco());
                  panel.add(barra.getBarra1());
                  panel.repaint();  
                       }
                       if(conta==1){
                  Disco disco = new Disco(2);
                  disco.setSize_Ubicacion(x+30,y-40,ancho-50,alto); 
                  
                  pila_barra1.Apilar(disco,2);
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
                        if(conta==0){
                  Disco disco = new Disco(1);
                  disco.setSize_Ubicacion(x,y,ancho,alto); 
                  pila_barra1.Apilar(disco,3);
                  panel.add(disco.getDisco());
                  panel.add(barra.getBarra1());
                  panel.repaint();  
                       }
                       if(conta==1){
                  Disco disco = new Disco(2);
                  disco.setSize_Ubicacion(x+30,y-40,ancho-50,alto); 
                  
                  pila_barra1.Apilar(disco,2);
                  panel.add(disco.getDisco());
                  panel.add(barra.getBarra1());
                  panel.repaint();
                           
                       }
                       if(conta==2){
                  Disco disco = new Disco(3);
                  disco.setSize_Ubicacion(x+60,y-85,ancho-100,alto); 
                  
                  pila_barra1.Apilar(disco,1);
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
        //accion boton barra2......
        boton_barra2.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
                int ancho,alto,size;
                if(pila_barra1.Vacia()!=true){
              Nodo_disco nodo = new Nodo_disco();
              ancho=pila_barra1.getTope().getDisco().getDisco().getWidth();
              alto=pila_barra1.getTope().getDisco().getDisco().getHeight();
              size = pila_barra1.getTope().getSize();
              
              
              if(size==3){
                   pila_barra1.getTope().getDisco().getDisco().setBounds(550, 570, ancho, alto);
              
              }
              if(size==2){
                   pila_barra1.getTope().getDisco().getDisco().setBounds(570, 570, ancho, alto);
                  
              }
              
              if(size==1){
                   pila_barra1.getTope().getDisco().getDisco().setBounds(600, 570, ancho, alto);
                  
              }
              
              
              
              JLabel aux = new JLabel();
              aux.setIcon(pila_barra1.getTope().getDisco().getDisco().getIcon());
              Disco disco1 = new Disco(1);
              disco1.setDisco(aux);
              pila_barra2.Apilar(disco1,pila_barra1.getTope().getSize());
              pila_barra1.Desapilar();
              
              panel.add(pila_barra2.getTope().getDisco().getDisco());
              panel.add(barra.getBarra2());
              panel.repaint();
                }
               
            }
        });
        //................................................................
        //accion boton_barra3.....................
        boton_barra3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           if(pila_barra1.Vacia()!=true){
              Nodo_disco nodo = new Nodo_disco();
              int size,ancho,alto;
              ancho=pila_barra1.getTope().getDisco().getDisco().getWidth();
              alto=pila_barra1.getTope().getDisco().getDisco().getHeight();
              size = pila_barra1.getTope().getSize();
                          
              if(size==3){
                   pila_barra1.getTope().getDisco().getDisco().setBounds(1050, 570, ancho, alto);
              
              }
              if(size==2){
                   pila_barra1.getTope().getDisco().getDisco().setBounds(1090, 570, ancho, alto);
                  
              }
              
              if(size==1){
                   pila_barra1.getTope().getDisco().getDisco().setBounds(1100, 570, ancho, alto);
                  
              }
                
              
              
              
              JLabel aux = new JLabel();
              aux.setIcon(pila_barra1.getTope().getDisco().getDisco().getIcon());
              Disco disco1 = new Disco(1);
              disco1.setDisco(aux);
              pila_barra3.Apilar(disco1,pila_barra1.getTope().getSize());
              pila_barra1.Desapilar();  
              panel.add(pila_barra3.getTope().getDisco().getDisco());
              panel.add(barra.getBarra3());
              panel.repaint();
                }
               
            }
        });
        
        //Inicializar ventana y panel.............
        panel.setVisible(true);
        ventana.add(panel);
        ventana.setVisible(true);
        //........................................
     }
    
}
