package tobias.taller2_1;

import java.util.Scanner;

/**
 * IMPLEMENTACIÓN DE LOS EJERCICIOS 1 Y 2
 *
 * @author Videla Guliotti Tobías Uriel
 */
public class Main {
    //Pila y Cola de tamaño estático, se puede modificar según lo que se necesite. Se sugiere tamaño 3 o 5 para pruebas.
    public static Pila pila = new Pila(100);
    public static Cola cola = new Cola(100);
    
    public static void menu() {
        System.out.println("Mini-Sistema de Pila y Cola:\n\n");
        System.out.println("1. Ver estado actual de la Pila");
        System.out.println("2. Push");
        System.out.println("3. Pop");
        System.out.println("4. Peek");
        System.out.println("5. Ver estado actual de la Cola");
        System.out.println("6. Enqueue");
        System.out.println("7. Dequeue");
        System.out.println("8. Front");
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
                    pila.printPila();
                }
                case 2 -> {
                    int n;
                    System.out.print("\nIngrese un numero entero positivo: ");
                    do {
                        n = Integer.parseInt(sc.nextLine());
                    } while (n <= 0);
                    pila.push(n);
                }
                case 3 -> {
                    pila.pop();
                }
                case 4 -> {
                    System.out.println("Tope de la pila: " + pila.peek());
                }
                case 5 -> {
                    cola.printCola();
                }
                case 6 -> {
                    int n;
                    System.out.print("\nIngrese un numero entero positivo: ");
                    do {
                        n = Integer.parseInt(sc.nextLine());
                    } while (n <= 0);
                    cola.enqueue(n);
                }
                case 7 -> {
                    cola.dequeue();
                }
                case 8 -> {
                    System.out.println("Cabeza de la cola: " + cola.front());
                }
                case 0 -> {}
            }
        } while(opcion != 0);
    }
}
