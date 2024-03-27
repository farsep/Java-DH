
import subclases.RobotLigero;
import subclases.SistemaDeArmas;

public class Main {

    public static void main(String[] args) {
        SistemaDeArmas juan = new RobotLigero(100);

        System.out.println(juan.energia);
    }

}