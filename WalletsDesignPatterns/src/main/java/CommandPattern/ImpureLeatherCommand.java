package CommandPattern;

public class ImpureLeatherCommand implements Command {
	DisplayReceiver disp;
	
	
	public ImpureLeatherCommand(DisplayReceiver disp) {
		this.disp = disp;
	}


	public boolean execute() {
		return disp.screenOn();

	}

}
