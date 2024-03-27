package Principal;

import java.util.ArrayList;
import java.util.List;

public class Carrito{
    private Estado estado;

    private List<Producto> productos;

    public Carrito(){
        productos = new ArrayList<>();
        estado = new Vacio();
    }

    public void setEstado(Estado estado){
        this.estado = estado;
    }

    public Estado getEstado(){
        return estado;
    }

    public void agregarProducto(Producto suculento){

        if(estado instanceof Vacio){
            estado = new Cargando();
            productos.add(suculento);
            System.out.println("El carrito esta agregando productos");
        }
        else if(estado instanceof Cargando){
            System.out.println("El carrito esta cargando");
            productos.add(suculento);
        }
        else if(estado instanceof Pagando){
            System.out.println("El carrito esta Pagando");
        }
        else if(estado instanceof Cerrado){
            System.out.println("El carrito esta cerrado");
        }
    }

}
