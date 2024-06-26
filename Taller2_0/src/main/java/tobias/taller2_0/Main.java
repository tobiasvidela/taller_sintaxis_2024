/**
 * Implementación de los ejercicios 1 y 2 del Taller 2 
 */
package tobias.taller2_0;

import java.util.Scanner;

/**
 *
 * @author Videla Guliotti Tobías Uriel
 */
public class Main {
    
    public static void menu() {
        System.out.println("Practicando grafos:\n\n");
        System.out.println("1. Grafo no dirigido");
        System.out.println("2. Grafo dirigido");
        System.out.println("0. Salir\n");
        System.out.print("Opcion: ");
    }
    
    public static void main(String[] args) {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1 -> {
                    Grafo.iniciar();
                }
                case 2 -> {
                    GrafoDirigido.iniciar();
                }
                case 0 -> {}
            }
        } while(opcion != 0);
    }
}
