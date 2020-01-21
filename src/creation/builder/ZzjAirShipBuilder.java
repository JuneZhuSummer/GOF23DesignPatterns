package creation.builder;

/**
 * @author 朱志军
 * @create 2020-01-16 23:30
 * @desc 建造者
 **/
public class ZzjAirShipBuilder implements AirShipBuilder{

    @Override
    public Engine builderEngine() {
        System.out.println("构建朱志军牌发动机");
        return new Engine("朱志军牌发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建朱志军牌轨道舱");
        return new OrbitalModule("朱志军牌轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构架朱志军牌逃逸塔");
        return new EscapeTower("朱志军牌逃逸塔");
    }
}
