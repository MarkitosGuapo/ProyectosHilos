package mx.edu.itses.marg.listasyinterfaces.Controller;

import mx.edu.itses.marg.listasyinterfaces.Modelo.Vuelo;

import java.util.ArrayList;
import java.util.List;

public class VuelosController {

    // Lista estática para almacenar los vuelos
    private static List<Vuelo> vuelos = new ArrayList<>();

    // Método para obtener la lista de vuelos
    public static List<Vuelo> obtenerVuelos() {
        return vuelos;
    }

    // Método para agregar un vuelo a la lista
    public static void agregarVuelo(Vuelo vuelo) {
        if (vuelo == null) {
            throw new IllegalArgumentException("El vuelo no puede ser nulo.");
        }
        vuelos.add(vuelo);
        System.out.println("Vuelo agregado: " + vuelo);
    }

    // Método para inicializar la lista de vuelos 
    public static void inicializarVuelos() {
        vuelos = new ArrayList<>();
    }

    // Método para mostrar todos los vuelos 
    public static void mostrarVuelos() {
        if (vuelos.isEmpty()) {
            System.out.println("No hay vuelos registrados.");
        } else {
            System.out.println("Lista de vuelos:");
            for (Vuelo vuelo : vuelos) {
                System.out.println(vuelo);
            }
        }
    }
    
    
    
    
}