package functionalInterfaces;

public class functionEx1 {

	public static String performConcat(String str) {
		return functionEx.function1.apply(str);
	}
	public static void main(String[] args) {
		String resultString = performConcat("Hello");
		System.out.println("result : "+resultString);
		

	}

}
