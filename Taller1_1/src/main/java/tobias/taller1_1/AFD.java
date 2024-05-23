package tobias.taller1_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Videla Guliotti Tobías Uriel
 */
public class AFD {
    
    public boolean acepta(String cad) {
        
        /*
         * q0 = 0; inicial
         * q1 = 1; normal
         * q2 = 2; final
         * q3 = 3; error
        */
        
        int q = 0; //estado inicial
        for (char c : cad.toCharArray()) {
            switch (q) {
                case 0 -> {
                    if (c == 'a') {
                        q = 3;
                    }
                    if (c == 'b') {
                        q = 1;
                    }
                }
                case 1 -> {
                    if (c == 'a') {
                        q = 2;
                    }
                    if (c == 'b') {
                        q = 1;
                    }
                }
                case 2 -> {
                    if (c == 'a') {
                        q = 2;
                    }
                    if (c == 'b') {
                        q = 1;
                    }
                }
                case 3 -> {}
            }
        }
        return q == 2;
    }
    
    public void iniciar() {
        System.out.println("¡Automata iniciado!\n\n");
        Scanner entrada = new Scanner(System.in);
        String yes = "y";
        do {
            System.out.print("Ingrese una cadena: ");
            String cadena = entrada.nextLine();
            if (acepta(cadena)) {
                System.out.println("Cadena aceptada.\n");
            } else {
                System.out.println("Cadena rechazada.\n");
            }
            entrada.close();
            while(!yes.equalsIgnoreCase("y") && !yes.equalsIgnoreCase("n")){
                System.out.println("\n¿Desea seguir probando cadenas?");
                System.out.print("Y/y para sí, N/n para no\n:  ");
                yes = entrada.nextLine();
                entrada.close();
            }
        } while (yes.equalsIgnoreCase("y"));
        System.out.println("\n\n\n");
    }
}
