package data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabase {
	  public static Supplier<Student> studentSupplier = () -> {
	        return  new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
	    };

	    public static Optional<Student> getOptionalStudent(){

	        Student student = new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));

	        Bike bike = new Bike("Client123", "Client123");
	        student.setBike(Optional.of(bike));
	        return Optional.of(student);
	    }

	public static List<Student> getAllStudents(){
		
		Student student1=new Student("Adam", 2, 3.6, "male",Arrays.asList("Swiming","basketball","volleyball"));
		Student student2=new Student("Jenny", 3, 3.9, "female",Arrays.asList("Swiming","basketball","volleyball"));
		Student student3=new Student("Emily", 3, 3.9, "female",Arrays.asList("Swiming","basketball","volleyball"));
		Student student4=new Student("Dave", 4, 3.6, "male",Arrays.asList("Swiming","basketball","volleyball"));
		
		List<Student> students = Arrays.asList(student1,student2,student3,student4);
		return students;
	}
}
