package ui;

import application.Control;

/**
 * This Class creates a new console session and starts up the first UI window, the login screen.
 * 
 * @author Savannah
 */
public class Launch {

	/*
	 * Creates the frame and the objects displayed on it.
	 */
	static Control newSession = new Control(); //For completing actions
	
	/**
	 * starts a new instance of the login screen and passes in the console session.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		new Log_In_Frame(newSession);
	}

}
