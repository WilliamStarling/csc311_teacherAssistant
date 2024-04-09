package application;

import ui.Console;
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

	
	public void createAccount() {

	}
	
	public void createClass(String name) {
		f_selectedClass = new ClassRoster(name);
	}

	public void createChart() {

	}
	
	/*
	 * This creates a new student for the current class and adds it to the class's student list,
	 * and then sets the current student to be this newly created student.
	 * 
	 * @param name: the name of the new student being added.
	 */
	public void createStudent(String name) {
		f_selectedStudent = f_selectedClass.addStudent(name);
	}

	/*
	 * This creates a new assignment and adds them the current classes assignment list,
	 * and then sets the current assignment to be this new one so it can be quickly 
	 * updated with info.
	 * 
	 * @param name: the name of the new student being added.
	 */
	public void createAssignment(String name) 
	{
		f_selectedAssignment = f_selectedClass.addAssignment(name);
	}

	public String viewClasses() 
	{
		return "no";
	}

	public String viewStudentList() 
	{
		return "The students for current class: \n" + f_selectedClass.getStudentList().keySet();
	}

	public String viewStudent() 
	{
		String studentInfo;
		studentInfo = f_selectedStudent.getName() + "\n" + f_selectedStudent.getGrade() + "\n" + f_selectedStudent.getAbsenses()
			+ "\n" + f_selectedStudent.getNotes();
		return studentInfo;
	}

	public String viewAssignmentList() 
	{
		return "The assignments for current class: \n" + f_selectedClass.getAssignmentList().keySet();
	}

	public String viewAssignment() 
	{
		String assignmentInfo;
		assignmentInfo = f_selectedAssignment.getName() + "\n" + f_selectedAssignment.getType() + "\n"
				+ f_selectedAssignment.getDueDate() + "\n" + f_selectedAssignment.getPossiblePoints()
				+ f_selectedAssignment.getDescription();
		return assignmentInfo;
	}

}
