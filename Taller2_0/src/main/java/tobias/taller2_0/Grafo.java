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
    
    public static boolean existeCamino(ArrayList<Integer> nodos) {
    // Verificar si la lista de nodos está vacía
    if (nodos.isEmpty()) {
        return false;
    }
    
    // Verificar si hay más de un nodo en la lista
    if (nodos.size() < 2) {
        return true; // Un solo nodo siempre forma un camino
    }

    // Verificar si hay un camino entre cada par de nodos consecutivos en la lista
    for (int i = 0; i < nodos.size() - 1; i++) {
        int nodoActual = nodos.get(i);
        int nodoSiguiente = nodos.get(i + 1);
        
        // Verificar si hay una arista entre los nodos
        if (MA[nodoActual][nodoSiguiente] == 0) {
            return false; // No hay un camino entre los nodos
        }
    }

    // Si se verifica que hay un camino entre todos los pares de nodos consecutivos, entonces hay un camino en el grafo
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
                    } while (!(i >= 0 && i < 10));
                    do {
                        System.out.print("\nIngrese el siguiente nodo: ");
                        j = Integer.parseInt(sc.nextLine());
                    } while (!(i >= 0 && i < 10));
                    agregarArista(i,j);
                    System.out.println("\n Arista agregada.");
                    mostrarMA();
                }
                case 3 -> {
                    System.out.println("\n -- Verificar camino entre nodos");
                    ArrayList<Integer> nodos = new ArrayList<>();
                    int nodo;

                    System.out.println("Ingrese la secuencia de nodos separados por espacios (0-9), terminando con -1:");
                    while (true) {
                        System.out.print("Nodo (-1 para terminar): ");
                        nodo = Integer.parseInt(sc.nextLine());
                        if (nodo == -1) {
                            break;
                        } else if (!(nodo >= 0 && nodo < 10)) {
                            System.out.println("El nodo ingresado no es válido. Por favor, ingrese un número entre 0 y 9.");
                        } else {
                            nodos.add(nodo);
                        }
                    }

                    if (existeCamino(nodos)) {
                        System.out.println("Hay un camino que pasa por los nodos ingresados.");
                    } else {
                        System.out.println("No hay un camino que pase por los nodos ingresados.");
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
