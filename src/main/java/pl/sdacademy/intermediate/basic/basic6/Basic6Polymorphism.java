package pl.sdacademy.intermediate.basic.basic6;

public class Basic6Polymorphism {

    public static int moveNTimesFast(Vehicle vehicle, int times){
        for (int i = 0; i< times; i++){
            vehicle.accelerate();
        }
        return vehicle.getSpeed();

    }

    public static void main(String[] args) {
        Vehicle motorbike = new Motorbike();
        System.out.println("Motorbike speed: " + moveNTimesFast(motorbike,12));
        System.out.println();

        Vehicle bicycle = new Bicycle();
        moveNTimesFast(bicycle,7);
        System.out.println("Bicycle speed: " + bicycle.getSpeed());
        System.out.println();

        Vehicle rocket = new Rocket();
        moveNTimesFast(rocket,100002);
        System.out.println("Rocket speed: " + rocket.getSpeed());

    }

}
