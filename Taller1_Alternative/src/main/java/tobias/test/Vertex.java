package tobias.test;

import java.util.Scanner;

/**
 *
 * @author Videla Guliotti Tobías Uriel
 */
public class Vertex {
    private String name;
    private int number;

    public Vertex(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return " Vertice (" + name + ", " + number + ") ";
    }
    public static String toString(Vertex[] vertices) {
        if (isEmpty_vertices(vertices)) {
            return "\n\n No hay vértices.";
        } else {
            for (Vertex vertice : vertices) {
                if (vertice != null) {
                    System.out.println(vertice.toString());
                }
            }
            return "";
        }
    }
    
    public static boolean check_vertice(String name, Vertex[] vertices) {
        for (Vertex vertice : vertices) {
            if (vertice != null && vertice.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isEmpty_vertices(Vertex[] vertices) {
        for (Vertex vertice : vertices) {
            if (vertice != null) {
                return false; // Existe al menos un vértice no nulo.
            }
        }
        return true; // Todos sus elementos son null.
    }
    
    public static void insert_vertice(Vertex[] vertices) {
        int full = 0;
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i] == null) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("\n Nombre: ");
                String name = scanner.nextLine();
                System.out.print("\n Número: ");
                int number = Integer.parseInt(scanner.nextLine());
                vertices[i] = new Vertex(name,number);
                break;
            } else {
                full++;
            }
        }
        if (full == vertices.length) {
            System.out.println("\n No se pueden cargar más vértices. El arreglo está lleno");
        }
    }
    
    public static void update_vertice(String name, Vertex[] vertices) {
        if (!isEmpty_vertices(vertices) && check_vertice(name,vertices)) {
            for (Vertex vertice : vertices) {
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
    
    public static void delete_vertice(String name, Vertex[] vertices) {
        if (!isEmpty_vertices(vertices) && check_vertice(name,vertices)) {
            for (int i = 0; i < vertices.length; i++) {
                if (check_vertice(name,vertices) && vertices[i].getName().equalsIgnoreCase(name)) {
                    vertices[i] = null;
                    break;
                }
            }
        } else {
            System.out.println("\n El arreglo está vacío, o no existe un vértice con ese nombre.");
        }
    }
}
