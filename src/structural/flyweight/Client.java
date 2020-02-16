package structural.flyweight;

/**
 * @author 朱志军
 * @create 2020-02-14 21:18
 * @desc 终端测试
 **/
public class Client {
    public static void main(String[] args) {
        ChessFlyWeight chess1 = ChessFlyWeightFactory.getChess("黑色");
        ChessFlyWeight chess2 = ChessFlyWeightFactory.getChess("黑色");

        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("--------------");
        Coordinate c1 = new Coordinate(10,10);
        Coordinate c2 = new Coordinate(20,20);
        chess1.display(c1);
        chess1.display(c2);
    }
}
