package ui;

import java.util.Scanner; //For reading user input.

public class Console {
	
	Scanner reader = new Scanner(System.in); //For setting up user input.
	
	public void startConsole()
	{
		MainMenu();
	}
	
	public void MainMenu()
	{
		int selection1 = primaryChoice();
		
		int selection2 = secondaryChoice();
		
		System.out.print("You wish to ");
		
		
		switch(selection1)
		{
			case 1:
				System.out.print("view ");
				break;
			case 2:
				System.out.print("create ");
				break;
			case 3:
				System.out.print("edit ");
				break;
			case 4:
				System.out.print("delete ");
				break;
		}
		
		System.out.print("a ");
		
		switch(selection2)
		{
			case 1:
				System.out.print("class.");
				break;
			case 2:
				System.out.print("assignment.");
				break;
			case 3:
				System.out.print("student.");
				break;
		}
	}
	
	public int primaryChoice()
	{
		int userSelection;
		System.out.println("Please enter the corresponding number for your selection.");
		System.out.println("1. View");
		System.out.println("2. Create");
		System.out.println("3. Edit");
		System.out.println("4. Delete");
		userSelection = reader.nextInt();
		return userSelection;
	}

	public int secondaryChoice()
	{
		int userSelection;
		System.out.println("Please enter the corresponding number for your selection.");
		System.out.println("1. Class");
		System.out.println("2. Assignment");
		System.out.println("3. Student");
		userSelection = reader.nextInt();
		
		return userSelection;
	}
	
	public void displayLogin() {

	}

	public void displayOption() {

	}

	public int selectOption() {
		return 0;
	}

	public boolean signIn(String username, String password) {
		return false;
	}

}
