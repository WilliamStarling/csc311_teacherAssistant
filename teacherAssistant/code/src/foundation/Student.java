package foundation;

import java.util.LinkedList;

public class Student {

	private String f_name;

	private float f_overallGrade;

	private int f_absences;

	private String f_notes;

	private LinkedList f_gradeList = new LinkedList();

	/*
	 * The constructor. Only takes the name of the student for simplicities sake.
	 * The other values are set to default values and can be changed after it's creation.
	 */
	public Student(String name) {
		f_name = name;
		f_absences = 0;
		f_notes = "Typical student.";
	}

	public void setName(String newName) {
		f_name = newName;
	}

	public void addGrade(int points) {
		
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
		return f_name;
	}

	public float getGrade() {
		return 0;
	}

	public int getAbsenses() {
		return f_absences;
	}

	public String getNotes() {
		return f_notes;
	}

	public void getGrades() {

	}

}
