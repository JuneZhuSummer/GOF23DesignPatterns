package creation.factory.test;

import creation.factory.simpleFactory.Car;
import creation.factory.simpleFactory.CarFactory;
import org.junit.Test;

/**
 * @author 朱志军
 * @create 2019-12-29 15:15
 * @desc 测试简单工厂模式
 **/
public class SimpleFactoryTest {
    @Test
    public void test1(){
       Car c1 = CarFactory.createCar("奥迪");
       Car c2 = CarFactory.createCar("比亚迪");

       c1.run();
       c2.run();
    }

    @Test
    public void test2(){
        Car c1 = CarFactory.createAudi();
        Car c2 = CarFactory.createByd();
        c1.run();
        c2.run();
    }
}
