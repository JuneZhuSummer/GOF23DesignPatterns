package creation.builder;

/**
 * @author 朱志军
 * @create 2020-01-16 23:33
 * @desc 装配者
 **/
public class ZzjAirShipDirector implements AirShipDirector{

    private AirShipBuilder builder;

    public ZzjAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {

        Engine e = builder.builderEngine();
        OrbitalModule o = builder.builderOrbitalModule();
        EscapeTower et = builder.builderEscapeTower();

        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(o);

        return ship;
    }
}
