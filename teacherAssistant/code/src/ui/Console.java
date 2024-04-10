package ui;

import application.Control;
import java.util.Scanner; //For reading user input.

public class Console {
	
	 static Scanner reader = new Scanner(System.in); //For setting up user input.
	 static Control newSession = new Control(); //For completing actions
	
	/*
	 *This is the main loop. When you start up the software it runs first.
	 *It creates a new control object to control this class, and then starts the main menu.
	 * 
	 * @param args:
	 */
	public static void main(String[] args) {
		SubjectSelect();
		MainMenu();
	}
	
	private static void SubjectSelect ()
	{
		System.out.println("Please type which of the following subjects you'd like to use:");
	}
	
	public static void MainMenu()
	{
		int selection1;
		int selection2;
		boolean repeatSelection = true;
		char repeatChoice;
		String objectName;
		
		while(repeatSelection)
		{
		
			selection1 = primaryChoice();
			selection2 = secondaryChoice();
			
			System.out.print("You wish to ");
			
			
			switch(selection1)
			{
				case 1:
					System.out.print("create ");
					break;
				case 2:
					System.out.print("edit ");
					break;
				case 3:
					System.out.print("view ");
					break;
				case 4:
					System.out.print("delete ");
					break;
				default:
					System.out.println();
					System.out.println("I'm sorry, it appears you entered an option that's not available. Please try again.");
					System.out.println();
					continue;
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
				default:
					System.out.println();
					System.out.println("I'm sorry, it appears you entered an option that's not available. Please try again.");
					System.out.println();
					continue;
			}
		
			System.out.println();
			System.out.println("Is this correct? Type 'Y' to move on and 'N' to choose again. Y/N:");
			repeatChoice = reader.next().charAt(0);
			if(repeatChoice == 'N' || repeatChoice == 'n')
			{
				continue;
			}
			objectName = reader.nextLine();
			System.out.println("Please enter the name:");
			objectName = reader.nextLine();
			
			optionSelected(selection1, selection2, objectName);
			
			System.out.println();
			System.out.println("Would you like to perform another action? Y/N:");
			repeatChoice = reader.next().charAt(0);
			if(repeatChoice == 'N' || repeatChoice == 'n')
			{
				repeatSelection = false;
			}
		}
	}
	
	public static int primaryChoice()
	{
		int userSelection;
		System.out.println("Please enter the corresponding number for your selection.");
		System.out.println("1. Create");
		System.out.println("2. Edit");
		System.out.println("3. View");
		System.out.println("4. Delete");
		userSelection = reader.nextInt();
		return userSelection;
	}

	public static int secondaryChoice()
	{
		int userSelection;
		System.out.println("Please enter the corresponding number for your selection.");
		System.out.println("1. Class");
		System.out.println("2. Assignment");
		System.out.println("3. Student");
		userSelection = reader.nextInt();
		
		return userSelection;
	}
	
	private static void optionSelected(int choice1, int choice2, String name)
	{
		switch(choice1)
		{
			case 1:
				switch(choice2)
				{
					case 1:
						newSession.createClass(name);
						break;
					case 2:
						newSession.createAssignment(name);
						break;
					case 3:
						newSession.createStudent(name);
						break;
				}
				break;
			case 2:
				switch(choice2)
				{
					case 1:
						//code for editing a class
						break;
					case 2:
						editAssignmemt(name);
						break;
					case 3:
						//code for editing an student.
						break;
				}
				break;
			case 3:
				switch(choice2)
				{
					case 1:
						System.out.println();
						System.out.println(newSession.viewStudentList());
						System.out.println();
						System.out.println(newSession.viewAssignmentList());
						break;
					case 2:
						System.out.println();
						System.out.println(newSession.viewAssignment(name));
						break;
					case 3:
						System.out.println();
						System.out.println(newSession.viewStudent(name));
						break;
				}
				break;
			case 4:
				switch(choice2)
				{
					case 1:
						newSession.deleteClass(name);
						break;
					case 2:
						newSession.deleteAssignment(name);
						break;
					case 3:
						newSession.deleteStudent(name);
						break;
				}
				break;
		}
		
	}
	
	/*
	 * Prompts the user for the new information for the student specified, and then edits
	 * the information using the editStudent function from the Console class.
	 * 
	 * @param oldName: Specifies which student we want to edit.
	 */
	private static void editStudent(String oldName)
	{
		String newName;
		String notes;
		int absences;
		
		System.out.println("Please enter the new name, your notes, and the number of absences"
				+ "for this student, pressing \"enter\" after each entry");
		
		newName = reader.nextLine();
		notes = reader.nextLine();
		absences = reader.nextInt();
		
		newSession.editStudent(oldName, newName, notes, absences);
	}
	
	/*
	 * Prompts the user for the new information for the assignment specified, and then edits
	 * the information using the editAssignment function from the Console class.
	 * 
	 * @param oldName: Specifies which assignment we want to edit.
	 */
	private static void editAssignmemt(String oldName)
	{
		String newName;
		String description;
		String type;
		int maxPoints;
		String dueDate;
		
		System.out.println("Please enter the new name, the description, the type of assignment,"
				+ "the maximum points possible, and then the due date, pressing \"enter\" after each entry");
		
		newName = reader.nextLine();
		description = reader.nextLine();
		type = reader.nextLine();
		maxPoints = reader.nextInt();
		dueDate = reader.nextLine(); //First nextLine clears the new line character left from the nextInt.
		dueDate = reader.nextLine();
		
		newSession.editAssignment(oldName, newName, description, type, maxPoints, dueDate);
	}
	
	public static void displayLogin() {

	}

	public static void displayOption() {

	}

	public static int selectOption() {
		return 0;
	}

	public static boolean signIn(String username, String password) {
		return false;
	}

}
