package creation.factory.test;

import creation.factory.noFactory.Audi;
import creation.factory.noFactory.Byd;
import creation.factory.noFactory.Car;
import org.junit.Test;

/**
 * @author 朱志军
 * @create 2019-12-29 15:10
 * @desc 测试不使用工厂模式时
 **/
public class NoFactoryTest {
    @Test
    public void test1(){
        Car c1 = new Audi();
        Car c2 = new Byd();
        c1.run();
        c2.run();
    }
}
