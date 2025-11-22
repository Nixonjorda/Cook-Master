package cookmaster;

public class RecetaBuilder {

    private Receta receta;

    public RecetaBuilder crearPasta(String nombre) {
        this.receta = new RecetaPasta(nombre);
        return this;
    }

    public RecetaBuilder crearLasagna(String nombre) {
        this.receta = new RecetaLasagna(nombre);
        return this;
    }

    public RecetaBuilder porciones(int p) {
        receta.setPorciones(p);
        return this;
    }

    public RecetaBuilder agregarIngrediente(String n, double c, String u) {
        receta.agregarIngrediente(new Ingrediente(n, c, u));
        return this;
    }

    public RecetaBuilder agregarPaso(String p) {
        receta.agregarPaso(new Paso(p));
        return this;
    }

    public Receta build() {
        return receta;
    }
}
