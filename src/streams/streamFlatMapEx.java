package streams;

import java.util.List;

import data.Student;
import data.StudentDatabase;

import static java.util.stream.Collectors.toList;
public class streamFlatMapEx {

	public static List<String> printStudentActivities(){
	List<String> studentActivities =	StudentDatabase.getAllStudents().stream()
										.map(Student::getActivities)
										.flatMap(List::stream)
										.distinct()
										.sorted()
										.collect(toList());
	
	return studentActivities ;
	}
	
	public static long getStudentActivitiesCount(){
		long count =	StudentDatabase.getAllStudents().stream()
											.map(Student::getActivities)
											.flatMap(List::stream)
											.distinct()
											.count();
		
		return count ;
		}
	public static void main(String[] args) {
		
		System.out.println(printStudentActivities());
		
		System.out.println("Count : " +getStudentActivitiesCount());

	}

}
