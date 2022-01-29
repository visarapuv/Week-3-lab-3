package patternprojects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import CommandPattern.Command;
import CommandPattern.DisplayReceiver;
import CommandPattern.RemoteInvoker;
import CommandPattern.PureLeatherCommand;
import CommandPattern.ImpureLeatherCommand;


class TestCommandPattern {

	@Test
	void testPCScreen() {
		 RemoteInvoker invoker = new RemoteInvoker();
		    DisplayReceiver disp = new DisplayReceiver();
		    Command leatherOn = new ImpureLeatherCommand(disp);
		    Command leatherOff = new PureLeatherCommand(disp);

		    
		    invoker.setCommand(leatherOn);
		    invoker.pressButton();


		    invoker.setCommand(leatherOff);
		    invoker.pressButton();
		 
		 //Invoker invokes command 
		 assertEquals(false, invoker.pressButton());
	}
	
	

}
