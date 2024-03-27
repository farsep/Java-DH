package SpacialGame;

public class Asteroid extends GraphicObject{
    private int lesion;

    public Asteroid(int posx, int posy, char direction, int lesion) {
        super(posx, posy, direction);
        this.lesion = lesion;
    }

    public int getLesion() {
        return lesion;
    }
}

