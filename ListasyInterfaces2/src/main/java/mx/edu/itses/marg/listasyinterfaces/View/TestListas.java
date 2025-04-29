    package mx.edu.itses.marg.listasyinterfaces.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import mx.edu.itses.marg.listasyinterfaces.Modelo.Vuelo;

public class TestListas {
    /*
    public static void main(String[] args) throws ParseException {
    
        // Crear la lista de vuelos
        List<Vuelo> llegadas = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("EEE dd MMM yyyy HH:mm", new Locale("es", "ES"));

     
        llegadas.add(new Vuelo("CMP 111", "Panama City", "Mexico City", "mar 31 ago 2021", "15:15", "32"));
        llegadas.add(new Vuelo("AVA 241", "Bogota", "Mexico City", "mar 31 ago 2021", "14:30", 25));
        llegadas.add(new Vuelo("AMX 101", "Guadalajara", "Mexico City", "mar 31 ago 2021", "13:45", "100"));

    llegadas.sort((v1, v2) -> v2.getFechaCompleta().compareTo(v1.getFechaCompleta()));
    llegadas.forEach(System.out::println);
    Vuelo ultimo = llegadas.get(0);
    System.out.println("El ultimo vuelo es:" + ultimo.getNombre() + "" + ultimo.getDestino());

    llegadas.sort((v1, v2) -> v2.getNum_pasajeros().compareTo(v1.getNum_pasajeros()));
    Vuelo menor = llegadas.get(0);
    System.out.println("El ultimo vuelo con menor num de pasajeros es:" + menor.getNombre());
    }
*/
    
    public static void main(String[] args) {
        ListaView lista = new ListaView();
        lista.CRUDEVuelos();
        
        
        
        
        
        
        
        
        
    }
   
    

}
    

    