package creation.factory.test;

import creation.factory.factoryMethod.AudiFactory;
import creation.factory.factoryMethod.BydFactory;
import creation.factory.factoryMethod.Car;
import org.junit.Test;

/**
 * @author 朱志军
 * @create 2019-12-29 18:42
 * @desc 方法工厂实现测试
 **/
public class FactoryMethodTest {
    @Test
    public void test1(){

        Car c1 = new AudiFactory().createCar();
        Car c2 = new BydFactory().createCar();

        c1.run();
        c2.run();

    }
}
