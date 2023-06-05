package streams;
import java.util.Comparator;
import java.util.List;

import data.Student;
import data.StudentDatabase;

import static java.util.stream.Collectors.toList;
public class streamComparatorExample {

	public static List<Student> sortedStudentsByName(){
		return StudentDatabase.getAllStudents()
									.stream()
									.sorted(Comparator.comparing(Student::getName))
									.collect(toList());
		 
	}
	public static void main(String[] args) {
		System.out.println("Student sorted by name");
		sortedStudentsByName().forEach(System.out::println);
		

	}

}
