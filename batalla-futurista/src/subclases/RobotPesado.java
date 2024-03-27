package subclases;

import kuka.IAtacar;
import kuka.IDefender;
import kuka.IVolar;

public class RobotPesado extends SistemaDeArmas implements IAtacar, IVolar, IDefender {

    public RobotPesado(int energia) {
        super(energia);
    }

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void volar() {

    }
}
