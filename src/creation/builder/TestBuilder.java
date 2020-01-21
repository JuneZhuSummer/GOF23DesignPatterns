package creation.builder;

import org.junit.Test;

/**
 * @author 朱志军
 * @create 2020-01-16 23:43
 * @desc 测试类
 **/
public class TestBuilder {

    @Test
    public void test01(){
        AirShipDirector director = new ZzjAirShipDirector(new ZzjAirShipBuilder());
        AirShip ship = director.directAirShip();
        Engine e = ship.getEngine();
        EscapeTower et = ship.getEscapeTower();
        OrbitalModule o = ship.getOrbitalModule();
        System.out.println(e.getName());
        System.out.println(o.getName());
        System.out.println(et.getName());
        ship.launch();
    }
}
