package creation.factory.simpleFactory;

/**
 * @author 朱志军
 * @create 2019-12-29 15:13
 * @desc 工厂模式实现--简单（静态）工厂（缺点：违反开闭原则，添加功能时需要修改代码）
 **/
public class CarFactory {

    public static Car createCar(String type){
        if ("奥迪".equals(type)){
            return new Audi();
        }else if("比亚迪".equals(type)){
            return new Byd();
        }else {
            return null;
        }
    }

    /**
     * 另一种实现简单工厂的方式，本质上一致
     * @return
     */

    public static Audi createAudi(){
        return new Audi();
    }

    public static Byd createByd(){
        return new Byd();
    }
}
