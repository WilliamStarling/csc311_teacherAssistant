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

/**
 * This is the home menu for the app. Displays the classes available to the
 * user, as well as recently accessed objects.
 * 
 * @author Savannah
 */
public class Home_Frame implements ActionListener {
	
	public static String f_userName;
	
	JFrame homeFrame;
	// = new JFrame("Teacher Assistant - Home");
	
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
	JLabel currentClasses = new JLabel();
	JLabel recentActivity = new JLabel();
	
	LinePanel vertLine = new LinePanel();

	private Control f_session;

	/**
	 * This puts together the frame, and designs the objects that will be
	 * displayed.
	 * 
	 * @param currentSession The current control session in use, contains the
	 *        relevent information for the current user.
	 */
	Home_Frame(Control currentSession, String name) {

		f_session = currentSession;

		int screenWidth = 1366;
		int screenHeight = 768;
		
		f_userName = name;
		
		homeFrame = new JFrame("Teacher Assistant - " + f_userName);
		
		/*
		 * Creating the frame title Label
		 */
		frameLabel.setBounds(190, 30, 500, 80);
		frameLabel.setText("Home");
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
		accountLabel.setBounds(40, 100, 150, 80);
		accountLabel.setText("Account");
		accountLabel.setFont(new Font("Arial", Font.PLAIN, 23));
		accountLabel.setForeground(Color.BLUE);

		/*
		 * Creating the underline1 Label
		 * */
		underline1.setBounds(40, 101, 150, 80);
		underline1.setText("______");
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
		 * Creating the current classes Label
		 * */
		currentClasses.setBounds(210, 115, 200, 80);
		currentClasses.setText("Current Classes:");
		currentClasses.setFont(new Font("Arial", Font.PLAIN, 25));
		
		
		/*
		 * Creating the recent activity Label
		 * */
		recentActivity.setBounds(210, 450, 200, 80);
		recentActivity.setText("Recent Activity:");
		recentActivity.setFont(new Font("Arial", Font.PLAIN, 25));
		
		/*
		 * Making the log out Label clickable
		 */
		logOutLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homeFrame.dispose();
				new Log_In_Frame(f_session);

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// PASS

			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// PASS

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// PASS

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// PASS

			}

		});
		
		/*
		 * Making the help Label clickable
		 * */
		helpLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				homeFrame.dispose();
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
		 */
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
		homeFrame.add(currentClasses);
		homeFrame.add(recentActivity);
		homeFrame.add(vertLine);
		/*
		 * Frame Settings
		 */
		homeFrame.setSize(screenWidth, screenHeight); // 600 wide 400 high
														// //setting window
														// dimensions
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.setResizable(false);
		homeFrame.setLocationRelativeTo(null);
		homeFrame.setVisible(true);
	}

	/**
	 * This actionlistner class will perform the relevent actions when buttons
	 * are pressed or text boxes are entered.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
