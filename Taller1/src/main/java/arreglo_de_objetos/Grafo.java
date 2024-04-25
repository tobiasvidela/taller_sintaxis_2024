/**
 * Implementar:
 *      check_vertice : verificar la existencia de un vértice dentro del arreglo.
 *      isEmpty_vertices : verificar si el arreglo de vértices esta vacío.
 *      insert_vertice : dar de alta un vértice dentro del arreglo.
 *      update_vertice : modificar el número de un vértice que se encuentre dentro del arreglo.
 *      delete_vertice : dar de baja un vértice dentro del arreglo.
 * 
 */
package arreglo_de_objetos;

/**
 *
 * @author Videla Guliotti Tobías Uriel
 */
public class Grafo {
    private Vertice[] vertices;
    
    public Grafo(int tamaño) {
        vertices = new Vertice[tamaño];
    }
    
    /**
     * Verificar la existencia de un vértice dentro del arreglo.
     * @param name El nombre del vértice a verificar.
     * @return true si el vértice existe, de lo contrario false.
     */
    public boolean check_vertice(String name) {
        for (Vertice vertice : vertices) {
            if (vertice != null && vertice.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * verificar si el arreglo de vértices esta vacío.
     * @return true si todos sus elementos se encuentran en null, de lo contrario false.
     */
    public boolean isEmpty_vertices() {
        for (Vertice vertice : vertices) {
            if (vertice != null) {
                return false; // Existe al menos un vértice no nulo.
            }
        }
        return true; // Todos sus elementos son null.
    }
}
