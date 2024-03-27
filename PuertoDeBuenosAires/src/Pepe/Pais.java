package Pepe;

public enum Pais {
    CHINA(1),
    EEUU(2),
    BRASIL(3),
    RUSIA(4),
    CANADA(5),
    DESCONOCIDA(6);

    private int valor;

    private Pais(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

}

