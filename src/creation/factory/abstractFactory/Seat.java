package creation.factory.abstractFactory;

public interface Seat {
    void massage();
}

class LuxurySeat implements Seat{

    @Override
    public void massage() {
        System.out.println("按摩功能");
    }
}

class LowSeat implements Seat{

    @Override
    public void massage() {
        System.out.println("无按摩功能");
    }
}