package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateEx {
	static Predicate<Integer> p1= (i)-> i%2==0;
	static Predicate<Integer> p2= (i)-> i%5==0;
	public static void predicatedAnd() {
		System.out.println("Predicate And -> " + p1.and(p2).test(100));
		System.out.println("Predicate And -> " + p1.and(p2).test(9));
	}
	
	public static void predicatedOr() {
		System.out.println("Predicate OR -> " + p1.or(p2).test(100));
		System.out.println("Predicate OR -> "  +p1.or(p2).test(8));
	}
	public static void predicateNegate() {
		System.out.println("Predicate Negate -> " +p1.or(p2).negate().test(8));
	}
	public static void main(String[] args) {
		
		

		predicatedAnd();
		predicatedOr();
		predicateNegate();
	}

}
