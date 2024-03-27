import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("John Doe", 12345678, "1234 Elm Street");
        Pedido pedido = new Pedido(new Date(), cliente, 1);
        Articulo articulo = new Articulo("Laptop", 999.99);

        pedido.agregarArticulo(articulo);
        cliente.realizarPedido(pedido);

        // You can add code here to interact with your objects or print out their state
    }
}
