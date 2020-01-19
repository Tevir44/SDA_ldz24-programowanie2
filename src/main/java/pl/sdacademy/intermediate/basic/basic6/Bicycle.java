package pl.sdacademy.intermediate.basic.basic6;

public class Bicycle implements Vehicle {
    public Bicycle() {
    }

    private static final int MAX_SPEED = 50;
    private int speed = 0;

    @Override
    public void accelerate() {
        if (speed < MAX_SPEED){
            speed += 5;
            if (speed>MAX_SPEED){
                speed = MAX_SPEED;
            }
        }
        else {
            System.out.println("Bicycle has already reached its maximum speed");
        }

    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
