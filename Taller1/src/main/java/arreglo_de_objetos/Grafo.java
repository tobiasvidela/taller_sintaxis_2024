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
}
