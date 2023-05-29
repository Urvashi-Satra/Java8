package functionalInterfaces;

import java.util.function.Function;

public class functionEx {

	static Function<String,String> function = (name)->name.toUpperCase();

	static Function<String,String> function1 = (name)->name.toUpperCase().concat("default");
	
	public static void main(String[] args) {
		
		System.out.println("Result : "+function.apply("java8"));
		System.out.println("Result : "+function.andThen(function1).apply("java"));

		System.out.println("Result : "+function.compose(function1).apply("java"));

	}

}
