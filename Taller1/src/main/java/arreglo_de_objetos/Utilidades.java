/**
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
public class Utilidades {
    private Vertice[] vertices;
    
    public Utilidades(int tamaño) {
        vertices = new Vertice[tamaño];
        for (int i = 0; i < vertices.length; i++) {
            vertices[i] = null;
        }
    }
    
    @Override
    public String toString() {
        if (isEmpty_vertices()) {
            return "\n\n No hay vértices.";
        } else {
            for (Vertice vertice : vertices) {
                if (vertice != null) {
                    System.out.println(vertice.toString());
                }
            }
            return "";
        }
    }
    
    /**
     * Verificar la existencia de un vértice dentro del arreglo.
     * @param name El nombre del vértice a verificar.
     * @return true si el vértice existe, de lo contrario false.
     */
    public boolean check_vertice(String name) {
        for (Vertice vertice : vertices) {
            if (vertice != null && vertice.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Verificar si el arreglo de vértices esta vacío.
     * @return true si todos sus elementos se encuentran en null, de lo contrario false.
     */
    public boolean isEmpty_vertices() {
        for (Vertice vertice : vertices) {
            if (vertice != null) {
                return false; // Existe al menos un vértice no nulo.
            }
        }
        return true; // Todos sus elementos son null.
    }
    
    /**
     * Dar de alta un vértice dentro del arreglo.
     */
    public void insert_vertice() {
        int full = 0;
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] == null) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("\n Nombre: ");
                String name = scanner.nextLine();
                System.out.print("\n Número: ");
                int number = Integer.parseInt(scanner.nextLine());
                vertices[i] = new Vertice(name,number);
                break;
            } else {
                full++;
            }
        }
        if (full == vertices.length) {
            System.out.println("\n No se pueden cargar más vértices. El arreglo está lleno");
        }
    }

    /**
     * Modificar el número de un vértice que se encuentre dentro del arreglo.
     * @param name Nombre del vértice a modificar.
     */
    public void update_vertice(String name) {
        if (!isEmpty_vertices() && check_vertice(name)) {
            for (Vertice vertice : vertices) {
                if (vertice != null && vertice.getName().equalsIgnoreCase(name)) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("\n Nuevo número: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    vertice.setNumber(number);
                    break;
                }
            }
        } else {
            System.out.println("\n El arreglo está vacío, o no existe un vértice con ese nombre.");
        }
    }
    
    /**
     * Dar de baja un vértice dentro del arreglo.
     * @param name Nombre del vértice a eliminar.
     */
    public void delete_vertice(String name) {
        if (!isEmpty_vertices() && check_vertice(name)) {
            for (int i = 0; i < vertices.length; i++) {
                if (check_vertice(name) && vertices[i].getName().equalsIgnoreCase(name)) {
                    vertices[i] = null;
                    break;
                }
            }
        } else {
            System.out.println("\n El arreglo está vacío, o no existe un vértice con ese nombre.");
        }
    }
}
