package Component;

public class Sedan {
    public static void main(String[] args) {
        Tire compoTire = new Tire();
        compoTire.setSize(30);

        System.out.println(compoTire.getSize());
    }
}