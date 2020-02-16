package structural.proxy.staticProxy;

/**
 * @author 朱志军
 * @create 2020-02-10 17:13
 * @desc 真正的明星
 **/
public class RealStar implements Star{
    @Override
    public void confer() {
        System.out.println("面谈");
    }

    @Override
    public void signContract() {
        System.out.println("签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("订票");
    }

    @Override
    public void sing() {
        System.out.println("唱歌");
    }

    @Override
    public void collectMoney() {
        System.out.println("收钱");
    }
}
