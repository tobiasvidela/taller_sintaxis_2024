/**
 * Cree un Arreglo de vértices cuya dimensión es de 5.
 * Cada vértice constará de un nombre y de un número.
 * 
 * Implementar:
 *      check_vertice : verificar la existencia de un vértice dentro del arreglo.
 *      isEmpty_vertices : verificar si el arreglo de vértices esta vacío.
 *      insert_vertice : dar de alta un vértice dentro del arreglo.
 *      update_vertice : modificar el número de un vértice que se encuentre dentro del arreglo.
 *      delete_vertice : dar de baja un vértice dentro del arreglo.
 * 
 */
package arreglo_de_objetos;

import java.util.Scanner;

/**
 *
 * @author Videla Guliotti Tobías Uriel
 */
public class Main {
    
    public static void printMenu() {
        System.out.println("\n\n\n\n\n");
        System.out.println(" Taller1: Arreglo de Objetos\n");
        System.out.println("1. Ver vértices");
        System.out.println("2. Insertar vértice");
        System.out.println("3. Actualizar vértice");
        System.out.println("4. Borrar vértice");
        System.out.println("0. Salir\n");
    }
        
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        Vertice[] vertices = new Vertice[5];
        do {
            printMenu();
            System.out.print(" Opción: ");
            int opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1 -> {
                    System.out.println(" Vértices:");
                    for (Vertice vertice : vertices) {
                        if (vertice != null) {
                            vertice.toString();
                        }
                    }
                    System.out.println("\n");
                }
                case 2 -> {
                    System.out.println(" Insertar vértice:");
                for (Vertice vertice : vertices) {
                    if (vertice == null) {
                        System.out.print("\n Nombre: ");
                        String name = entrada.nextLine();
                        System.out.print("\n Número: ");
                        int number = Integer.parseInt(entrada.nextLine());
                        vertice.insert_vertice(name, number, vertices);
                        break;
                    }
                }
                    System.out.println("\n");
                }
                case 0 -> {
                    continuar = false;
                }
                default -> System.out.println("Opción inválida.");
            }
        } while (continuar);
        System.out.println("\nSaliendo.\n");
    }
}
