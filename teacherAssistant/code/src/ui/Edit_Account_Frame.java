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

public class Edit_Account_Frame implements ActionListener {

public static String f_userName;
	
	JFrame editAccountFrame;
	
	JLabel editAccountLabel = new JLabel();
	JLabel homeLabel = new JLabel();
	JLabel accountLabel = new JLabel();
	JLabel classesLabel = new JLabel();
	JLabel helpLabel = new JLabel();
	JLabel logOutLabel = new JLabel();
	JLabel underline = new JLabel();
	JLabel underline1 = new JLabel();
	JLabel underline2 = new JLabel();
	JLabel underline3 = new JLabel();
	JLabel underline4 = new JLabel();
	JLabel underline5 = new JLabel();
	
	JLabel defaultMessage = new JLabel();
	
	
	LinePanel vertLine = new LinePanel();
	
	Control f_session;
	
	Edit_Account_Frame (Control currentSession, String name){
		f_session = currentSession;
		f_userName = name;
		
		int screenWidth = 1366;
		int screenHeight = 768;
		
		f_userName = name;
		
		editAccountFrame = new JFrame("Teacher Assistant - " + f_userName);
		
		/*
		 * Creating the help page Label
		 * */
		editAccountLabel.setBounds(190, 30, 500, 80);
		editAccountLabel.setText("Edit Account");
		editAccountLabel.setFont(new Font("Arial", Font.BOLD, 40));
		
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
		 * Creating the help Label
		 * */
		helpLabel.setBounds(40, 280, 150, 80);
		helpLabel.setText("Help");
		helpLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		helpLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline4 Label
		 * */
		underline4.setBounds(40, 281, 150, 80);
		underline4.setText("____");
		underline4.setFont(new Font("Arial", Font.PLAIN, 23));
		underline4.setForeground(Color.BLUE);
		
		/*
		 * Creating the log out Label
		 * */
		logOutLabel.setBounds(40, 340, 150, 80);
		logOutLabel.setText("Log Out");
		logOutLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		logOutLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline4 Label
		 * */
		underline5.setBounds(40, 341, 150, 80);
		underline5.setText("______");
		underline5.setFont(new Font("Arial", Font.PLAIN, 23));
		underline5.setForeground(Color.BLUE);
		
		/*
		 * Creating the default message Label
		 * */
		defaultMessage.setBounds(455, 250, 515, 80);
		defaultMessage.setText("The Edit Account page is still under construction...");
		defaultMessage.setFont(new Font("Arial", Font.ITALIC, 22));
		defaultMessage.setForeground(Color.GRAY);
		
		
		
		/*
		 * Making the log out Label clickable
		 * */
		logOutLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editAccountFrame.dispose();
				new Log_In_Frame(f_session);
				
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
				editAccountFrame.dispose();
				new Home_Frame(f_session, f_userName);
				
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
				editAccountFrame.dispose();
				new Account_Frame(f_session, f_userName);
				
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
				editAccountFrame.dispose();
				new Courses_Frame(f_session, f_userName);
				
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
		 * Making the help Label clickable
		 * */
		helpLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				editAccountFrame.dispose();
				new Help_Frame(f_session, f_userName);
				
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
		editAccountFrame.add(editAccountLabel);
		editAccountFrame.add(underline);
		editAccountFrame.add(homeLabel);
		editAccountFrame.add(underline1);
		editAccountFrame.add(accountLabel);
		editAccountFrame.add(underline2);
		editAccountFrame.add(classesLabel);
		editAccountFrame.add(underline3);
		editAccountFrame.add(helpLabel);
		editAccountFrame.add(underline4);
		editAccountFrame.add(logOutLabel);
		editAccountFrame.add(underline5);
		editAccountFrame.add(defaultMessage);
		
		editAccountFrame.add(vertLine);
		
		/*
		 * Frame Settings
		 * */
		editAccountFrame.setSize(screenWidth, screenHeight); //600 wide 400 high //setting window dimensions
		editAccountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		editAccountFrame.setResizable(false);
		editAccountFrame.setLocationRelativeTo(null);
		editAccountFrame.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
