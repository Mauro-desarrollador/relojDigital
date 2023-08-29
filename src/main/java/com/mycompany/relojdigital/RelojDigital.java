/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.relojdigital;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mauro
 */
public class RelojDigital {

    public static void main(String[] args) {
        int horas = 0, minutos = 0, segundos = 0; 
        
        while (true) {     
            
            //Mostrar
            if (horas < 10) {
                System.out.print("0");
            }
            
            System.out.print(horas + ":");
            if (minutos < 10) {
                System.out.print("0");
            }
            
            System.out.print(minutos + ":");
            if (segundos < 10) {
                System.out.print("0");
            }
            
            System.out.println(segundos);
            
            //Aumentar el tiempo
            segundos++;
            
            //Comprobar el tiempo
            if (segundos == 60) {
                
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    horas++;
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(RelojDigital.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
