package creation.factory.test;

import creation.factory.abstractFactory.*;
import org.junit.Test;

/**
 * @author 朱志军
 * @create 2019-12-29 20:32
 * @desc 抽象工厂实现测试
 **/
public class AbstractFactoryTest {
    @Test
    public void test(){
        CarFactory cf1 = new LuxuryFactory();        //高端工厂
        CarFactory cf2 = new LowFactory();           //低端工厂
        Engine e1 = cf1.createEngine();              //引擎1
        Engine e2 = cf2.createEngine();              //引擎2
        Seat s1 = cf1.createSeat();                  //座椅1
        Seat s2 = cf2.createSeat();                  //座椅2
        Tyre t1 = cf1.createTyre();                  //轮胎1
        Tyre t2 = cf2.createTyre();                  //轮胎2

        e1.run();
        e1.start();
        e2.run();
        e2.start();
        s1.massage();
        s2.massage();
        t1.revolve();
        t2.revolve();
    }
}
