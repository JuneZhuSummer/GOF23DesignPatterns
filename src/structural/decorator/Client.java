package structural.decorator;

/**
 * @author 朱志军
 * @create 2020-02-13 18:38
 * @desc 终端测试
 **/
public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("----增加一个新功能-----");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("----增加两个新功能-----");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();

        System.out.println("----增加三个新功能-----");
        AICar aiCar = new AICar(waterCar);
        aiCar.move();
    }
}
