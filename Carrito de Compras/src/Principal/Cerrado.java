package Principal;

public class Cerrado extends Estado{
    @Override
    public void agregarProducto(Producto productoSuculento) {
        System.out.println("El carrito esta cerrado, no se pueden agregar productos");
    }

    @Override
    public void cancelarElCarrito() {
        System.out.println("El carrito esta vacio");
    }

    @Override
    public void volverAlEstadoAnterior() {
        System.out.println("No se puede");
    }

    @Override
    public void siguienteEstado() {
        System.out.println("El carrito esta Vacio");
    }

    @Override
    public String toString() {
        return "Cerrado";
    }
}
