import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date fecha;
    private Cliente cliente; // Reference to the Cliente that made the Pedido
    private Integer codigo;
    private List<Articulo> articulos; // List of Articulo objects within this Pedido

    public Pedido(Date fecha, Cliente cliente, Integer codigo) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.codigo = codigo;
        this.articulos = new ArrayList<>();
    }

    public void agregarArticulo(Articulo articulo) {
        this.articulos.add(articulo);
    }

    // Additional getters and setters
}

