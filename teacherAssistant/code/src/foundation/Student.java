package foundation;

import java.util.LinkedList;

public class Student {

	private String f_name;

	private float f_overallGrade;

	private int f_absences;

	private String f_notes;

	private LinkedList f_gradeList = new LinkedList();

	public Student(String name, String notes, int absences) {
		f_name = name;
		f_notes = notes;
		f_absences = absences;
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
