package generics;

import java.util.stream.Stream;

public class ArrayGenerics {

	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		String[] strArray = {"one","two","three","four","five"};
		Character[] chrArray = {'O','N','E'};
		Double[] doubleArray = {1.5,2.5,3.5,4.5};
		
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(strArray));
		System.out.println(getFirst(chrArray));
		System.out.println(getFirst(doubleArray));

	}

	private static <T> T getFirst(T[] array) {
		
		return Stream.of(array).findFirst().get();
		
	}

}
