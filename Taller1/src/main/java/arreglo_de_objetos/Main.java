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
        System.out.println("\n\n\n");
        System.out.println(" Taller1: Arreglo de Objetos\n");
        System.out.println("1. Ver vértices");
        System.out.println("2. Insertar vértice");
        System.out.println("3. Actualizar vértice");
        System.out.println("4. Borrar vértice");
        System.out.println("0. Salir\n");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean continuar = true;
        // Crear arreglo de 5 Vertices
        Utilidades grafo = new Utilidades(5);
        // ejecutar menu de opciones
        do {
            printMenu();
            System.out.print(" Opcion: ");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1 -> {
                    grafo.toString();
                }
                case 2 -> {
                    grafo.insert_vertice();
                }
                case 3 -> {
                    System.out.print("\n Nombre del vértice a modificar: ");
                    String name = scanner.nextLine();
                    grafo.update_vertice(name);
                }
                case 4 -> {
                    System.out.print("\n Nombre del vértice a eliminar: ");
                    String name = scanner.nextLine();
                    grafo.delete_vertice(name);
                }
                case 0 -> {
                    System.out.println("Saliendo...");
                    continuar = false;
                }
                default -> {
                    System.out.println("\n Inválida.");
                }
            }
        } while (continuar);
    }
}
