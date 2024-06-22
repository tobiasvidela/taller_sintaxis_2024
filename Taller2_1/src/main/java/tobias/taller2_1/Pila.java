package tobias.taller2_1;

/**
 *
 * @author Videla G. Tobías U. (with the help of ChatGPT)
 */
public class Pila {
    private int[] pila;
    private int tope;
    private int maxSize;

    //Inicializar la pila con un tamaño máximo
    public Pila(int size) {
        this.maxSize = size;
        this.pila = new int[maxSize];
        this.tope = -1;
    }
    
    public boolean isFull() {
        return tope == maxSize - 1;
    }
    
    public boolean isEmpty() {
        return tope == -1;
    }
    
    public void push(int valor) {
        if (isFull()) {
            System.out.println("La pila está llena. No se puede agregar el elemento.");
        }
        //colocar el valor al tope de la pila
        pila[++tope] = valor;
    }
    
    public int pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía. No se puede eliminar el ultimo elemento.");
            return -1; //Error
        }
        //bajar el tope al valor debajo del tope actual
        return pila[tope--];
    }
    
    public int peek() {
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
