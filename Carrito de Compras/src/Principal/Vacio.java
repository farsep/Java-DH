package Principal;

public class Vacio extends Estado {
    @Override
    public void agregarProducto(Producto productoSuculento) {
        System.out.println("Agregando producto al carrito");
    }

    @Override
    public void cancelarElCarrito() {
        System.out.println("El carrito esta vacio");
    }

    @Override
    public void volverAlEstadoAnterior() {
        System.out.println("El carrito esta vacio");
    }

    @Override
    public void siguienteEstado() {
        System.out.println("El carrito va a cargar productos");
    }

    @Override
    public String toString() {
        return "Vacio";
    }
}
