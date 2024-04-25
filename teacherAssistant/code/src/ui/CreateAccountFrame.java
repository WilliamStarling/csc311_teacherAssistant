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

public class CreateAccountFrame implements ActionListener{
	
	JFrame frame1 = new JFrame("Teacher Assistant");
	
	JLabel f_TA_Label = new JLabel();
	JLabel f_userNameLabel = new JLabel();
	JLabel f_passwordLabel = new JLabel();
	JLabel f_passwordConfirm = new JLabel();
	JLabel f_passwordMismatch = new JLabel();
	JLabel f_userExists = new JLabel();
	JLabel f_loginPrompt = new JLabel();
	
	JTextField f_userNameTextBox = new JTextField();
	JTextField f_passwordTextBox = new JTextField();
	JTextField f_passwordConfirmBox = new JTextField();
	
	JButton f_createButton = new JButton("Create Account");
	JButton f_logInButton = new JButton("Log In");
	
	private Control f_session; //For storing the current control object that's being used.
	
	CreateAccountFrame(Control currentSession){
		
		f_session = currentSession;
		
		/*
		 * Setting screen width and height 1366 X 768
		 * */
		int screenWidth = 1366;
		int screenHeight = 768;
		
		/*
		 * Creating the Teacher Assistant Label above Login 
		 * */
		f_TA_Label.setBounds(490, 150, 400, 80);
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
		 * Creating the Password confirmation text above password confirmation box 
		 * */
		f_passwordConfirm.setBounds(550, 390, 300, 40);
		f_passwordConfirm.setText("Confirm Password:");
		f_passwordConfirm.setFont(new Font("Arial", Font.PLAIN, 20));
		f_passwordConfirm.setForeground(Color.GRAY);
		
		/*
		 * Creating the Password entry 
		 * */
		f_passwordTextBox.setBounds(550, 345, 250, 28);//250 pixels long 28 high
		f_passwordTextBox.addActionListener(this);
		
		/*
		 * Creating the Password confirmation box 
		 * */
		f_passwordConfirmBox.setBounds(550, 420, 250, 28);//250 pixels long 28 high
		f_passwordConfirmBox.addActionListener(this);
		
		/*
		 * Building the 'Create Account' button
		 * */
		f_createButton.setBounds(570, 525, 200, 40);
		f_createButton.addActionListener(this);
		f_createButton.setFocusable(false);
		f_createButton.setFont(new Font("Arial", Font.BOLD, 20));
		
		/*
		 * Login prompt Label under login 
		 * */
		f_loginPrompt.setBounds(568, 575, 260, 40);
		f_loginPrompt.setText("Already have an account?");
		f_loginPrompt.setFont(new Font("Arial", Font.PLAIN, 18));
		
		/*
		 * Building the 'Log In' button
		 * */
		f_logInButton.setBounds(570, 610, 200, 40);
		f_logInButton.addActionListener(this);
		f_logInButton.setFocusable(false);
		f_logInButton.setFont(new Font("Arial", Font.BOLD, 20));
		
		//Creates a label for if the login information wasn't correct. added to the frame when login fails.
		f_passwordMismatch.setBounds(375, 450, 700, 40);
		f_passwordMismatch.setText("The password entries do not match, please double check and try again.");
		f_passwordMismatch.setFont(new Font("Arial", Font.PLAIN, 20));
		f_passwordMismatch.setForeground(Color.RED);
		
		//Creates a label for if the login information wasn't correct. added to the frame when login fails.
		f_userExists.setBounds(375, 450, 700, 40);
		f_userExists.setText("This username is already in use, please choose another one.");
		f_userExists.setFont(new Font("Arial", Font.PLAIN, 20));
		f_userExists.setForeground(Color.RED);
		
		/*
		 * Adding everything to the frame
		 * */
		frame1.add(f_TA_Label);
		frame1.add(f_userNameLabel);
		frame1.add(f_passwordLabel);
		frame1.add(f_passwordConfirm);
		frame1.add(f_userNameTextBox);
		frame1.add(f_passwordTextBox);
		frame1.add(f_passwordConfirmBox);
		frame1.add(f_createButton);
		frame1.add(f_loginPrompt);
		frame1.add(f_logInButton);
		
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
		String f_passwordConf;
		
		if((e.getSource() == f_createButton) || e.getSource() == f_userNameTextBox || e.getSource() == f_passwordTextBox || e.getSource() == f_passwordConfirmBox) {
			f_accountName = f_userNameTextBox.getText();
			f_accountPass = f_passwordTextBox.getText();
			f_passwordConf = f_passwordConfirmBox.getText();
			
			if(f_accountPass.equals(f_passwordConf)) {
				if(f_session.createAccount(f_accountName, f_accountPass)) {
					frame1.dispose();
					new Home_Frame(f_session, f_accountName);
				} else {
					frame1.add(f_userExists);
					frame1.repaint();
				}
			}
			else {
				frame1.add(f_passwordMismatch);
				frame1.repaint();
			}
			
		}
		
		if(e.getSource() == f_logInButton) {
			frame1.dispose();
			new Log_In_Frame(f_session);
		}
	}
}
