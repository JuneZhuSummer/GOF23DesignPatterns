package structural.bridge;

/**
 * @author 朱志军
 * @create 2020-02-12 23:28
 * @desc 终端测试
 **/
public class Client {
    public static void main(String[] args) {
        Computer2 c = new Laptop2(new Asus());
        c.sale();
        Computer2 c2 = new Desktop2(new ShenZhou());
        c2.sale();
    }
}
