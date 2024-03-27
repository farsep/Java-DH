package Principal;

public abstract class Estado{

    public abstract void agregarProducto(Producto productoSuculento);

    public abstract void cancelarElCarrito();

    public abstract void volverAlEstadoAnterior();

    public abstract void siguienteEstado();

}
