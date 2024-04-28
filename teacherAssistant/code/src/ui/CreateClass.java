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
 * This is the frame for making a new subject.
 * 
 * @author willi
 */
public class CreateClass implements ActionListener {

	public static String userName;
	public static String password;

	JFrame homeFrame;
	// = new JFrame("Teacher Assistant - Home");

	JLabel frameLabel = new JLabel();
	JLabel underline = new JLabel();

	private Control f_session;

	CreateClass(Control currentSession, String name, String pass) {
		f_session = currentSession;

		int screenWidth = 1366;
		int screenHeight = 768;

		userName = name;
		password = pass;

		homeFrame = new JFrame("Teacher Assistant - " + userName);

		/*
		 * Creating the frame title Label
		 */
		frameLabel.setBounds(190, 30, 500, 80);
		frameLabel.setText("Create Class");
		frameLabel.setFont(new Font("Arial", Font.BOLD, 40));

		/*
		 * Creating the underline Label Hopefully a temporary solution, plan to
		 * come back and do differently
		 */
		underline.setBounds(185, 35, 1050, 80);
		underline.setText(
				"____________________________________________________________________________");
		underline.setFont(new Font("Arial", Font.PLAIN, 23));

		/*
		 * Adding everything to the frame
		 */
		homeFrame.add(frameLabel);
		homeFrame.add(underline);

		/*
		 * Frame Settings
		 */
		homeFrame.setSize(screenWidth, screenHeight); // 600 wide 400 high
														// //setting window
														// dimensions
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.setResizable(false);
		homeFrame.setLayout(null);
		// homeFrame.getContentPane().add(new LinePanel());
		homeFrame.setLocationRelativeTo(null);
		homeFrame.setVisible(true);
	}

	/**
	 * The action performer for the class, performs the respective action when a
	 * button is pressed or a field is pressed enter on.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
