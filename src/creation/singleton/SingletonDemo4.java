package creation.singleton;

/**
 * @author 朱志军
 * @create 2019-12-14 21:18
 * @desc 静态内部类
 **/
public class SingletonDemo4 {

    private SingletonDemo4() {
    }

    /**
     * 创建静态内部类，实例化外部类
     */
    private static class SingletonClassInstance{
        private static final SingletonDemo4 singleton = new SingletonDemo4();
    }

    public static SingletonDemo4 getInstance() {
        return SingletonClassInstance.singleton;
    }


}
