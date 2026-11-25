public class Main {
    public static void main(String[] args) {
        Producto[] productos = new Producto[5];
        productos[0] = new Producto("P01", "Mouse", 25.50, true);
        productos[1] = new Producto("P02", "Teclado", 35.00, true);
        productos[2] = new Producto("P03", "Monitor", 180.00, false);
        productos[3] = new Producto("P04", "Audifonos", 45.50, true);
        productos[4] = new Producto("P05", "Laptop", 750.00, false);
        AnalizadorCatalogo analizador = new AnalizadorCatalogo(productos);
        System.out.println("CATALOGO DIGITAL");
        System.out.println(analizador.listarProductos());
        System.out.println("Productos disponibles: " + analizador.contarDisponibles());
        System.out.printf("Precio promedio: $%.2f%n", analizador.calcularPrecioPromedio());
        System.out.println("\nBUSQUEDA DE PRODUCTO");
        Producto encontrado = analizador.buscarPorCodigo("P03");
        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Producto no encontrado");
        }
        Producto inexistente = analizador.buscarPorCodigo("P10");
        if (inexistente != null) {
            System.out.println(inexistente.mostrarInformacion());
        } else {
            System.out.println("El producto P10 no existe");
        }
        System.out.println("\nRODUCTO MAS CARO");
        Producto masCaro = analizador.obtenerProductoMasCaro();
        if (masCaro != null) {
            System.out.println(masCaro.mostrarInformacion());
        } else {
            System.out.println("No existen productos en el catalogo");
        }
    }
}