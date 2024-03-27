package Pepe;

import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Contenedor> cosos;

    public Puerto() {
       cosos = new ArrayList<>();
    }

    public void agregarContenedor(Contenedor contenedor) {
        cosos.add(contenedor);
    }

    public void MostrarContenedores() {
        for (Contenedor juan : cosos) {
            System.out.println("Contenedor: " + juan.getNumero() + " - " + juan.getPaisProcedencia() + " - " + (juan.isEsPeligroso() ? "Peligroso" : "No peligroso"));
        }
    }

    public void MostrarContenedoresPeligrosos() {
        for (Contenedor tanos : cosos) {
            if (tanos.isEsPeligroso()) {
                System.out.println("Contenedor: " + tanos.getNumero() + " - " + tanos.getPaisProcedencia() + " - " + (tanos.isEsPeligroso() ? "Peligroso" : "No peligroso"));
            }
        }
    }

    public void MostrarSospecosos() {
        for (Contenedor tanos : cosos) {
            if (tanos.getPaisProcedencia() == Pais.DESCONOCIDA) {
                System.out.println("Contenedor: " + tanos.getNumero() + " - " + tanos.getPaisProcedencia() + " - " + (tanos.isEsPeligroso() ? "Peligroso" : "No peligroso"));
            }
        }
    }
}
