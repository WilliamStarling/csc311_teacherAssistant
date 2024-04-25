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

public class Log_In_Frame implements ActionListener{
	
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
	
	private Control f_session; //For storing the current control object that's being used.
	
	Log_In_Frame(Control currentSession){
		
		f_session = currentSession;
		
		/*
		 * Getting screen width and height for frame size
		 * Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		 * int screenHeight = screenSize.height;
		 * int screenWidth = screenSize.width;
		 * */
		
		/*
		 * Setting screen width and height 1366 X 768
		 * */
		int screenWidth = 1366;
		int screenHeight = 768;
		
		/*
		 * Creating the Teacher Assistant Label above Login 
		 * */
		TA_Label.setBounds(490, 150, 400, 80);
		TA_Label.setText("Teacher Assistant");
		TA_Label.setFont(new Font("Arial", Font.BOLD, 45));
		TA_Label.setForeground(Color.BLUE);
		
		/*
		 * Creating the userName Label above username entry 
		 * */
		userNameLabel.setBounds(550, 250, 200, 40);
		userNameLabel.setText("Username:");
		userNameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		userNameLabel.setForeground(Color.GRAY);
		
		/*
		 * Creating the Username entry 
		 * */
		userNameTextBox.setBounds(550, 281, 250, 28);//250 pixels long 28 high
		userNameTextBox.addActionListener(this);
		
		/*
		 * Creating the Password Label above password entry 
		 * */
		passwordLabel.setBounds(550, 315, 200, 40);
		passwordLabel.setText("Password:");
		passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		passwordLabel.setForeground(Color.GRAY);
		
		
		/*
		 * Creating the Password entry 
		 * */
		passwordTextBox.setBounds(550, 345, 250, 28);//250 pixels long 28 high
		passwordTextBox.addActionListener(this);
		
		/*
		 * Building the 'Log In' button
		 * */
		logInButton.setBounds(570, 400, 200, 40);
		logInButton.addActionListener(this);
		logInButton.setFocusable(false);
		logInButton.setFont(new Font("Arial", Font.BOLD, 20));
		
		/*
		 * Creating the account prompt Label under login 
		 * */
		accountPrompt.setBounds(568, 495, 260, 40);
		accountPrompt.setText("Don't have an account yet?");
		accountPrompt.setFont(new Font("Arial", Font.PLAIN, 18));
		
		/*
		 * Building the 'create an account' button
		 * */
		createAccountButton.setBounds(575, 530, 200, 40);
		createAccountButton.addActionListener(this);
		createAccountButton.setFocusable(false);
		createAccountButton.setFont(new Font("Arial", Font.PLAIN, 20));
		createAccountButton.setForeground(Color.BLUE);
		
		//Creates a label for if the login information wasn't correct. added to the frame when login fails.
		invalidLogin.setBounds(375, 450, 700, 40);
		invalidLogin.setText("Invalid login, please check username and password and try again.");
		invalidLogin.setFont(new Font("Arial", Font.PLAIN, 20));
		invalidLogin.setForeground(Color.RED);
		
		
		/*
		 * Adding everything to the frame
		 * */
		frame1.add(TA_Label);
		frame1.add(userNameLabel);
		frame1.add(passwordLabel);
		frame1.add(accountPrompt);
		frame1.add(userNameTextBox);
		frame1.add(passwordTextBox);
		frame1.add(logInButton);
		frame1.add(createAccountButton);
		
		/*
		 * Frame Settings
		 * */
		frame1.setSize(screenWidth, screenHeight); //setting window dimensions
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setResizable(false);
		frame1.setLayout(null);
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String f_accountName;
		String f_accountPass;
		
		
		if((e.getSource() == logInButton) || e.getSource() == userNameTextBox || e.getSource() == passwordTextBox) {
			f_accountName = userNameTextBox.getText();
			f_accountPass = passwordTextBox.getText();
			
			if(f_session.login(f_accountName, f_accountPass)) {
				frame1.dispose();
				new Home_Frame(f_session, f_accountName, f_accountPass);
			}
			else {
				frame1.add(invalidLogin);
				frame1.repaint();
			}
			
		}
		else if(e.getSource() == createAccountButton)
		{
			frame1.dispose();
			new CreateAccountFrame(f_session);
		}
	}
}
