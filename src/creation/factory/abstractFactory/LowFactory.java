package creation.factory.abstractFactory;

/**
 * @author 朱志军
 * @create 2019-12-29 20:29
 * @desc 低端工厂
 **/
public class LowFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }

}
