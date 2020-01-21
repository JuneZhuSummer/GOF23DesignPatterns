package creation.factory.abstractFactory;

public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("耐磨");
    }
}

class LowTyre implements Tyre{

    @Override
    public void revolve() {
        System.out.println("不耐磨");
    }
}