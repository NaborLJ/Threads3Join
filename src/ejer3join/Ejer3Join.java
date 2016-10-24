/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3join;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nabor
 */
public class Ejer3Join extends Thread {

  public static int COUNT = 0;// Variable estatica que contará el numero de hilos.
 
 
    public static void main(String[] args) throws InterruptedException {
       Thread aux = new Ejer3Join ("Hilo "+COUNT);//Declaración del Thread padre.
       aux.start();
    }

    public Ejer3Join(String str) {
        super(str);
    }

    public void run() {
        while (COUNT <6) {
            COUNT++;//Suma al contador COUNT aumentando en 1 su valor. 
            System.out.println(COUNT + " Comenzando");
            Ejer3Join aux = new Ejer3Join ("Hilo "+COUNT);// Se crean los hilos "hijo"
            aux.start();
            try {
                aux.join();//El Thread padre esperará a que todos los hijos se ejecuten hasta poder ejecutarse el.
                   for (int i = 0; i < 10 ; i++){//Bucle que ejecutará el mensaje En proceso : + El nombre del hilo.
            System.out.println("En proceso : "+getName());
            
            
        }
           
            } catch (InterruptedException ex) {
                Logger.getLogger(Ejer3Join.class.getName()).log(Level.SEVERE, null, ex);
            }
           
           
        }
        
    }
    
}
