package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import data.Student;
import data.StudentDatabase;

public class supplierEx {

	public static void main(String[] args) {
		
		Supplier<Student> studentSupplier = ()-> {
			return new Student("Adam", 2, 3.6, "male",Arrays.asList("Swiming","basketball","volleyball"));
		};
		
		Supplier<List<Student>> listSupplier=()->StudentDatabase.getAllStudents();
		System.out.println("Student is : "+studentSupplier.get());
		System.out.println("Student are : "+listSupplier.get());
	}

}
