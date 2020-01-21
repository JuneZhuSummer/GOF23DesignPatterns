package creation.singleton;

/**
 * @author 朱志军
 * @create 2019-12-14 21:00
 * @desc 饿汉式实现:适用于对象资源占用不大的情况
 **/
public class SingletonDemo1 {

    //直接创建对象，类加载的时候立即创建对象（没有延时加载的优势），无论是否使用。
    private static SingletonDemo1 singleton = new SingletonDemo1();

    //私有构造器，防止其他类的调用
    private SingletonDemo1() {
    }

    /**
     * 提供方法，返回对象
     * @return
     */
    public static SingletonDemo1 getInstance(){
        return singleton;
    }

}
