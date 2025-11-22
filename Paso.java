package cookmaster;

public class Paso {
    private String descripcion;

    public Paso(String descripcion) {
        this.descripcion = descripcion;
    }

    public void imprimir() {
        System.out.println(" " + descripcion);
    }
}
