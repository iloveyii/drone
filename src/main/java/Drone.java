public class Drone {


    private static  void blinkLights() {
        System.out.println("Blinking lights");
    }

    public static void main(String[] args) {
        System.out.println("Drone class");
        GroundSensor groundSensor = new GroundSensor();
        EngineController engineController = new EngineController();

        double altitude = groundSensor.getAltitude();
        System.out.println("Altitude :" + altitude);

        double desiredAltitude = 100.0;

        if(altitude > desiredAltitude) {
            engineController.throttleDown();
        }

        if(altitude < desiredAltitude) {
            engineController.throttleUp();
        }

        if(altitude == desiredAltitude) {
            blinkLights();
        }

    }
}
