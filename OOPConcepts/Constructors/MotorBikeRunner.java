
class MotorBike {
    private int speed;

    MotorBike(int speed) {
            this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        if(speed > 0)
            this.speed = speed;
    }

    public void start() {
        System.out.println("Bike started!");
    }
}

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);
        ducati.start();		
        honda.start();
        
        System.out.printf("Earlier Ducati Speed is : %d", ducati.getSpeed()).println();
        System.out.printf("Earlier Honda Speed is : %d", honda.getSpeed()).println();
    }
}
