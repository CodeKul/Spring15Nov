package ioc;

public class Mobile {
    public static void main(String[] args) {
        Sim sim = new Vodafone();
        sim.calling();
        sim.data();
    }
}
