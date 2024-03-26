package domain;
import java.util.*;

import foundation.Assignment;
import foundation.Student;

public class ClassRoster {

	private String f_subjectName;
	private LinkedList f_chartList;
	private Set<Student> f_studentList;
	private Set<Assignment> f_assignmentList;
	private Student student;
	private SeatingChart seatingChart;

	public ClassRoster(String courseName) {
		f_subjectName = courseName;
		f_assignmentList = new TreeSet(Comparator.comparing(Assignment::getName));
		f_studentList = new TreeSet(Comparator.comparing(Assignment::getName));
	}

	public void addAssignment(Assignment newAssignment) {
		f_assignmentList.add(newAssignment);
	}

	public void addStudent(Student newStudent) {
		f_studentList.add(newStudent);
	}
	
	public Assignment getAssignment (String assignmentName)
	{
	}

}
