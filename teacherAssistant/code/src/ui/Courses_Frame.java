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

public class Courses_Frame implements ActionListener {
	
	public static String f_userName;
	
	JFrame coursesFrame;
	
	JLabel pageLabel = new JLabel();
	JLabel homeLabel = new JLabel();
	JLabel accountLabel = new JLabel();
	JLabel helpLabel = new JLabel();
	JLabel logOutLabel = new JLabel();
	JLabel underline = new JLabel();
	JLabel underline1 = new JLabel();
	JLabel underline2 = new JLabel();
	JLabel underline3 = new JLabel();
	JLabel underline4 = new JLabel();
	JLabel noCurrClasses = new JLabel();
	
	
	LinePanel vertLine = new LinePanel();
	
	Control f_session;
	
	Courses_Frame(Control f_currentSession, String f_name){
		
		f_session = f_currentSession;
		f_userName = f_name;
		
		int screenWidth = 1366;
		int screenHeight = 768;
		
		f_userName = f_name;
		
		coursesFrame = new JFrame("Teacher Assistant - " + f_userName);
		
		/*
		 * Creating the help page Label
		 * */
		pageLabel.setBounds(190, 30, 500, 80);
		pageLabel.setText("Classes");
		pageLabel.setFont(new Font("Arial", Font.BOLD, 40));
		
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
		 * Creating the no current classes Label
		 * */
		noCurrClasses.setBounds(610, 250, 230, 80);
		noCurrClasses.setText("**No current classes**");
		noCurrClasses.setFont(new Font("Arial", Font.ITALIC, 22));
		noCurrClasses.setForeground(Color.GRAY);
		
		/*
		 * Making the home Label clickable
		 * */
		homeLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				coursesFrame.dispose();
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
				coursesFrame.dispose();
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
		 * Making the help Label clickable
		 * */
		helpLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				coursesFrame.dispose();
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
		 * Making the log out Label clickable
		 * */
		logOutLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				coursesFrame.dispose();
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
		 * Adding everything to the frame
		 * */
		coursesFrame.add(pageLabel);
		coursesFrame.add(underline);
		coursesFrame.add(homeLabel);
		coursesFrame.add(underline1);
		coursesFrame.add(accountLabel);
		coursesFrame.add(underline2);
		coursesFrame.add(helpLabel);
		coursesFrame.add(underline3);
		coursesFrame.add(logOutLabel);
		coursesFrame.add(underline4);
		
		if (f_session.viewClasses() == null) {
			coursesFrame.add(noCurrClasses);
		}
		else {
			//add class list to frame
		}
		
		
		coursesFrame.add(vertLine);
		
		/*
		 * Frame Settings
		 * */
		coursesFrame.setSize(screenWidth, screenHeight); //600 wide 400 high //setting window dimensions
		coursesFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		coursesFrame.setResizable(false);
		coursesFrame.setLocationRelativeTo(null);
		coursesFrame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
