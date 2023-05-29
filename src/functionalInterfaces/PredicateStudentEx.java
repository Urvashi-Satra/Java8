package functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import data.Student;
import data.StudentDatabase;

public class PredicateStudentEx {

	static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
	static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
	
	public static void filterStudentByGradeLevel() {
		System.out.println("Filtered Student by grade level");
		List<Student> studentList =StudentDatabase.getAllStudents();
		studentList.forEach((student->{
			if(p1.test(student)) {
				System.out.println(student);
			}
		}));
	}
	public static void filterStudentByGpa() {
		System.out.println(" filterStudentByGpa ");
		List<Student> studentList =StudentDatabase.getAllStudents();
		studentList.forEach((student->{
			if(p2.test(student)) {
				
				System.out.println(student);
			}
		}));
		
	}
	
	public static void filterStudent() {
		System.out.println("Filtered Student");
		List<Student> studentList =StudentDatabase.getAllStudents();
		studentList.forEach((student->{
			if(p1.or(p2).negate().test(student)) {
				
				System.out.println(student);
			}
			else {
				System.out.println("Didnt match the condition : "+student);
			}
		}));
	}
	public static void main(String[] args) {
		filterStudent();
		filterStudentByGradeLevel();
		filterStudentByGpa();
		
	}

}
