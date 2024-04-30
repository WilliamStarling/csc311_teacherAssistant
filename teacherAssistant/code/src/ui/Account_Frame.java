package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import application.Control;

public class Account_Frame implements ActionListener {
	
	Control f_session;
	public static String f_userName;
	
	JFrame accountFrame;
	
	JLabel frameLabel = new JLabel();
	JLabel homeLabel = new JLabel();
	JLabel classesLabel = new JLabel();
	JLabel helpLabel = new JLabel();
	JLabel logOutLabel = new JLabel();
	JLabel underline = new JLabel();
	JLabel underline1 = new JLabel();
	JLabel underline2 = new JLabel();
	JLabel underline3 = new JLabel();
	JLabel underline4 = new JLabel();
	
	JButton f_classesButton = new JButton("View All Courses");
	JButton f_editAccountButton = new JButton("Edit Account Information");
	
	LinePanel vertLine = new LinePanel();
	
	Account_Frame(Control currentSession, String f_name){
		
		f_session = currentSession;
		f_userName = f_name;
		
		int f_screenWidth = 1366;
		int f_screenHeight = 768;
		
		accountFrame = new JFrame("Teacher Assistant - " + f_name);
		
		/*
		 * Creating the frame title Label
		 * */
		frameLabel.setBounds(190, 30, 500, 80);
		frameLabel.setText("Account");
		frameLabel.setFont(new Font("Arial", Font.BOLD, 40));
		
		/*
		 * Creating the underline Label
		 * */
		underline.setBounds(185, 35, 1050, 80);
		underline.setText("_______________________________________________________________________________");
		underline.setFont(new Font("Arial", Font.PLAIN, 23));
		
		/*
		 * Creating the account Label
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
		 * Creating the classes Label
		 * */
		classesLabel.setBounds(40, 160, 150, 80);
		classesLabel.setText("Classes");
		classesLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		classesLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline2 Label
		 * */
		underline2.setBounds(40, 161, 150, 80);
		underline2.setText("______");
		underline2.setFont(new Font("Arial", Font.PLAIN, 23));
		underline2.setForeground(Color.BLUE);
		
		/*
		 * Creating the help Label
		 * */
		helpLabel.setBounds(40, 220, 150, 80);
		helpLabel.setText("Help");
		helpLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		helpLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline3 Label
		 * */
		underline3.setBounds(40, 221, 150, 80);
		underline3.setText("____");
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
		 * Building the 'view all courses' button
		 * */
		f_classesButton.setBounds(270, 165, 260, 40);
		f_classesButton.addActionListener(this);
		f_classesButton.setFocusable(false);
		f_classesButton.setFont(new Font("Arial", Font.PLAIN, 20));
		
		/*
		 * Building the 'edit account information' button
		 * */
		f_editAccountButton.setBounds(270, 215, 260, 40);
		f_editAccountButton.addActionListener(this);
		f_editAccountButton.setFocusable(false);
		f_editAccountButton.setFont(new Font("Arial", Font.PLAIN, 20));
		
		
		/*
		 * Making the log out Label clickable
		 * */
		logOutLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accountFrame.dispose();
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
				accountFrame.dispose();
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
		 * Making the help Label clickable
		 * */
		helpLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accountFrame.dispose();
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
		 * Making the classes Label clickable
		 * */
		classesLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				accountFrame.dispose();
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
		 * Adding everything to the frame
		 * */
		accountFrame.add(f_classesButton);
		accountFrame.add(f_editAccountButton);
		accountFrame.add(frameLabel);
		accountFrame.add(underline);
		accountFrame.add(homeLabel);
		accountFrame.add(underline1);
		accountFrame.add(classesLabel);
		accountFrame.add(underline2);
		accountFrame.add(helpLabel);
		accountFrame.add(underline3);
		accountFrame.add(logOutLabel);
		accountFrame.add(underline4);
		accountFrame.add(vertLine);
		
		/*
		 * Frame Settings
		 * */
		accountFrame.setSize(f_screenWidth, f_screenHeight); //600 wide 400 high //setting window dimensions
		accountFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accountFrame.setResizable(false);
		accountFrame.setLocationRelativeTo(null);
		accountFrame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == f_classesButton) {
			accountFrame.dispose();
			new Courses_Frame(f_session, f_userName);
		}
		
		if(e.getSource() == f_editAccountButton) {
			accountFrame.dispose();
			new Edit_Account_Frame(f_session, f_userName);
		}
		
	}

}
