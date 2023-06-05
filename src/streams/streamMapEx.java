package streams;

import java.util.List;

import data.Student;
import data.StudentDatabase;
import static java.util.stream.Collectors.toList;
public class streamMapEx {

	public static List<String> nameList(){
		List<String> studentList= StudentDatabase.getAllStudents().stream() //stream<Student>
										//student as an input ->Student Name
										.map(Student::getName) //Stream<String> //methodreference
										.map(String::toUpperCase)
										.collect(toList());
		return studentList;
	}
	public static void main(String[] args) {
		System.out.println(nameList());
	}

}
