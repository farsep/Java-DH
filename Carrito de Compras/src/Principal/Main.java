package Principal;

public class Main {
    public static void main(String[] args) {
        Carrito carrito = new Carrito();
        Producto producto1 = new Producto("Producto 1", 100, 1);
        System.out.println(carrito.getEstado());
        carrito.agregarProducto(producto1);
        System.out.println(carrito.getEstado());
    }
}
