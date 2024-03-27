package Club;

public class SocioPileta extends Socio{
    private Double costoPileta;
    private Boolean estaHabilitado;

    // Constructor completo
    public SocioPileta(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad, Double costoPileta, Boolean estaHabilitado) {
        super(nombre, numeroSocio, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = estaHabilitado;
    }

    // Constructor con valor predeterminado para estaHabilitado
    public SocioPileta(String nombre, Integer numeroSocio, Double cuotaMensual, String actividad, Double costoPileta) {
        super(nombre, numeroSocio, cuotaMensual, actividad);
        this.costoPileta = costoPileta;
        this.estaHabilitado = false; // Valor predeterminado
    }

    @Override
    public double CalcularCostoMensual() {
        if (costoPileta > 0 && estaHabilitado == true) {
            return super.CalcularCostoMensual() + costoPileta;
        }

        else {
            return super.CalcularCostoMensual();
        }
    }
}
