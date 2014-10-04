import java.net.Socket;


public class VMConnection {

	public static Socket androidClient;
	public static Socket raspberryPiClient;
	public static Socket androidClientForPi;
	
	public static void main(String[] args) {
		
//		int port = Integer.parseInt(args[0]);
		
		VMServerForPi androidServerForPi = new VMServerForPi(8500);
		
		androidServerForPi.start();
    	
        VMServer androidServer = new VMServer(3001);

        androidServer.start();
       
        VMServer raspberryPiServer = new VMServer(4000);
        
        raspberryPiServer.start();
        
        
        //RaspberryPiClient client = new RaspberryPiClient("acngroup10.utdallas.edu",5000);

        //client.start();
    }

}
