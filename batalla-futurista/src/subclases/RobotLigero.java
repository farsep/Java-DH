package subclases;

import kuka.IAtacar;
import kuka.IDefender;
import kuka.IVolar;

public class RobotLigero extends SistemaDeArmas implements IAtacar, IDefender, IVolar {

    public RobotLigero(int energia) {
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
