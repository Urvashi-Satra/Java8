package functionalInterfaces;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import data.Student;
import data.StudentDatabase;

public class ConsumerEx {
	static Consumer<Student> c2 = (Student)->System.out.println(Student);
	static Consumer< Student> c3 = (Student)->System.out.print(Student.getName());
	static Consumer<Student> c4 =(Student)->System.out.println(Student.getActivities());
	
	public static void printName() {
		
		List<Student> studentList=StudentDatabase.getAllStudents();
		studentList.forEach(c2);
	}
	
	
	public static void printNameAndActivities() {
		System.out.println("-------------printNameAndActivities----------------");

		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(c3.andThen(c4));
				
 	}
	
	public static void printNameAndActivitiesUsingCondition() {
		
		System.out.println("-------------printNameAndActivitiesUsingCondition----------------");
		List<Student> studentList = StudentDatabase.getAllStudents();
		studentList.forEach(
				(student -> {
					if(student.getGradeLevel()>3 && student.getGpa()>=3.6) {
						c3.andThen(c4).accept(student);
					}
				})
				);
				
 	}
	public static void main(String[] args) {
		Consumer<String> c1 = (s)-> System.out.println(s.toUpperCase());
		c1.accept("urvashi");
		
		printName();
		printNameAndActivities();
		printNameAndActivitiesUsingCondition();
		BiConsumer<Integer, Integer> multiply = (a,b)->{
			
		System.out.println("Result for multiplication : " +(a*b));	
		};
		
		BiConsumer<Integer, Integer> division = (a,b)->{
			
			System.out.println("Result for division : " +(a/b));	
			};
		
		multiply.andThen(division).accept(100, 20);

	}

}
