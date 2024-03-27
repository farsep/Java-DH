package Pepe;

public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();
        puerto.agregarContenedor(new Contenedor(7, Pais.CHINA, false));
        puerto.agregarContenedor(new Contenedor(8, Pais.EEUU, true));
        puerto.agregarContenedor(new Contenedor(9, Pais.BRASIL, false));
        puerto.agregarContenedor(new Contenedor(10, Pais.RUSIA, true));
        puerto.agregarContenedor(new Contenedor(11, Pais.CANADA, false));
        puerto.agregarContenedor(new Contenedor(12, Pais.DESCONOCIDA, true));
        puerto.MostrarContenedores();
        puerto.MostrarContenedoresPeligrosos();
        puerto.MostrarSospecosos();

        System.out.println(Pais.DESCONOCIDA.getValor());


    }
}
