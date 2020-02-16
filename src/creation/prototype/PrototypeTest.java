package creation.prototype;

import org.junit.Test;

import java.io.*;
import java.util.Date;

/**
 * @author 朱志军
 * @create 2020-01-17 22:32
 * @desc 测试原型模式
 **/
public class PrototypeTest {

    /**
     * 测试浅克隆
     *
     * @throws CloneNotSupportedException
     */

    @Test
    public void test01() throws CloneNotSupportedException {
        Date date = new Date(2222222222L);
        Sheep s1 = new Sheep("浅多莉", date);
        Sheep s2 = (Sheep) s1.clone();


        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());

        System.out.println(s2.getBirthday());
        date.setTime(555555555555L);
        System.out.println(s1.getBirthday());

        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println(s2.getBirthday());
    }

    /**
     * 测试深复制（手动实现）
     *
     * @throws CloneNotSupportedException
     */
    @Test
    public void test02() throws CloneNotSupportedException {
        Date date = new Date(2222222222L);
        Sheep2 s1 = new Sheep2("深多莉", date);
        Sheep2 s2 = (Sheep2) s1.clone();


        System.out.println("s1:"+s1);
        System.out.println("s1.getSname():"+s1.getSname());
        System.out.println("s1.getBirthday():"+s1.getBirthday());

        System.out.println("s2:"+s2);
        System.out.println("s2.getBirthday():"+s2.getBirthday());
        date.setTime(555555555555L);
        System.out.println("s1.getBirthday():"+s1.getBirthday());

        System.out.println("s2:"+s2);
        System.out.println("s2.getSname():"+s2.getSname());
        System.out.println("s2.getBirthday():"+s2.getBirthday());
    }

    /**
     * 测试深拷贝（序列化和反序列化方式）
     * @throws Exception
     */
    @Test
    public void test03() throws Exception {
        Date date = new Date(2222222222L);
        Sheep s1 = new Sheep("深多莉", date);


        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println("修改前s1的生日：" + s1.getBirthday());

        //利用序列化和反序列化实现深拷贝
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep) ois.readObject();

        System.out.println("修改前s2的生日：" + s1.getBirthday());
        date.setTime(555555555555L);
        System.out.println("修改后s1的生日：" + s1.getBirthday());

        System.out.println(s2);
        System.out.println(s2.getSname());
        System.out.println("修改后s2的生日：" + s1.getBirthday());
    }


    public void testNew(int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop t = new Laptop();
        }
        long end = System.currentTimeMillis();
        System.out.println("new的方式创建耗时：" + (end - start) + "ms");
    }

    public void testClone(int size) throws CloneNotSupportedException {
        Laptop t = new Laptop();
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Laptop temp = (Laptop) t.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("clone的方式创建耗时：" + (end - start) + "ms");
    }


    /**
     * 测试new方式和clone方式创建对象的速度差异
     *
     * @throws CloneNotSupportedException
     */
    @Test
    public void test04() throws CloneNotSupportedException {
        testNew(1000);
        testClone(1000);
    }

}

class Laptop implements Cloneable {
    public Laptop() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

