package programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		String str1 = "Hello how are you";
		reverseString(str1);
		System.out.println("--------------------------------");
		int a = 10;
		int b = 23;
		swapNumbers(a,b);
		System.out.println("--------------------------------");
		String sentence = "what happen when you do what you should not do";
		countWords(sentence);
		System.out.println("--------------------------------");
		List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
		sumUsingParallelStream(ages);
		printStars();
	}
	
	private static void printStars() {
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 5;i++) {
			sb.append("*");
			System.out.println(sb);
			
			
			
		}
	}

	private static void sumUsingParallelStream(List<Integer> ages) {
		int sum = ages.parallelStream().reduce(0,(a,b) -> a+b,Integer::sum);
		System.out.println(sum);
		
	}

	private static void countWords(String sentence) {
		String[] words = sentence.split(" ");
		Map<String, Long> wordMap = Arrays.asList(words).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(wordMap);
		
	}

	private static void swapNumbers(int a, int b) {
		if(b>a) {
			b = b - a;
			a = b + a;
			b = a - b;
		}else {
			a = a - b;
			b = a + b;
			b = b - a;
		}
		
		System.out.println("a values is :"+a+" and b value: "+b);
	}

	private static void reverseString(String str) {
		String[] strArr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String ele : strArr) {
			StringBuilder sb2 = new StringBuilder();
			sb2.append(ele);
			sb.append(sb2.reverse());
			sb.append(" ");
		}
		System.out.println(sb);
		sb = new StringBuilder();
		for(int i = strArr.length-1; i >= 0 ; i--) {
			sb.append(strArr[i]);
			sb.append(" ");
			
		}

		System.out.println(sb);
	}

}
