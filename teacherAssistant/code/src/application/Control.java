package application;

import domain.ClassRoster;
import domain.SeatingChart;
import domain.Teacher;
import foundation.Assignment;
import foundation.Student;

public class Control {

	private Teacher f_selectedTeacher;

	private ClassRoster f_selectedClass;

	private Student f_selectedStudent;

	private Assignment f_selectedAssignment;

	private SeatingChart f_selectedChart;

	public void runConsole() {

	}

	public void createAccount() {

	}

	public void createClass() {

	}

	public void createChart() {

	}

	public void createStudent() {
		f_selectedClass.addStudent(f_selectedStudent);
	}

	public void createAssignment() {
		

	}

	public void viewClasses() {

	}

	public void viewStudentList() {

	}

	public void viewStudent() {

	}

	public void viewAssignmentList() {

	}

	public void viewAssignment() {

	}

}
