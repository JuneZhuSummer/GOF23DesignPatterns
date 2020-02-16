package structural.flyweight;

/**
 * @author 朱志军
 * @create 2020-02-14 19:18
 * @desc 外部状态UnsharedConcreteFlyWeight
 **/
public class Coordinate {
    private int x,y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
