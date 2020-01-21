package creation.singleton;

/**
 * @author 朱志军
 * @create 2019-12-14 21:14
 * @desc 双重检测锁：由于编译器优化原因和JVM底层内部模型原因，偶尔会出问题，不建议使用。
 **/
public class SingletonDemo3 {

    private static SingletonDemo3 singleton;

    private SingletonDemo3() {
    }

    public static SingletonDemo3 getInstance() {
        if (singleton==null) {
            SingletonDemo3 instance;
            synchronized (SingletonDemo3.class) {
                instance = singleton;
                if (instance==null) {
                    synchronized (SingletonDemo3.class) {
                        instance = new SingletonDemo3();
                    }
                }
            }
            singleton = instance;
        }
        return singleton;
    }
}
