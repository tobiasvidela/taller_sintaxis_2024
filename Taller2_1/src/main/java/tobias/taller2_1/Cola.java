package tobias.taller2_1;

/**
 * Objetivo: Implementar una estructura de datos tipo cola (queue) sin utilizar las librerías estándar de Java.
 * 
 * Una cola es una estructura de datos lineal que sigue el principio FIFO (First In, First Out).
 *
 * @author Videla G. Tobías U. (with the help of ChatGPT)
 */
public class Cola {
    private int[] cola; //elementos de la cola
    private int cabeza; // indica el elemento al principio de la cola
    private int pie; //indica el elemento al final de la cola
    private int maxSize; //tamaño máximo de la cola
    private int currentSize; //tamaño actual de la cola
    
    public Cola(int size) {
        this.maxSize = size;
        this.cola = new int[maxSize];
        this.cabeza = 0;
        this.pie = -1;
        this.currentSize = 0;
    }
    
    public boolean isFull() {
        return currentSize == maxSize;
    }
    
    public boolean isEmpty() { //Devolver true si la cola está vacía, false en caso contrario.
        return currentSize == 0;
    }
    
    public void enqueue(int valor) { //Añadir un elemento al final de la cola.
        if (isFull()) {
            System.out.println("La cola está llena. No se puede agregar el elemento.");
            return;
        }
        pie = (pie + 1) % maxSize;
        cola[pie] = valor;
        currentSize++;
    }
    
    public int dequeue() { //Eliminar y devolver el primer elemento de la cola. Si la cola está vacía, indicar que lo esta.
        if (isEmpty()) {
            System.out.println("La cola está vacía. No se puede eliminar un elemento.");
            return -1; // Error
        }
        int valor = cola[cabeza];
        cabeza = (cabeza + 1) % maxSize;
        currentSize--;
        return valor;
    }
    
    public int front() { //Devolver el primer elemento sin eliminarlo. Si la cola está vacía, indicar que lo esta.
        if (isEmpty()) {
            System.out.println("La cola está vacía. No se puede obtener el primer elemento.");
            return -1; // Error
        }
        return cola[cabeza];
    }
    
    public void printCola() {
        if (isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.println("Elementos en la cola:");
        for (int i = 0; i < currentSize; i++) {
            System.out.print("(" + cola[(cabeza + i) % maxSize] + ")");
        }
        System.out.println("");
    }
}
