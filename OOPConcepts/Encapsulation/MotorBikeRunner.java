
class MotorBike {
    private int speed;

    public void start() {
        System.out.println("Bike started!");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();
        ducati.start();		
        honda.start();
        ducati.setSpeed(100);
        
        System.out.printf("Earlier Ducati Speed is : %d", ducati.getSpeed()).println();
        System.out.printf("Earlier Honda Speed is : %d", honda.getSpeed()).println();
    
        int ducatiSpeed = ducati.getSpeed();
        ducatiSpeed = ducatiSpeed + 100;
        ducati.setSpeed(ducatiSpeed);
        
        int hondaSpeed = honda.getSpeed();
        hondaSpeed = hondaSpeed + 100;
        honda.setSpeed(hondaSpeed);
        
        System.out.printf("Later Ducati Speed is : %d", ducati.getSpeed()).println();
        System.out.printf("Later Honda Speed is : %d", honda.getSpeed()).println();
    }
}
