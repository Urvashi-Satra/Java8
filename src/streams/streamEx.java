package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDatabase;

public class streamEx {

	public static void main(String[] args) {
		Predicate<Student> studentPredicate=(Student -> Student.getGradeLevel()>=3);
		Predicate<Student> studentGpaPredicate=(Student -> Student.getGpa()>=3.9);
	Map<String, List<String>> studentMap =	StudentDatabase.getAllStudents()
															.stream()
															.filter(studentPredicate)
															.filter(studentGpaPredicate)
															.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
	System.out.println(studentMap);
	
	}

}
