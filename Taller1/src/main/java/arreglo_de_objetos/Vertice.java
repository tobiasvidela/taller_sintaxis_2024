/*
 *  check_vertice : verificar la existencia de un vértice dentro del arreglo.
 *  isEmpty_vertices : verificar si el arreglo de vértices esta vacío.
 *  insert_vertice : dar de alta un vértice dentro del arreglo.
 *  update_vertice : modificar el número de un vértice que se encuentre dentro del arreglo.
 *  delete_vertice : dar de baja un vértice dentro del arreglo.
 */
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
