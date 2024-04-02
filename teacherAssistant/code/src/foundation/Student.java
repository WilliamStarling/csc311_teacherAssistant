package foundation;

import java.util.LinkedList;

public class Student {

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
	}

	public void setName(String newName) {
		f_name = newName;
	}

	public void addGrade(float points, float totalPos) {
		this.f_totalPosPoints += totalPos;
		this.f_totalPoints += points;
		this.f_overallGrade = (f_totalPoints / totalPosPoints) * 100;
	}

	public void setGrade(int whichGrade, int points) {
		
	}

	public void setNotes(String newNote) {
		f_notes = newNote;
	}

	public void setAbsences(int numbAbsences) {
		f_absences = numbAbsences;
	}
	
	public String getName()
	{
		return this.f_name;
	}

	public float getStudentGrade() {
		return this.f_overallGrade; 
	}

	public int getAbsenses() {
		return this.f_absences;
	}

	public String getNotes() {
		return this.f_notes;
	}

	public void getGrades() {
		return this.f_gradeList.getGrade(); //Place-holder
		//plan to loop through all graded assignments
	}

}
