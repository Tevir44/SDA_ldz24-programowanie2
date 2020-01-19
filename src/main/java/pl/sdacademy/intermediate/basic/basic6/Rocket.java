package pl.sdacademy.intermediate.basic.basic6;

public class Rocket implements Vehicle {
    public Rocket() {
    }

    private static final int MAX_SPEED = Integer.MAX_VALUE;
    private int speed = 0;

    @Override
    public void accelerate() {
        if (speed < MAX_SPEED){
            speed += 10000;
            if (speed<=0){
                speed = MAX_SPEED;
            }
        }
        else {
            System.out.println("Rocket has already reached its maximum speed");
        }

    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
