package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import application.Control;

public class Help_Frame implements ActionListener{
	
	public static String userName;
	
	JFrame helpFrame;
	
	JLabel helpPageLabel = new JLabel();
	JLabel homeLabel = new JLabel();
	JLabel accountLabel = new JLabel();
	JLabel classesLabel = new JLabel();
	JLabel logOutLabel = new JLabel();
	JLabel underline = new JLabel();
	JLabel underline1 = new JLabel();
	JLabel underline2 = new JLabel();
	JLabel underline3 = new JLabel();
	JLabel underline4 = new JLabel();
	JLabel usingTALabel = new JLabel();
	JLabel editAccount1 = new JLabel();
	JLabel editAccount2 = new JLabel();
	JLabel exitInstructions = new JLabel();
	
	LinePanel vertLine = new LinePanel();
	
	Control session;
	
	Help_Frame (Control currentSession, String name){
		session = currentSession;
		userName = name;
		
		int screenWidth = 1366;
		int screenHeight = 768;
		
		userName = name;
		
		helpFrame = new JFrame("Teacher Assistant - " + userName);
		
		/*
		 * Creating the help page Label
		 * */
		helpPageLabel.setBounds(190, 30, 500, 80);
		helpPageLabel.setText("Help Page");
		helpPageLabel.setFont(new Font("Arial", Font.BOLD, 40));
		
		/*
		 * Creating the underline Label
		 * */
		underline.setBounds(185, 35, 1050, 80);
		underline.setText("_______________________________________________________________________________");
		underline.setFont(new Font("Arial", Font.PLAIN, 23));
		
		/*
		 * Creating the home Label
		 * */
		homeLabel.setBounds(40, 100, 150, 80);
		homeLabel.setText("Home");
		homeLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		homeLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline1 Label
		 * */
		underline1.setBounds(40, 101, 150, 80);
		underline1.setText("_____");
		underline1.setFont(new Font("Arial", Font.PLAIN, 23));
		underline1.setForeground(Color.BLUE);
		
		/*
		 * Creating the account Label
		 * */
		accountLabel.setBounds(40, 160, 150, 80);
		accountLabel.setText("Account");
		accountLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		accountLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline2 Label
		 * */
		underline2.setBounds(40, 161, 150, 80);
		underline2.setText("______");
		underline2.setFont(new Font("Arial", Font.PLAIN, 23));
		underline2.setForeground(Color.BLUE);
		
		/*
		 * Creating the classes Label
		 * */
		classesLabel.setBounds(40, 220, 150, 80);
		classesLabel.setText("Classes");
		classesLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		classesLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline3 Label
		 * */
		underline3.setBounds(40, 221, 150, 80);
		underline3.setText("______");
		underline3.setFont(new Font("Arial", Font.PLAIN, 23));
		underline3.setForeground(Color.BLUE);
		
		/*
		 * Creating the log out Label
		 * */
		logOutLabel.setBounds(40, 280, 150, 80);
		logOutLabel.setText("Log Out");
		logOutLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		logOutLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline4 Label
		 * */
		underline4.setBounds(40, 281, 150, 80);
		underline4.setText("______");
		underline4.setFont(new Font("Arial", Font.PLAIN, 23));
		underline4.setForeground(Color.BLUE);
		
		/*
		 * Creating the using teacher assistant section Label
		 * */
		usingTALabel.setBounds(190, 115, 300, 80);
		usingTALabel.setText("Using Teacher Assistant:");
		usingTALabel.setFont(new Font("Arial", Font.BOLD, 19));
		
		/*
		 * Creating the edit account instruction Label
		 * */
		editAccount1.setBounds(210, 150, 1000, 80);
		editAccount1.setText("- Edit account information: To edit your account information such as your username or password"
				+ " click on the word 'Account' to the left");
		editAccount1.setFont(new Font("Arial", Font.PLAIN, 17));
		
		editAccount2.setBounds(408, 170, 1000, 80);
		editAccount2.setText("of the window. This will take you to your account page."
				+ " From there, select the 'Edit Account Information' button.");
		editAccount2.setFont(new Font("Arial", Font.PLAIN, 17));
		
		/*
		 * Creating the exit program instruction Label
		 * */
		exitInstructions.setBounds(210, 210, 1000, 80);
		exitInstructions.setText("- Exit program: To exit Teacher Assistant, click the 'X' in the top right corner of the window.");
		exitInstructions.setFont(new Font("Arial", Font.PLAIN, 17));
		
		
		
		/*
		 * Making the log out Label clickable
		 * */
		logOutLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				helpFrame.dispose();
				new Log_In_Frame(session);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				//PASS
				
			}
			
		});
		
		/*
		 * Making the home Label clickable
		 * */
		homeLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				helpFrame.dispose();
				new Home_Frame(session, userName);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				//PASS
				
			}
			
		});
		/*
		 * Making the account Label clickable
		 * */
		accountLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				helpFrame.dispose();
				new Account_Frame(session, userName);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				//PASS
				
			}
			
		});
		/*
		 * Making the classes Label clickable
		 * */
		classesLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				helpFrame.dispose();
				new Courses_Frame(session, userName);
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				//PASS
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				//PASS
				
			}
			
		});
		
		
		
		
		/*
		 * Adding everything to the frame
		 * */
		helpFrame.add(helpPageLabel);
		helpFrame.add(underline);
		helpFrame.add(homeLabel);
		helpFrame.add(underline1);
		helpFrame.add(accountLabel);
		helpFrame.add(underline2);
		helpFrame.add(classesLabel);
		helpFrame.add(underline3);
		helpFrame.add(logOutLabel);
		helpFrame.add(underline4);
		helpFrame.add(usingTALabel);
		helpFrame.add(editAccount1);
		helpFrame.add(editAccount2);
		helpFrame.add(exitInstructions);
		helpFrame.add(vertLine);
		
		/*
		 * Frame Settings
		 * */
		helpFrame.setSize(screenWidth, screenHeight); //600 wide 400 high //setting window dimensions
		helpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		helpFrame.setResizable(false);
		helpFrame.setLocationRelativeTo(null);
		helpFrame.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
