package SpacialGame;

public class Main {

    public static void main(String[] args) {
        Nave pepe = new Nave(0,0, 'u', 10.0, 100);
        Asteroid ponmo = new Asteroid(0,0, 'd', 50);

        pepe.lessHp(ponmo.getLesion());
        System.out.println("Your nave suffered: " + "\n" +
                ponmo.getLesion() + " damage");
    }
}
