package structural.bridge;

/**
 * 未使用桥接模式
 */
public interface Computer {
    void sale();
}

class Desktop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售台式机");
    }
}

class Laptop implements Computer{

    @Override
    public void sale() {
        System.out.println("销售笔记本");
    }
}

class Pad implements Computer{

    @Override
    public void sale() {
        System.out.println("销售平板电脑");
    }
}

class AsusDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售华硕台式机");
    }
}

class AsusLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售华硕笔记本");
    }
}

class AsusPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售华硕平板电脑");
    }
}

class ShenZhouDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售神舟台式机");
    }
}

class ShenZhouLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售神舟笔记本");
    }
}

class ShenZhouPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售神舟平板电脑");
    }
}

class DellDesktop extends Desktop{
    @Override
    public void sale() {
        System.out.println("销售戴尔台式机");
    }
}

class DellLaptop extends Laptop{
    @Override
    public void sale() {
        System.out.println("销售戴尔笔记本");
    }
}

class DellPad extends Pad{
    @Override
    public void sale() {
        System.out.println("销售戴尔平板电脑");
    }
}
