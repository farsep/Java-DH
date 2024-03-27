package SpacialGame;

public class Nave extends GraphicObject{
    private double velocity;
    private int hp;

    public Nave(int posx, int posy, char direction, double velocity, int hp) {
        super(posx, posy, direction);
        this.velocity = velocity;
        this.hp = hp;
    }

    public void turnAround(char a){
        setDirection(a);
    }

    public void lessHp(int hp){
        this.hp -= hp;
    }


}
