package CommandPattern;

public class PureLeatherCommand implements Command {

	DisplayReceiver disp;


	public PureLeatherCommand(DisplayReceiver disp) {
		this.disp = disp;
	}


	public boolean execute() {
		return disp.screenOff();

	}
}
