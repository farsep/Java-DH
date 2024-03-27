package SpacialGame;

public class GraphicObject {
    private int posx;
    private int posy;
    private char direction;

    public GraphicObject(int posx, int posy, char direction) {
        this.posx = posx;
        this.posy = posy;
        this.direction = direction;
    }

    public void goTo(int x, int y, char direction){
        posx = x;
        posy = y;
        this.direction=direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }
}
