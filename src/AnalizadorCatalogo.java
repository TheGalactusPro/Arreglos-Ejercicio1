public class AnalizadorCatalogo {
    private Producto[] productos;
    public AnalizadorCatalogo(Producto[] productos) {
        this.productos = productos;
    }
    public String listarProductos() {
        String resultado = "";
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                resultado += productos[i].mostrarInformacion() + "\n";
            }
        }
        return resultado;
    }
    public int contarDisponibles() {
        int contador = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].isDisponible()) {
                contador++;
            }
        }
        return contador;
    }
    public double calcularPrecioPromedio() {
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                suma += productos[i].getPrecio();
                contador++;
            }
        }
        if (contador == 0) {
            return 0;
        }
        return suma / contador;
    }
    public Producto buscarPorCodigo(String codigo) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null &&
                    productos[i].getCodigo().equals(codigo)) {
                return productos[i];
            }
        }
        return null;
    }
    public Producto obtenerProductoMasCaro() {
        Producto productoMasCaro = null;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                if (productoMasCaro == null ||
                        productos[i].getPrecio() > productoMasCaro.getPrecio()) {

                    productoMasCaro = productos[i];
                }
            }
        }
        return productoMasCaro;
    }
}