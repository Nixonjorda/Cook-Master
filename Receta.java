package cookmaster;

import java.util.ArrayList;
import java.util.List;

public abstract class Receta {

    private  String nombre;
    private  int porciones;
    private List<Ingrediente> ingredientes = new ArrayList<>();
    private List<Paso> pasos = new ArrayList<>();
    private int contadorPasos = 0; 

    public Receta(String nombre) {
        this.nombre = nombre;
    }

    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    public void agregarIngrediente(Ingrediente ing) {
        ingredientes.add(ing);
    }

    public void agregarPaso(Paso paso) {
        pasos.add(paso);
        contadorPasos++;                
    }

    public int getTotalPasos() {
        return contadorPasos;
    }

    public void imprimir() {
        System.out.println("\n " + nombre + " ");
        System.out.println("Porciones: " + porciones + "\n");

        System.out.println("Ingredientes:");
        for (Ingrediente i : ingredientes) {
            i.imprimir();
        }

        System.out.println("\nPasos:");
        for (Paso p : pasos) {
            p.imprimir();
        }

        System.out.println("\nTotal de pasos: " + getTotalPasos());
    }
}

