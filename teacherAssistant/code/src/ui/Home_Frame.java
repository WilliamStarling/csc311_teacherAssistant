package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home_Frame implements ActionListener {
	
	public static String userName;
	public static String password;
	
	JFrame homeFrame;
	//= new JFrame("Teacher Assistant - Home");
	
	JLabel frameLabel = new JLabel();
	JLabel accountLabel = new JLabel();
	JLabel classesLabel = new JLabel();
	JLabel helpLabel = new JLabel();
	JLabel logOutLabel = new JLabel();
	JLabel underline = new JLabel();
	JLabel underline1 = new JLabel();
	JLabel underline2 = new JLabel();
	JLabel underline3 = new JLabel();
	JLabel underline4 = new JLabel();

	
	Home_Frame(String name, String pass){
		int screenWidth = 1366;
		int screenHeight = 768;
		
		userName = name;
		password = pass;
		
		homeFrame = new JFrame("Teacher Assistant - " + userName);
		
		/*
		 * Creating the frame title Label
		 * */
		frameLabel.setBounds(190, 30, 500, 80);
		frameLabel.setText("Home");
		frameLabel.setFont(new Font("Arial", Font.BOLD, 40));
		
		/*
		 * Creating the underline Label
		 * Hopefully a temporary solution, plan to come back and do differently
		 * */
		underline.setBounds(185, 35, 1050, 80);
		underline.setText("____________________________________________________________________________");
		underline.setFont(new Font("Arial", Font.PLAIN, 23));
		
		/*
		 * Creating the account Label
		 * */
		accountLabel.setBounds(50, 100, 150, 80);
		accountLabel.setText("Account");
		accountLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		accountLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline1 Label
		 * */
		underline1.setBounds(50, 101, 150, 80);
		underline1.setText("______");
		underline1.setFont(new Font("Arial", Font.PLAIN, 23));
		underline1.setForeground(Color.BLUE);
		
		/*
		 * Creating the classes Label
		 * */
		classesLabel.setBounds(50, 160, 150, 80);
		classesLabel.setText("Classes");
		classesLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		classesLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline2 Label
		 * */
		underline2.setBounds(50, 161, 150, 80);
		underline2.setText("______");
		underline2.setFont(new Font("Arial", Font.PLAIN, 23));
		underline2.setForeground(Color.BLUE);
		
		/*
		 * Creating the help Label
		 * */
		helpLabel.setBounds(50, 220, 150, 80);
		helpLabel.setText("Help");
		helpLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		helpLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline3 Label
		 * */
		underline3.setBounds(50, 221, 150, 80);
		underline3.setText("____");
		underline3.setFont(new Font("Arial", Font.PLAIN, 23));
		underline3.setForeground(Color.BLUE);
		
		/*
		 * Creating the log out Label
		 * */
		logOutLabel.setBounds(50, 280, 150, 80);
		logOutLabel.setText("Log Out");
		logOutLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		logOutLabel.setForeground(Color.BLUE);
		
		/*
		 * Creating the underline4 Label
		 * */
		underline4.setBounds(50, 281, 150, 80);
		underline4.setText("______");
		underline4.setFont(new Font("Arial", Font.PLAIN, 23));
		underline4.setForeground(Color.BLUE);
		
		/*
		 * Making the log out Label clickable
		 * */
		logOutLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homeFrame.dispose();
				new Log_In_Frame();
				
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
		homeFrame.add(frameLabel);
		homeFrame.add(underline);
		homeFrame.add(accountLabel);
		homeFrame.add(underline1);
		homeFrame.add(classesLabel);
		homeFrame.add(underline2);
		homeFrame.add(helpLabel);
		homeFrame.add(underline3);
		homeFrame.add(logOutLabel);
		homeFrame.add(underline4);
		
		/*
		 * Frame Settings
		 * */
		homeFrame.setSize(screenWidth, screenHeight); //600 wide 400 high //setting window dimensions
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.setResizable(false);
		homeFrame.setLayout(null);
		//homeFrame.getContentPane().add(new LinePanel());
		homeFrame.setLocationRelativeTo(null);
		homeFrame.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
