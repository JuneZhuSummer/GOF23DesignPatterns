package structural.facade;

/**
 * @author 朱志军
 * @create 2020-02-14 12:20
 * @desc 终端测试
 **/
public class Client {
    public static void main(String[] args) {
        RegisterFacade rf = new RegisterFacade();
        rf.register();
    }
}
