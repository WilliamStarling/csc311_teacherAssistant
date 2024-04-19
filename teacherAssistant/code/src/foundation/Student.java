package foundation;

//Libraries
import java.util.LinkedList;
import java.io.Serializable;

public class Student implements Serializable{

	private String f_name;
	
	private float f_totalPosPoints;
	
	private float f_totalPoints;
	
	private float f_overallGrade;

	private int f_absences;

	private String f_notes;

	//f_gradeList is assignment list
	private LinkedList f_gradeList = new LinkedList();
	

	/*
	 * The constructor. Only takes the name of the student for simplicities sake.
	 * The other values are set to default values and can be changed after it's creation.
	 */
	public Student(String name) {
		f_name = name;
		f_absences = 0;
		f_overallGrade = 0;
		f_totalPoints = 0; 
		f_totalPosPoints = 0;
		f_notes = "Typical student.";
		f_overallGrade = 100;
	}

	/*
	 * This is the setter method for the f_name data member in the class.
	 * 
	 * @param newName: the new name that you want to update f_name to.
	 */
	public void setName(String newName) {
		f_name = newName;
	}

	public void addGrade(float points, float totalPos) {
		this.f_totalPosPoints += totalPos;
		this.f_totalPoints += points;
		this.f_overallGrade = (f_totalPoints / f_totalPosPoints) * 100;
	}

	public void setGrade(int whichGrade, int points) {
		
	}

	/*
	 * This is the setter method for the f_notes data member in the class.
	 * 
	 * @param newNote: the new note that you want the student to have.
	 * have.
	 */
	public void setNotes(String newNote) {
		f_notes = newNote;
	}

	/*
	 * This is the setter method for the f_absences data member in the class.
	 * 
	 * @param newAbsences: the number of absences that you want the student to have.
	 */
	public void setAbsences(int numbAbsences) {
		f_absences = numbAbsences;
	}
	
	/*
	 * This is the getter method for the f_name data member in the class.
	 * 
	 * @return: returns the name of the student.
	 */
	public String getName()
	{
		return this.f_name;
	}

	/*
	 * This is the getter method for the grade data member in the class.
	 * 
	 * @return: returns the grade of the student.
	 */
	public float getGrade() 
  {
		return f_overallGrade;
	}

	/*
	 * This is the getter method for the f_absences data member in the class.
	 * 
	 * @return: returns the number of absences that the student has. 
	 */
	public int getAbsenses() {
		return this.f_absences;
	}

	/*
	 * This is the getter method for the f_notes data member in the class.
	 * 
	 * @return: returns the notes this student has.
	 */
	public String getNotes() {
		return this.f_notes;
	}

	public void getGrades() {
		//return this.f_gradeList.getGrade(); //Place-holder
		//plan to loop through all graded assignments
	}

}
