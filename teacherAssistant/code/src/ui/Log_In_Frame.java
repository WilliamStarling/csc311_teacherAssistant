package ui;

import application.Control;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * This is the first window displayed when the program is started up. It prompts
 * the user with login information, or to move to a window to make a new
 * account.
 * 
 * @author Savannah and William
 */
public class Log_In_Frame implements ActionListener {

	JFrame frame1 = new JFrame("Teacher Assistant");

	JLabel TA_Label = new JLabel();
	JLabel userNameLabel = new JLabel();
	JLabel passwordLabel = new JLabel();
	JLabel accountPrompt = new JLabel();
	JLabel invalidLogin = new JLabel();

	JTextField userNameTextBox = new JTextField();
	JTextField passwordTextBox = new JTextField();

	JButton logInButton = new JButton("Log In");
	JButton createAccountButton = new JButton("Create an account");

	private Control f_session; // For storing the current control object that's
								// being used.

	/**
	 * This constructor designs the objects that will be displayed.
	 * 
	 * @param currentSession The current user session is passed through so
	 *                       information can continue to be used.
	 */
	Log_In_Frame(Control currentSession) {

		f_session = currentSession;

		/*
		 * Getting screen width and height for frame size Dimension screenSize =
		 * Toolkit.getDefaultToolkit().getScreenSize(); int screenHeight =
		 * screenSize.height; int screenWidth = screenSize.width;
		 */

		/*
		 * Setting screen width and height 1366 X 768
		 */
		int screenWidth = 1366;
		int screenHeight = 768;

		/*
		 * Creating the Teacher Assistant Label above Login 
		 * */
		f_TA_Label.setBounds(476, 150, 400, 80);
		f_TA_Label.setText("Teacher Assistant");
		f_TA_Label.setFont(new Font("Arial", Font.BOLD, 45));
		f_TA_Label.setForeground(Color.BLUE);
		
		/*
		 * Creating the userName Label above username entry 
		 * */
		f_userNameLabel.setBounds(550, 250, 200, 40);
		f_userNameLabel.setText("Username:");
		f_userNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		f_userNameLabel.setForeground(Color.GRAY);
		
		/*
		 * Creating the Username entry 
		 * */
		f_userNameTextBox.setBounds(550, 281, 250, 28);//250 pixels long 28 high
		f_userNameTextBox.addActionListener(this);
		
		/*
		 * Creating the Password Label above password entry 
		 * */
		f_passwordLabel.setBounds(550, 315, 200, 40);
		f_passwordLabel.setText("Password:");
		f_passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		f_passwordLabel.setForeground(Color.GRAY);
		
		
		/*
		 * Creating the Password entry 
		 * */
		f_passwordTextBox.setBounds(550, 345, 250, 28);//250 pixels long 28 high
		f_passwordTextBox.addActionListener(this);
		
		/*
		 * Building the 'Log In' button
		 * */
		f_logInButton.setBounds(570, 400, 200, 40);
		f_logInButton.addActionListener(this);
		f_logInButton.setFocusable(false);
		f_logInButton.setFont(new Font("Arial", Font.BOLD, 20));
		
		/*
		 * Creating the account prompt Label under login 
		 * */
		f_accountPrompt.setBounds(563, 495, 260, 40);
		f_accountPrompt.setText("Don't have an account yet?");
		f_accountPrompt.setFont(new Font("Arial", Font.PLAIN, 18));
		
		/*
		 * Building the 'create an account' button
		 * */
		f_createAccountButton.setBounds(572, 530, 200, 40);
		f_createAccountButton.addActionListener(this);
		f_createAccountButton.setFocusable(false);
		f_createAccountButton.setFont(new Font("Arial", Font.PLAIN, 20));
		f_createAccountButton.setForeground(Color.BLUE);
		
		//Creates a label for if the login information wasn't correct. added to 
		//the frame when login fails.
		f_invalidLogin.setBounds(387, 450, 700, 40);
		invalidLogin.setText(
				"Invalid login, please check username and password and try again.");
		f_invalidLogin.setFont(new Font("Arial", Font.PLAIN, 20));
		f_invalidLogin.setForeground(Color.RED);
		
		
		/*
		 * Adding everything to the frame
		 * */
		frame1.add(f_TA_Label);
		frame1.add(f_userNameLabel);
		frame1.add(f_passwordLabel);
		frame1.add(f_accountPrompt);
		frame1.add(f_userNameTextBox);
		frame1.add(f_passwordTextBox);
		frame1.add(f_logInButton);
		frame1.add(f_createAccountButton);

		/*
		 * Frame Settings
		 */
		frame1.setSize(screenWidth, screenHeight); // setting window dimensions
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setResizable(false);
		frame1.setLayout(null);
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);

	}

	/**
	 * Performs the relevent actions when the frame is interacted with.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		String f_accountName;
		String f_accountPass;
		
		
		if((e.getSource() == f_logInButton) || e.getSource() == f_userNameTextBox || e.getSource() == f_passwordTextBox) {
			f_accountName = f_userNameTextBox.getText();
			f_accountPass = f_passwordTextBox.getText();
			
			if(f_session.login(f_accountName, f_accountPass)) {
				frame1.dispose();
				new Home_Frame(f_session, f_accountName);
			}
			else {
				frame1.add(f_invalidLogin);
				frame1.repaint();
			}
			
		}
		else if(e.getSource() == f_createAccountButton) {
			frame1.dispose();
			new CreateAccountFrame(f_session);
		}
	}
}
