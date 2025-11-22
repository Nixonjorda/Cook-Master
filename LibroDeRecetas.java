package cookmaster;

import java.util.ArrayList;
import java.util.List;

public class LibroDeRecetas {

    private static LibroDeRecetas instancia;
    private List<Receta> recetas = new ArrayList<>();

    private LibroDeRecetas() {}

    public static LibroDeRecetas getInstancia() {
        if (instancia == null) {
            instancia = new LibroDeRecetas();
        }
        return instancia;
    }

    public void agregarReceta(Receta r) {
        recetas.add(r);
    }

    public void imprimirTodas() {
        for (Receta r : recetas) {
            r.imprimir();
        }
    }
}
