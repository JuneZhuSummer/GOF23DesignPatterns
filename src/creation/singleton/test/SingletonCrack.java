package creation.singleton.test;

import org.junit.Test;
import creation.singleton.SingletonDemo2;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author 朱志军
 * @create 2019-12-29 14:20
 * @desc 破解单例模式--以懒汉式实现为例
 **/
public class SingletonCrack {
    @Test
    public void crack1() throws Exception {
        SingletonDemo2 s1 = SingletonDemo2.getInstance();
        SingletonDemo2 s2 = SingletonDemo2.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //通过反射破解
        Class<SingletonDemo2> clazz = (Class<SingletonDemo2>) Class.forName("creation.singleton.SingletonDemo2");

        Constructor<SingletonDemo2> constructors = clazz.getDeclaredConstructor(null);

        //跳过权限访问
        constructors.setAccessible(true);

        SingletonDemo2 s3 = constructors.newInstance();
        SingletonDemo2 s4 = constructors.newInstance();

        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

    }

    @Test
    public void crack2(){
        SingletonDemo2 s1 = SingletonDemo2.getInstance();
        SingletonDemo2 s2 = SingletonDemo2.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        //通过序列化、反序列化破解
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois;
        FileInputStream fis;
        try {
            fos = new FileOutputStream("d:/Text/TestBuilder/a.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            fis = new FileInputStream("d:/Text/TestBuilder/a.txt");
            ois = new ObjectInputStream(fis);
            SingletonDemo2 s3 = (SingletonDemo2) ois.readObject();
            System.out.println(s3.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                oos.close();
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
