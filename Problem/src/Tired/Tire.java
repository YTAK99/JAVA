package Tired;

public class Tire {
    public int maxRotation;
    public int accumulateRoatation;
    public String location;

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }
    public boolean roll() {
        ++accumulateRoatation;
        if(accumulateRoatation < maxRotation) {
            System.out.println("");
        }
    }
}
