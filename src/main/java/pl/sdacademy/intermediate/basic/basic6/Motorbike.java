package pl.sdacademy.intermediate.basic.basic6;

public class Motorbike implements Vehicle {
    public Motorbike() {
    }

    private static final int MAX_SPEED = 300;
    private int speed = 0;

    @Override
    public void accelerate() {
        if (speed < MAX_SPEED){
            speed += 30;
            if (speed>MAX_SPEED){
                speed = MAX_SPEED;
            }
        }
        else {
            System.out.println("Motorbike has already reached its maximum speed");
        }

    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
