package structural.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author 朱志军
 * @create 2020-02-10 21:22
 * @desc 终端类
 **/
public class Client {
    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler handler = new StarHandler(realStar);
        Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
        proxy.bookTicket();     //不会执行
        proxy.sing();
    }
}
