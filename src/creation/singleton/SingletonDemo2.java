package creation.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @author 朱志军
 * @create 2019-12-14 21:06
 * @desc 懒汉式实现
 **/
public class SingletonDemo2 implements Serializable {

    //懒加载，用的时候才加载，资源利用率提高，但由于利用了同步，并发效率低
    private static SingletonDemo2 singleton;

    //私有构造器，防止其他类的调用
    private SingletonDemo2() {
        //防止反射破解
        if(singleton!=null){
            throw new RuntimeException();
        }
    }

    //反序列化时，直接调用此方法，返回单例对象，不需要再创建新对象
    private Object readResolve() throws ObjectStreamException{
        return singleton;
    }

    /**
     *使用同步，避免在并发量高的时候创建多个对象
     * @return
     */
    public static synchronized SingletonDemo2 getInstance(){
        if (singleton==null){
            singleton = new SingletonDemo2();
        }
        return singleton;
    }
}
