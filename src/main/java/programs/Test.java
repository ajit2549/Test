package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		//reverse string without inbuilt function
		reverseString();
		
		System.out.println("------------------------------------------------------");
		
		//swap two integer values without 3rd variable
		swapNumbers();
		
		System.out.println("------------------------------------------------------");
		//count number of words in a string using hashmap
		countWords();
		
		System.out.println("------------------------------------------------------");
		isPrime();
		
		System.out.println("------------------------------------------------------");
		isPallindrome();
		
		System.out.println("------------------------------------------------------");
		hasVowel();
		
		System.out.println("------------------------------------------------------");
		fibonnaciNoRecursion(10);
		System.out.println(fibonnaci(6,0));

		System.out.println("------------------------------------------------------");
		removeDuplicates();
		
		System.out.println("------------------------------------------------------");
		maxValue();
		
		System.out.println("------------------------------------------------------");
		returnUniqueChars();
		
		System.out.println("------------------------------------------------------");
		reverseLinkedList();
		
	}



	private static void reverseLinkedList() {
		int[] arr = {2,18,24,3 ,5, 7, 9, 6, 12};
		StringBuilder sb = new StringBuilder();
		for(int i:arr) {
			if(i%2==0) {
				sb.append(i);
			}else {
				StringBuilder temp = new StringBuilder();
				temp = sb;
				temp.reverse();
				sb.append(i);
			}
		}
	}



	private static void returnUniqueChars() {
		String str = "javacode"; 
		char[] chrArray = str.toCharArray();
		Set<Character> set = new LinkedHashSet<>();
		Map<Character,Integer> chrMap = new HashMap<>();
		for(Character chr: chrArray) {
			set.add(chr);
//			if(chrMap.getOrDefault(chr, 1) == 1) {
//				chrMap.put(chr, 2);
//				System.out.println(chr);
//			}
		}
//		StringJoiner=set.toString().replaceAll(", ", "")
		System.out.println(set.toString().replaceAll(", ", ""));
//		Map<char[], Long> map = Stream.of(chrArray).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		 
		
	}



	private static void maxValue() {
		List<Integer> lst = Arrays.asList(23,42,1,42,67,9,7,45,67);
		Integer maxNum = lst.stream().reduce((first,second) -> first > second ? first :second).get();
		System.out.println("max number in the list is: "+maxNum);
		 int[] array = { 1, 2, 3, 4, 11, 12, 13, 14, 21,65, 22, 23, 24, 31, 32};
		 int test = Arrays.stream(array).max().getAsInt();
		 System.out.println(test);
		
	}



	private static void removeDuplicates() {
		List<String> lst = Arrays.asList("dog","cat","hen","dog","pig");
		System.out.println("Arraylist: "+lst);
		Set<String> set = new LinkedHashSet<>();
		set.addAll(lst);
		System.out.println("Unique values: "+set);
		System.out.println("stream way: "+lst.stream().distinct().collect(Collectors.toList()));
		
	}



	private static void fibonnaciNoRecursion(int i) {
		int fibonnaciNum = 0;
		List<Integer> fib = new ArrayList<Integer>();
		int firstnum = 0;	
		fib.add(firstnum);
		int secondnum = 1;
		fib.add(secondnum);
		for(int j = 3; j<=i-2; j++) {
			
				fibonnaciNum = firstnum+secondnum;
				firstnum = secondnum;
				secondnum = fibonnaciNum;
				fib.add(fibonnaciNum);
			
			
		}
		System.out.println(i+"th fibonnaci number is: "+fib);
		
	}



	private static int fibonnaci(int n,int counter) {
//		System.out.println("counter is "+counter++ +" and n = "+n);
		if(n<=1) {
			return n;
		}
		
		return fibonnaci(n-1,counter) + fibonnaci(n-2,counter);
		
	}



	private static void hasVowel() {
		String str = "ply";
		boolean test = str.matches(".*[aeiou].*");
		System.out.println( "the word "+str+" contains vowel :"+test);
		
	}


	private static void isPallindrome() {
		String str = "god";
		StringBuilder strBld = new StringBuilder(str);
		String revStr = strBld.reverse().toString();
		if(str.equals(revStr)) {
			System.out.println(str+" is a pallindrome");
		}else {
			System.out.println(str+" is not a pallindrome");
		}
		
	}


	private static void isPrime() {
		int num = 25;
		boolean isPrime = true;
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("number "+num+" is prime");
		}else {
			System.out.println("number "+num+" is not prime");
		}
		
	}


	private static void countWords() {
		String sentence = "what happened to the order given earlier the day";
		String[] words = sentence.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for(String word : words) {
			if(map.containsKey(word)) {
				int currentCount = map.get(word);
				map.put(word, currentCount+1);
			}else {
				map.put(word,1);
			}
			
		}
		System.out.println(map);
		
		//stream way
		Map<String, Long> output = Stream.of(words).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("the map in stream is : "+output);
	}
	

	private static void swapNumbers() {
		int x = 20;
		int y = 11;
		if(x>y) {
			x = x-y;
			y = x+y;
			x = y-x;
		}else {
			y = y-x;
			x = x+y;
			y = x-y;
		}
		System.out.println("value of x is :"+x+"--value of y is:"+y);
	}

	private static void reverseString() {
		String test = "hello how are you";
		String[] testArr = test.split(" ");
		StringBuilder reversedStr = new StringBuilder();
		for(int i = testArr.length-1 ; i >= 0; i--) {
			reversedStr.append(testArr[i]);
			reversedStr.append(" ");
		}
		System.out.println(reversedStr);
	}

}
