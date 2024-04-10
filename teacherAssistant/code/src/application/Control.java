package application;

import ui.Console;
import domain.ClassRoster;
import domain.SeatingChart;
import domain.Teacher;
import foundation.Assignment;
import foundation.Student;

public class Control {

	private Teacher f_selectedTeacher = new Teacher();

	private ClassRoster f_selectedClass;

	private Student f_selectedStudent;

	private Assignment f_selectedAssignment;

	private SeatingChart f_selectedChart;

	
	public void createAccount() {
		
	}
	
	public void createClass(String name) {
		f_selectedClass = f_selectedTeacher.addClass(name);
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

	public String viewStudent(String name) 
	{
		f_selectedStudent = f_selectedClass.getStudent(name);
		String studentInfo;
		studentInfo = f_selectedStudent.getName() + "\n" + f_selectedStudent.getGrade() + "\n" + f_selectedStudent.getAbsenses()
			+ "\n" + f_selectedStudent.getNotes();
		return studentInfo;
	}

	public String viewAssignmentList() 
	{

		return "The assignments for current class: \n" + f_selectedClass.getAssignmentList().keySet();
	}

	public String viewAssignment(String name) 
	{
		f_selectedAssignment = f_selectedClass.getAssignment(name);
		String assignmentInfo;
		assignmentInfo = f_selectedAssignment.getName() + "\n" + f_selectedAssignment.getType() + "\n"
				+ f_selectedAssignment.getDueDate() + "\n" + f_selectedAssignment.getPossiblePoints()
				+ f_selectedAssignment.getDescription();
		return assignmentInfo;
	}
	
	/*
	 * Edits the information on the current student by deleting the old student object and creating a new
	 * one in the case that the name changes and then sets the information for the new student object.
	 *
	 *@param oldName: The original name of the student whose information your editing.
	 *
	 *@param newName: The new name of the student whose information your editing.
	 *
	 *@param notes: The notes that you wish to be saved for the student.
	 *
	 *@param absenses: the number of absences you wish for this student to have.
	 */
	public void editStudent(String oldName, String newName, String notes, int absenses)
	{
		deleteStudent(oldName);
		f_selectedStudent = f_selectedClass.addStudent(newName);
		f_selectedStudent.setNotes(notes);
		f_selectedStudent.setAbsences(absenses);
	}
	
	/*
	 * Edits the information on the current assignment by deleting the old assignment object
	 * and creating a new one in case the name changes, and then sets the information for
	 * the new assignment object.
	 * 
	 * @param oldName: The old name of the assignment being edited.
	 * 
	 * @param newName: The new name of the assignment.
	 * 
	 * @param description: The new description of the object.
	 * 
	 * @param type: The new type (homework, quiz, test, final) of the assignment.
	 * 
	 * @param maxPoints: The new maximum number of points that can be earned.
	 * 
	 * @param dueDate: The new due date for the assignment.
	 */
	public void editAssignment(String oldName, String newName, String description, String type,
			int maxPoints, String dueDate)
	{
		deleteAssignment(oldName);
		f_selectedAssignment = f_selectedClass.addAssignment(newName);
		f_selectedAssignment.setDescription(description);
		f_selectedAssignment.setType(type);
		f_selectedAssignment.setPossiblePoints(maxPoints);
		f_selectedAssignment.setDueDate(dueDate);
	}

	/*
	 * Uses the deleteStudent function in the ClassRoster class to delete a student with the specified name.
	 * 
	 * @param name: the name of the student that you're deleting.
	 */
	public void deleteStudent(String name)
	{
		f_selectedClass.deleteStudent(name);
	}
	
	/*
	 * Uses the delete assignment function in the ClassRoster class to delete an assignment.
	 * 
	 * @param name: The name of the assignment that you're deleting.
	 */
	public void deleteAssignment(String name)
	{
		f_selectedClass.deleteAssignment(name);
	}
	
	
	/*
	 * Deletes the specified class from the current teacher's class list.
	 * 
	 * @Param name: The name of the class to be deleted.
	 */
	public void deleteClass(String name)
	{
		f_selectedTeacher.deleteClass(name);
	}

}
