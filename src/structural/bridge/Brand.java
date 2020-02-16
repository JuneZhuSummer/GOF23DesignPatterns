package structural.bridge;

public interface Brand {
    void sale();
}

class Asus implements Brand {

    @Override
    public void sale() {
        System.out.println("销售华硕电脑");
    }
}

class Dell implements Brand {

    @Override
    public void sale() {
        System.out.println("销售戴尔电脑");
    }
}

class ShenZhou implements Brand {

    @Override
    public void sale() {
        System.out.println("销售神舟电脑");
    }
}
