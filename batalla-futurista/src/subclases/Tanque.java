package subclases;

import kuka.IAtacar;
import kuka.IDefender;

public class Tanque extends SistemaDeArmas implements IAtacar, IDefender {

    public Tanque(int energia) {
        super(energia);
    }

    @Override
    public void defender() {

    }

    @Override
    public void atacar() {

    }
}
