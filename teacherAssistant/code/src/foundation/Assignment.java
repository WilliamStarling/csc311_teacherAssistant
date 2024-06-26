package foundation;

//Libraries
import java.io.Serializable;

/**
 * Instances of this class will store information pertaining to individual
 * assignments. It stores the name, description, type, possible points, grade,
 * and due date.
 * 
 * @author william
 */
public class Assignment implements Serializable {

	// Assignment attributes
	private String f_name = "new assignment";
	private String f_description = "This is an assignment.";
	private String f_type = "Homework";
	private int f_possiblePoints = 100;
	private float f_grade = 100;
	private String f_dueDate = "01/01/1970";

	/**
	 * This method is the constructor for the assignment class. It only takes
	 * the name of the assignment, as this is the only value initially asked
	 * for, and the others can be updated immediately after creation of the
	 * object.
	 * 
	 * @param newName The name of the assignment
	 */
	public Assignment(String newName) {
		f_name = newName;
		f_description = "This is an assignment.";
		f_type = "Homework";
		f_possiblePoints = 100;
		f_dueDate = "01/01/1970";
		f_grade = 100;
	}

	/**
	 * This is the setter method for the f_name data member in the class.
	 * 
	 * @param newName the new name that you want to update f_name to have.
	 */
	public void setName(String newName) {
		f_name = newName;
	}

	/**
	 * This is the setter method for the f_description data member in the class.
	 * 
	 * @param newDescription the new description that you want to update
	 *                       f_description to have.
	 */
	public void setDescription(String newDescription) {
		f_description = newDescription;
	}

	/**
	 * This is the setter method for the f_type data member in the class. 0 is
	 * homework, 1 is quiz, 2 is test/exam, and 3 is final.
	 * 
	 * @param newType the new type that you want to update f_type to have.
	 */
	public void setType(String newType) {
		f_type = newType;
	}

	/**
	 * This is the setter method for the f_possiblePoints data member in the
	 * class.
	 * 
	 * @param newPossible the new max that you want to update f_possiblePoints
	 *                    to have.
	 */
	public void setPossiblePoints(int newPossible) {
		f_possiblePoints = newPossible;
	}

	/**
	 * This is the setter method for the f_grade data member in the class.
	 * 
	 * @param newGrade the new grade that you want to update f_grade to have. 0
	 *                 is homework, 1 is quiz, 2 is test/exam, and 3 is final.
	 */
	public void setGrade(int newGrade) {
		f_grade = newGrade;
	}

	/**
	 * This is the setter method for the f_dueDate data member in the class.
	 * 
	 * @param newDueDate the new due date that you want to update f_dueDate to
	 *                   have.
	 */
	public void setDueDate(String newDueDate) {
		f_dueDate = newDueDate;
	}

	/**
	 * This is the getter method for the f_name data member in the class.
	 * 
	 * @return returns the name of the assignment.
	 */
	public String getName() {
		return f_name;
	}

	/**
	 * This is the getter method for the f_descrption data member in the class.
	 * 
	 * @return returns the description of the assignment.
	 */
	public String getDescription() {
		return f_description;
	}

	/**
	 * This is the getter method for the f_possiblePoints data member in the
	 * class.
	 * 
	 * @return returns the max points someone can earn on the assignment.
	 */
	public int getPossiblePoints() {
		return f_possiblePoints;
	}

	/**
	 * This is the getter method for the f_type data member in the class.
	 * 
	 * @return returns an integer that corresponds to a specific type. 0 is
	 *         homework, 1 is quiz, 2 is test/exam, and 3 is final.
	 */
	public String getType() {
		return f_type;
	}

	/**
	 * This is the getter method for the f_grade data member in the class.
	 * 
	 * @return returns the grade someone has on the assignment.
	 */
	public float getGrade() {
		return f_grade;
	}

	/**
	 * This is the getter method for the f_dueDate data member in the class.
	 * 
	 * @return returns the due date of the assignment.
	 */
	public String getDueDate() {
		return f_dueDate;
	}

}
