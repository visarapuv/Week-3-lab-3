package CommandPattern;

public class Main {

	public static void main(String[] args) {
		 RemoteInvoker invoker = new RemoteInvoker();
		    DisplayReceiver disp = new DisplayReceiver();
		    Command lightsOn = new ImpureLeatherCommand(disp);
		    Command lightsOff = new PureLeatherCommand(disp);

		    
		    invoker.setCommand(lightsOn);
		    invoker.pressButton();


		    invoker.setCommand(lightsOff);
		    invoker.pressButton();

	}

}
