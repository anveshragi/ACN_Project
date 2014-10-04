
public class RaspberryPiConnection {
	
	public static void main(String[] args) {
              
        RaspberryPiClient raspberryPiClient = new RaspberryPiClient("acngroup10.utdallas.edu",4000);

        raspberryPiClient.start();
//        ControlGpioOnPi controlGpioOnPi = new ControlGpioOnPi();
//        controlGpioOnPi.LockDoor();
//        controlGpioOnPi.unLockDoor();
    }

}
