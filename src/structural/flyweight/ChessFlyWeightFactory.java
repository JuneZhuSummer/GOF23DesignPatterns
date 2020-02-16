package structural.flyweight;

import	java.util.HashMap;
import java.util.Map;

/**
 * @author 朱志军
 * @create 2020-02-14 19:25
 * @desc 享元工厂类
 **/
public class ChessFlyWeightFactory {
    //享元池
    private static Map<String,ChessFlyWeight> map = new HashMap<> ();

    public static ChessFlyWeight getChess(String color){
        if (map.get(color)!=null){
            return map.get(color);
        }else {
            ChessFlyWeight cfw = new ConcreteChess(color);
            map.put(color,cfw);
            return cfw;
        }
    }
}
