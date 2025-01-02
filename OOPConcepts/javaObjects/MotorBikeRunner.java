
 class MotorBike {
    //state
    int speed = 100;
    //behavior
    void start() {
        System.out.println("Bike started!");
    }
}

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();
        ducati.start();
        honda.start();
        System.out.println(ducati.speed);
    }
}