/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.marg.listasyinterfaces.Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.edu.itses.marg.listasyinterfaces.Modelo.Vuelo;

/**
 *
 * @author mar_6
 */
public class Lista extends Thread{
    private List <Vuelo> vuelos;
    private File Archivo;

    public Lista(List<Vuelo> vuelos, File Archivo) {
        this.vuelos = vuelos;
        this.Archivo = Archivo;
    }
    
    public void run(){
        List<Vuelo> nuevos = new ArrayList<>();
        BufferedReader b;
        try {
            b = new BufferedReader(new FileReader(Archivo));
            b.readLine();
            String l;
            while ((l = b.readLine()) ! = null){                
                String[] info =  l.split(",");
               nuevos.add(new Vuelo("Marco", "Mexico", "Panama", "29/02/25", "130"));
            }
            b.close();
            synchronized (vuelos){
                vuelos.clear();
                vuelos.addAll(nuevos);
            }
            Thread.sleep(30000);
        } catch (Exception ex) {
           ex.printStackTrace();
       
        }
   
        
    }
    
    
    
}
