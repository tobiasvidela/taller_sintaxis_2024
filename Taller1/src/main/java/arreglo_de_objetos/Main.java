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
    
    /**
     * Verifica si el vértice con el nombre especificado existe.
     * Un vértice se considera vacío o inexistente si su nombre está vacío o es nulo.
     * 
     * @param vertice El vértice a verificar.
     * @return true si el vértice con el nombre especificado existe, false en caso contrario.
     */
    public static boolean check_vertice(Vertice vertice) {
        return !(vertice.getName().isEmpty());
    }
    
    /**
     * Verifica si el arreglo de vértices especificado está vacío.
     * Un arreglo de vértices se considera vacío cuando todos sus elementos
     * se encuentran en null.
     * 
     * @param vertices El arreglo de vértices a verificar.
     * @return true si el arreglo de vértices está vacío, false de lo contrario.
     */
    public static boolean isEmpty_vertices(Vertice[] vertices) {
        for (Vertice vertice : vertices) {
            if (vertice != null) {
                if (vertice.getName() != null && vertice.getNumber() != 0) {
                    return false; // El arreglo tiene al menos un elemento no nulo.
                }
            }
        }
        return true; // Todos los elementos del arreglo son nulos.
    }
    
    /**
     * Dar de alta un vértice dentro del arreglo.
     * En la primera posición vacía
     * 
     * @param name Nombre del vértice
     * @param number Número del vértice
     * @param vertices Arreglo de vértices
     */
    public static void insert_vertice(String name, int number, Vertice[] vertices) {
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] == null) {
                vertices[i] = new Vertice(name, number);
                break;
            }
        }
    }
    
    /**
     * Modificar el número de un vértice que se encuentre dentro del arreglo.
     * 
     * @param name Nombre del vértice a modificar.
     * @param number Nuevo número o valor para el vértice especificado.
     * @param vertices Arreglo de vértices.
     */
    public static void update_vertice(String name, int number, Vertice[] vertices) {
        for (Vertice vertice : vertices) {
            if (check_vertice(vertice)) {
                vertice.setNumber(number);
                return;
            }
        }
        System.out.println("\n El vértice " + name + " no existe.\n");
    }

    /**
     * delete_vertice : dar de baja un vértice dentro del arreglo.
     * 
     * @param name Nombre del vértice a eliminar.
     * @param vertices Arreglo de vértices.
     */
    public static void delete_vertice(String name, Vertice[] vertices) {
        for (Vertice vertice : vertices) {
            if (check_vertice(vertice)) {
                vertice.setName("");
                vertice.setNumber(0);
                return;
            }
        }
        System.out.println("\n El vértice " + name + " no existe.\n");
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
                    System.out.println();
                }
                case 2 -> {
                    System.out.println(" Insertar vértice:");
                    System.out.print("\n Nombre: ");
                    String name = entrada.nextLine();
                    System.out.print("\n Número: ");
                    int number = Integer.parseInt(entrada.nextLine());
                    insert_vertice(name, number, vertices);
                    System.out.println("\n");
                }
                case 3 -> {
                    System.out.println(" Actualizar vértice:");
                    System.out.print("\n Nombre del vértice a modificar: ");
                    String name = entrada.nextLine();
                    System.out.print("\n Número nuevo: ");
                    int number = Integer.parseInt(entrada.nextLine());
                    update_vertice(name, number, vertices);
                    System.out.println("\n");
                }
                case 4 -> {
                    System.out.println(" Borrar vértice:");
                    System.out.print("\n Nombre del vértice a eliminar: ");
                    String name = entrada.nextLine();
                    delete_vertice(name, vertices);
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
