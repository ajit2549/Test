package programs;

import java.util.*;
import java.util.stream.Collectors;


class TestClass {
	private static void reduce(Integer num){
		if(num < 10){
			System.out.println(num);;
		}
		String[] strArr = String.valueOf(num).split("");
		while(num > 10){
			int initialize = 1;
			int currentDigit = 1;
			for(int i = 0; i < strArr.length; i++){
				currentDigit = Integer.valueOf(strArr[i]);
				currentDigit = currentDigit * initialize;
				initialize = currentDigit;
			}
			reduce(currentDigit);
		}
		
		System.out.println(num);
	}
    public static void main(String args[] ) throws Exception {
    	reduce(98);
		/*
		 * Scanner s = new Scanner(System.in); int testCases = s.nextInt(); String sb =
		 * new String(); int tempAns = 0; int maxAns = 0; for(int i = 1; i <= testCases
		 * ; i++){ int row = s.nextInt(); int col = s.nextInt();
		 * 
		 * for(int j = 0; j <= row; j++){ String rowData = s.next(); sb =
		 * sb.concat(rowData); sb = sb.concat(","); tempAns = 0; for(int k = 0; k<=
		 * rowData.length()-1; k++){ if(rowData.charAt(k) == '#') { tempAns++; }else {
		 * break; } if(maxAns < tempAns) { maxAns = tempAns; } } }
		 * 
		 * String[] dataArr = sb.substring(0, sb.length()-1).split(","); for(int j = 0;
		 * j <= col -1; j++){
		 * 
		 * tempAns = 0; for(int k = 0; k<= sb.length()-1; k++){ if(dataArr[k].charAt(j)
		 * == '#') { tempAns++; }else { break; } if(maxAns < tempAns) { maxAns =
		 * tempAns; } } }
		 * 
		 * 
		 * System.out.println(maxAns); }
		 */
    	int[] a = {3,5,10,6,9};
    	int n = 5;
    	int maxNum = 0;
    	int specilaNum =0;
    	int counter =0; 
    	int newNum = 0;
    	Arrays.sort(a);
    	for(int i =0;i<=n-1;i++) {
//    		specilaNum =0;
        	counter =0;  
    		for(int j =0;j<= a.length-1;j++) {
    			maxNum=a[j];
    			if(maxNum % a[i] == 0) {
    				counter++;  
    				newNum++;
    			}
    		}
    		
    		if(counter == a[i] && a[i] >= specilaNum) {
    			newNum = counter;
    			specilaNum = newNum;
    		}    		
    	}
    	if(specilaNum == 0) {
    		System.out.println(-1);
    	}else {
    		System.out.println(specilaNum);
    	}
    }
}
