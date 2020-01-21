package creation.factory.factoryMethod;

/**
 * @author 朱志军
 * @create 2019-12-29 18:39
 * @desc 比亚迪工厂
 **/
public class BydFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Byd();
    }
}
