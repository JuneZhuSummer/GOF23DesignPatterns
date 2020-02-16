package structural.proxy.staticProxy;

/**
 * @author 朱志军
 * @create 2020-02-10 17:20
 * @desc 实例测试
 **/
public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);
        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();
    }
}
