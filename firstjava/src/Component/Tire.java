package Component;

public class Tire {
    private int size;

    public Tire() {
        System.out.println("Tire Construct");
        size = 0;
    }
    public int getSize() { return size; }

    public void setSize(int size) {
        this.size = size;
    }
}