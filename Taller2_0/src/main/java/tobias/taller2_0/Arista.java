package tobias.taller2_0;

import java.util.Objects;

/**
 *
 * @author CHatGPT 3.5
 */
public class Arista {
    int origen;
    int destino;

    Arista(int origen, int destino) {
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arista edge = (Arista) o;
        return origen == edge.origen && destino == edge.destino;
    }

    @Override
    public int hashCode() {
        return Objects.hash(origen, destino);
    }
}
