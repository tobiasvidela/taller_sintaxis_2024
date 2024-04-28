package tobias.test;

import java.util.Scanner;

public class Test {
    
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
        Vertex[] vertices = new Vertex[5];
        // ejecutar menu de opciones
        do {
            printMenu();
            System.out.print(" Opcion: ");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1 -> {
                    Vertex.toString(vertices);
                }
                case 2 -> {
                    Vertex.insert_vertice(vertices);
                }
                case 3 -> {
                    System.out.print("\n Nombre del vértice a modificar: ");
                    String name = scanner.nextLine();
                    Vertex.update_vertice(name,vertices);
                }
                case 4 -> {
                    System.out.print("\n Nombre del vértice a eliminar: ");
                    String name = scanner.nextLine();
                    Vertex.delete_vertice(name,vertices);
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
