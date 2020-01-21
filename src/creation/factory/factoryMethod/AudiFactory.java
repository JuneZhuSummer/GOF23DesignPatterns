package creation.factory.factoryMethod;

/**
 * @author 朱志军
 * @create 2019-12-29 18:38
 * @desc 奥迪工厂
 **/
public class AudiFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Audi();
    }
}
