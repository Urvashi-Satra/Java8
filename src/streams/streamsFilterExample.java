package streams;

import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class streamsFilterExample {

	public static List<Student> filterStudents() {
		return StudentDatabase.getAllStudents().stream()
				.filter((Student -> Student.getGender().equals("female")))
				.collect(Collectors.toList());
		
	}
	public static void main(String[] args) {
		
		System.out.println(filterStudents());

	}

}
