package structural.bridge;

/**
 * @author 朱志军
 * @create 2020-02-12 23:22
 * @desc 电脑类型
 **/
public class Computer2 {
    private Brand brand;

    public Computer2(Brand brand) {
        this.brand = brand;
    }

    public void sale(){
        brand.sale();
    }

}

class Desktop2 extends Computer2{

    public Desktop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("卖的台式");
    }

}

class Laptop2 extends Computer2{

    public Laptop2(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        System.out.println("卖的笔记本");
    }
}