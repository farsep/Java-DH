import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private Integer telefono;
    private String domicilio;
    private List<Pedido> pedidos; // A list to keep track of Pedidos made by this Cliente

    public Cliente(String nombre, Integer telefono, String domicilio) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.pedidos = new ArrayList<>();
    }

    public void realizarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    // Additional getters and setters
}
