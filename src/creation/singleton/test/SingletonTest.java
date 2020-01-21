package creation.singleton.test;

import org.junit.Test;
import creation.singleton.*;

import java.util.concurrent.CountDownLatch;

/**
 * @author 朱志军
 * @create 2019-12-14 21:04
 * @desc 单例模式测试
 **/
public class SingletonTest implements Runnable{

    @Test
    public void test1(){
        SingletonDemo1 singleton1 = SingletonDemo1.getInstance();
        System.out.println(singleton1.hashCode());
        SingletonDemo1 singleton2 = SingletonDemo1.getInstance();
        System.out.println(singleton2.hashCode());
    }

    @Test
    public void test2(){
        SingletonDemo2 singleton1 = SingletonDemo2.getInstance();
        System.out.println(singleton1.hashCode());
        SingletonDemo2 singleton2 = SingletonDemo2.getInstance();
        System.out.println(singleton2.hashCode());
    }

    @Test
    public void test3(){
        SingletonDemo3 singleton1 = SingletonDemo3.getInstance();
        System.out.println(singleton1.hashCode());
        SingletonDemo3 singleton2 = SingletonDemo3.getInstance();
        System.out.println(singleton2.hashCode());
    }

    @Test
    public void test4(){
        SingletonDemo4 singleton1 = SingletonDemo4.getInstance();
        System.out.println(singleton1.hashCode());
        SingletonDemo4 singleton2 = SingletonDemo4.getInstance();
        System.out.println(singleton2.hashCode());
    }

    @Test
    public void test5(){
        SingletonDemo5 singleton1 = SingletonDemo5.SINGLETON;
        System.out.println(singleton1.hashCode());
        SingletonDemo5 singleton2 = SingletonDemo5.SINGLETON;
        System.out.println(singleton2.hashCode());
    }

    @Test
    public void spendTime1() throws Exception{
        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                for (int j=0;j<1000000;j++){
                    Object o = SingletonDemo1.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();                 //阻塞main线程，直到计数器为0，才继续向下执行
        long end = System.currentTimeMillis();
        System.out.println("饿汉式总耗时："+(end-start)+"ms");
    }

    @Test
    public void spendTime2() throws Exception{
        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                for (int j=0;j<1000000;j++){
                    Object o = SingletonDemo2.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();                 //阻塞main线程，直到计数器为0，才继续向下执行
        long end = System.currentTimeMillis();
        System.out.println("懒汉式总耗时："+(end-start)+"ms");
    }

    @Test
    public void spendTime3() throws Exception{
        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                for (int j=0;j<1000000;j++){
                    Object o = SingletonDemo3.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();                 //阻塞main线程，直到计数器为0，才继续向下执行
        long end = System.currentTimeMillis();
        System.out.println("双重检测锁式总耗时："+(end-start)+"ms");
    }
    @Test
    public void spendTime4() throws Exception{
        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                for (int j=0;j<1000000;j++){
                    Object o = SingletonDemo4.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();                 //阻塞main线程，直到计数器为0，才继续向下执行
        long end = System.currentTimeMillis();
        System.out.println("静态内部类式总耗时："+(end-start)+"ms");
    }
    @Test
    public void spendTime5() throws Exception{
        long start = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                for (int j=0;j<1000000;j++){
                    Object o = SingletonDemo5.SINGLETON;
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();                 //阻塞main线程，直到计数器为0，才继续向下执行
        long end = System.currentTimeMillis();
        System.out.println("枚举式总耗时："+(end-start)+"ms");
    }

    @Override
    public void run() {

    }
}
