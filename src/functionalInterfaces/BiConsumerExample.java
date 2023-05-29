package functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import data.Student;
import data.StudentDatabase;

public class BiConsumerExample {
	
	public static void nameAndActivities() {
		
		BiConsumer<String, List<String>> biConsumer=(name,activities)->System.out.println(name+": "+activities);
		List<Student> studentList = 
				StudentDatabase.getAllStudents();
		studentList.forEach(student->biConsumer.accept(student.getName(), student.getActivities()));
		
	}

	public static void main(String[] args) {
		
	BiConsumer<String, String> biConsumer=(a,b)->{
		System.out.println("a : "+a+",b :"+b);
	};
	
	biConsumer.accept("java7", "java8");
	BiConsumer<Integer,Integer> multiply = (a,b)->{
		System.out.println("Multiplication " +(a*b));
	};
	
	BiConsumer<Integer,Integer> division = (a,b)->{
		System.out.println("Division " +(a/b));
	};
	
	multiply.andThen(division).accept(100, 5);
	
	
	nameAndActivities();
	}

}
