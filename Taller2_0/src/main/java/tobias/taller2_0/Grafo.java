package tobias.taller2_0;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Videla Guliotti Tobías Uriel
 */
public class Grafo {
    public static int[][] MA = new int[10][10];
    
    public static void menu() {
        System.out.println("Grafo no dirigido\n\n");
        System.out.println("1. Mostrar Matriz de Adyacencias");
        System.out.println("2. Agregar arista entre dos nodos");
        System.out.println("3. Verificar camino entre nodos");
        System.out.println("4. Mostrar grafo (nodos unidos por aristas)");
        System.out.println("0. Volver\n");
        System.out.print("Opcion: ");
    }
    
    public static void mostrarMA() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(MA[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void agregarArista(int i, int j) {
        MA[i][j] = 1;
        MA[j][i] = 1;
    }
    
    public static boolean existeCamino() {
        Scanner sc = new Scanner(System.in);
        char confirm;
        ArrayList<Integer> nodos = new ArrayList<Integer>();
        
        System.out.println("\n Sólo puedes ingresar de 0 hasta 10 nodos");
        for (int i = 0; i < 10; i++) {
            do {
                System.out.print("¿Desea agregar un nodo? (y | n): ");
                confirm = sc.nextLine().toLowerCase().charAt(0);
            } while (!(confirm == 'y' || confirm == 'n'));
            if (confirm == 'n') {
                break;
            }
            System.out.print("\n Nodo " + (i+1) + ": ");
            int nodo = Integer.parseInt(sc.nextLine());
            nodos.add(nodo);
        }
        
        if (nodos.isEmpty()) {
            return false;
        } else {
            // verificar si existe camino pasando por esos nodos
            if (nodos.size() > 1) {
                for (int i : nodos) {
                    if (MA[i][i+1] == 0 && i < nodos.size()-1) {
                        return false;
                    }
                }
            } else {
                return true;
            }
        }
        return true;
    }
    
    public static void printGrafo() {
        System.out.println("\n Grafo:\n");
        for (int i = 0; i < 10; i++) {
            for (int j = i+1; j < 10; j++) {
                if (MA[i][j] == 1) { //si existe una arista entre nodos
                    System.out.println(" (" + i + ", " + j + ")");
                }
            }
        }
        System.out.println("\n");
    }
    
    public static void iniciar() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            opcion = Integer.parseInt(sc.nextLine());
            switch(opcion){
                case 1 -> {
                    System.out.println("\n -- Matriz de Adyacencias");
                    mostrarMA();
                }
                case 2 -> {
                    System.out.println("\n -- Agregar arista entre nodos");
                    int i, j;
                    do {
                        System.out.print("\nIngrese el nodo: ");
                        i = Integer.parseInt(sc.nextLine());
                    } while (i < 0 || i > 10);
                    do {
                        System.out.print("\nIngrese el siguiente nodo: ");
                        j = Integer.parseInt(sc.nextLine());
                    } while (j < 0 || j > 10);
                    agregarArista(i,j);
                    System.out.println("\n Arista agregada.");
                    mostrarMA();
                }
                case 3 -> {
                    System.out.println("\n -- Verificar camino entre nodos");
                    if (existeCamino()) {
                        System.out.println("Hay un camino pasando por esos nodos.");
                    } else {
                        System.out.println("No hay un camino pasando por esos nodos.");
                    }
                }
                case 4 -> {
                    System.out.println("\n --  Mostrar todos los nodos unidos por aristas");
                    printGrafo();
                }
                case 0 -> {}
            }
        } while (opcion != 0);
    }
}
