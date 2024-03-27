package Pepe;

public class Contenedor {
    private int numero;
    private Pais paisProcedencia;
    private boolean esPeligroso;

    public Contenedor(int numero, Pais paisProcedencia, boolean esPeligroso) {
        this.numero = numero;
        this.paisProcedencia = paisProcedencia;
        this.esPeligroso = esPeligroso;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pais getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(Pais paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public boolean isEsPeligroso() {
        return esPeligroso;
    }

    public void setEsPeligroso(boolean esPeligroso) {
        this.esPeligroso = esPeligroso;
    }
}
