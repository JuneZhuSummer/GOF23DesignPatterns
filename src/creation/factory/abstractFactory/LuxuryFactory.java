package creation.factory.abstractFactory;

/**
 * @author 朱志军
 * @create 2019-12-29 20:29
 * @desc 高端工厂
 **/
public class LuxuryFactory implements CarFactory{

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }

}
