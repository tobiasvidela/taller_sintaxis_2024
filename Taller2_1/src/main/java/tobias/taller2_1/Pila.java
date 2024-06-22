package tobias.taller2_1;

/**
 * Objetivo: Implementar una estructura de datos tipo pila (stack) sin utilizar las librerías estándar de Java.
 * 
 * Una pila es una estructura de datos lineal que sigue el principio LIFO (Last In, First Out).
 *
 * @author Videla G. Tobías U. (with the help of ChatGPT)
 */
public class Pila {
    private int[] pila; //elementos de la pila
    private int tope; //indica el tope de la pila
    private int maxSize; //valor del tamaño máximo, para inicializar la pila

    public Pila(int size) {
        this.maxSize = size;
        this.pila = new int[maxSize];
        this.tope = -1;
    }
    
    public boolean isFull() {
        return tope == maxSize - 1;
    }
    
    public boolean isEmpty() { //Devolver true si la pila está vacía, false en caso contrario.
        return tope == -1;
    }
    
    public void push(int valor) { //Añadir un elemento al tope de la pila.
        if (isFull()) {
            System.out.println("La pila está llena. No se puede agregar el elemento.");
        }
        //colocar el valor al tope de la pila
        pila[++tope] = valor;
    }
    
    public int pop() { //Eliminar y devolver el elemento del tope de la pila. Si la pila está vacía, indicar que lo esta.
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede eliminar el ultimo elemento.");
            return -1; //Error
        }
        //bajar el tope al valor debajo del tope actual
        return pila[tope--];
    }
    
    public int peek() { //Devolver el elemento del tope sin eliminarlo. Si la pila está vacía, indicar que lo esta.
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede obtener el ultimo elemento.");
            return -1; //Error
        }
        //seleccionar el valor actual del tope de pila
        return pila[tope];
    }
    
    public void printPila() {
        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return;
        }
        System.out.println("Elementos en la pila:");
        for (int i = tope; i >= 0; i--) {
            System.out.print("(" + pila[i] + ")");
        }
        System.out.println("");
    }
}
