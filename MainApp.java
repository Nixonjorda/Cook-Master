package cookmaster;

public class MainApp {

    public static void main(String[] args) {

        LibroDeRecetas libro = LibroDeRecetas.getInstancia();

 
        Receta pastaCarbonara = new RecetaBuilder()
            .crearPasta("Pasta Carbonara Tradicional Italiana")
            .porciones(2)
            .agregarIngrediente("Spaghetti", 250, "g")
            .agregarIngrediente("Guanciale o panceta", 120, "g")
            .agregarIngrediente("Huevos enteros", 2, "unidades")
            .agregarIngrediente("Yema extra", 1, "unidad")
            .agregarIngrediente("Queso Pecorino Romano", 60, "g")
            .agregarIngrediente("Pimienta negra", 1, "cucharadita")
            .agregarPaso("Dorar el guanciale sin aceite.")
            .agregarPaso("Hervir la pasta hasta que esté al dente.")
            .agregarPaso("Mezclar huevos, yema y queso en un bowl.")
            .agregarPaso("Agregar la pasta caliente y mezclar rápido.")
            .agregarPaso("Añadir agua de cocción para cremosidad.")
            .agregarPaso("Agregar guanciale y pimienta.")
            .build();

        libro.agregarReceta(pastaCarbonara);

        Receta lasagna = new RecetaBuilder()
            .crearLasagna("Lasaña Tradicional a la Boloñesa")
            .porciones(6)
            .agregarIngrediente("Láminas de lasaña", 12, "unidades")
            .agregarIngrediente("Carne molida", 500, "g")
            .agregarIngrediente("Cebolla picada", 1, "unidad")
            .agregarIngrediente("Tomate triturado", 500, "g")
            .agregarIngrediente("Queso mozzarella", 300, "g")
            .agregarIngrediente("Salsa bechamel", 400, "ml")
            .agregarIngrediente("Queso parmesano rallado", 100, "g")
            .agregarPaso("Sofreír la cebolla y agregar la carne.")
            .agregarPaso("Añadir el tomate y cocinar 20 minutos.")
            .agregarPaso("Colocar bechamel en el molde.")
            .agregarPaso("Alternar capas de pasta, salsa, mozzarella y bechamel.")
            .agregarPaso("Cubrir con parmesano y hornear 40 min a 180°C.")
            .build();

        libro.agregarReceta(lasagna);

     

        libro.imprimirTodas();
    }
}
