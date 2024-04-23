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
    
    @Override
    public String toString() {
        return " Vertice (" + name + ", " + number + ") ";
    }
        
    /**
     * Verifica si el vértice con el nombre especificado existe.
     * Un vértice se considera vacío o inexistente si su nombre está vacío o es nulo.
     * 
     * @param name El nombre del vértice a verificar.
     * @return true si el vértice con el nombre especificado existe, false en caso contrario.
     */
    public boolean check_vertice(String name) {
        return !(this.name.isEmpty());
    }
    
    /**
     * Verifica si el arreglo de vértices especificado está vacío.
     * Un arreglo de vértices se considera vacío cuando todos sus elementos
     * se encuentran en null.
     * 
     * @param vertices El arreglo de vértices a verificar.
     * @return true si el arreglo de vértices está vacío, false de lo contrario.
     */
    public boolean isEmpty_vertices(Vertice[] vertices) {
        for (Vertice vertice : vertices) {
            if (vertice != null) {
                if (vertice.getName() != null && vertice.getNumber() != 0) {
                    return false; // El arreglo tiene al menos un elemento no nulo.
                }
            }
        }
        return true; // Todos los elementos del arreglo son nulos.
    }
    
    /**
     * Dar de alta un vértice dentro del arreglo.
     * En la primera posición vacía
     * 
     * @param name Nombre del vértice
     * @param number Número del vértice
     * @param vertices Arreglo de vértices
     */
    public void insert_vertice(String name, int number, Vertice[] vertices) {
        for (Vertice vertice : vertices) {
            if (vertice == null) {
                vertice = new Vertice(name, number);
                break;
            }
        }
    }
    
    /**
     * Modificar el número de un vértice que se encuentre dentro del arreglo.
     * 
     * @param name Nombre del vértice a modificar.
     * @param number Nuevo número o valor para el vértice especificado.
     * @param vertices Arreglo de vértices.
     */
    public void update_vertice(String name, int number, Vertice[] vertices) {
        for (Vertice vertice : vertices) {
            if (vertice.check_vertice(name)) {
                vertice.setNumber(number);
                return;
            }
        }
        System.out.println("\n El vértice " + name + " no existe.\n");
    }

    /**
     * delete_vertice : dar de baja un vértice dentro del arreglo.
     * 
     * @param name Nombre del vértice a eliminar.
     * @param vertices Arreglo de vértices.
     */
    public void delete_vertice(String name, Vertice[] vertices) {
        for (Vertice vertice : vertices) {
            if (vertice.check_vertice(name)) {
                vertice.setName("");
                vertice.setNumber(0);
                return;
            }
        }
        System.out.println("\n El vértice " + name + " no existe.\n");
    }
}
