package creation.factory.abstractFactory;

public interface Engine {
    void run();
    void start();
}

class LuxuryEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转得快");
    }

    @Override
    public void start() {
        System.out.println("自动启停");
    }
}

class LowEngine implements Engine{

    @Override
    public void run() {
        System.out.println("转得慢");
    }

    @Override
    public void start() {
        System.out.println("不能自动启停");
    }
}