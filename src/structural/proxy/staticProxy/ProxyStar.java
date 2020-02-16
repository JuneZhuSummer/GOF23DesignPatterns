package structural.proxy.staticProxy;

/**
 * @author 朱志军
 * @create 2020-02-10 17:16
 * @desc 代理人（经纪人）
 **/
public class ProxyStar implements Star{

    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("代理面谈");
    }

    @Override
    public void signContract() {
        System.out.println("代理签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("代理订票");
    }

    @Override
    public void sing() {
        //代理无法唱歌
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("代理收钱");
    }
}
