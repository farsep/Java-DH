package waza;

abstract class Vehiculo {
    private String numero;
    private Integer juan;

    public Vehiculo(String numero, Integer juan) {
        this.numero = numero;
        this.juan = juan;
    }

    public abstract String pepe();
}
