/**
 * Excepto por menu() e iniciar(), todo lo hizo ChatGPT-3.5
 */
package tobias.taller2_0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GrafoDirigido {
    
    public static Set<Integer> nodos = new HashSet<>();
    public static Set<Arista> aristas = new HashSet<>();
    public static Map<Arista, Integer> etiquetas = new HashMap<>();
    
    public static void menu() {
        System.out.println("Grafo dirigido\n\n");
        System.out.println("1. Mostrar Nodos");
        System.out.println("2. Mostrar Aristas y Etiquetas");
        System.out.println("3. Agregar Arista y Etiqueta");
        System.out.println("0. Volver\n");
        System.out.print("Opcion: ");
    }

    public static void mostrarNodos() {
        System.out.println("Nodos: " + nodos);
    }

    public static void mostrarAristasYEtiqutas() {
        System.out.println("Aristas y Etiquetas:");
        for (Map.Entry<Arista, Integer> entry : etiquetas.entrySet()) {
            System.out.println("Origen: " + entry.getKey().origen + ", Destino: " + entry.getKey().destino + ", Etiqueta: " + entry.getValue());
        }
    }

    public static void agregarAristaYEtiqueta(Scanner sc) {
        System.out.print("Ingrese el origen de la arista: ");
        int origen = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el destino de la arista: ");
        int destino = Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la etiqueta de la arista: ");
        int etiqueta = Integer.parseInt(sc.nextLine());

        if (!nodos.contains(origen) || !nodos.contains(destino)) {
            System.out.println("Los nodos de la arista no existen. Por favor, primero agregue los nodos.");
            return;
        }

        Arista nuevaArista = new Arista(origen, destino);
        aristas.add(nuevaArista);
        etiquetas.put(nuevaArista, etiqueta);

        System.out.println("Arista y etiqueta agregadas correctamente.");
    }

    public static void iniciar() {
        int opcion;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                menu();
                opcion = Integer.parseInt(sc.nextLine());
                switch(opcion){
                    case 1 -> mostrarNodos();
                    case 2 -> mostrarAristasYEtiqutas();
                    case 3 -> agregarAristaYEtiqueta(sc);
                    case 0 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opción no válida. Por favor, elige una opción válida.");
                }
            } while (opcion != 0);
        }
    }
}
