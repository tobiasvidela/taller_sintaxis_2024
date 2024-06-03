package tobias.taller2_0;

import java.util.Scanner;

public class GrafoDirigido {
    public static void menu() {
        System.out.println("Grafo no dirigido\n\n");
        System.out.println("1. Mostrar Matriz de Adyacencias");
        System.out.println("2. Agregar arista entre dos nodos");
        System.out.println("3. Verificar camino entre nodos");
        System.out.println("4. Mostrar grafo (nodos unidos por aristas)");
        System.out.println("0. Volver\n");
        System.out.print("Opcion: ");
    }
    public static void iniciar() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1 -> {
                    
                }
                case 2 -> {
                }
                case 3 -> {
                    
                }
                case 4 -> {
                    
                }
                case 0 -> {}
            }
        } while (opcion != 0);
    }
}
