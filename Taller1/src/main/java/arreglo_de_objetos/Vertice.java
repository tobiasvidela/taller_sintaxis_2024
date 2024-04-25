package arreglo_de_objetos;

/**
 *
 * @author Videla Guliotti Tobías Uriel
 */
public class Vertice {
    private String name;
    private int number;

    public Vertice(String name, int number) {
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
    
}
