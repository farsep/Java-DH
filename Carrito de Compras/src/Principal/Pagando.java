package Principal;

public class Pagando extends Estado {
    @Override
    public void agregarProducto(Producto productoSuculento) {
        System.out.println("El carrito esta lleno, no se pueden agregar mas productos");
    }

    @Override
    public void cancelarElCarrito() {
        System.out.println("El carrito esta vacio");
    }

    @Override
    public void volverAlEstadoAnterior() {
        System.out.println("El carrito esta cargando productos");
    }

    @Override
    public void siguienteEstado() {
        System.out.println("El carrito esta vacio");
    }

    @Override
    public String toString() {
        return "Pagando";
    }
}
