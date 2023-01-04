package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UniqueArray{
public static int removeDuplicateElement(int arr[], int n)
    {
        if (n==0 || n==1)
            return n;
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++)
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         
        temp[j++] = arr[n-1];   
         
        // Changing original array
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
      
        return j;
    }
     
    public static void main (String[] args) 
    {
    	String[][] records4 = {
    		      {"Raj", "enter"},
    		      {"Paul", "enter"},
    		      {"Paul", "exit"},
    		      {"Paul", "exit"},
    		      {"Paul", "enter"},
    		      {"Raj", "enter"},
    		    };
    	getEntryExitList(records4);
        int arr[] = {10,20,20,30,30,40,50,50};
        int length = arr.length;
         
        length = removeDuplicateElement(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
           System.out.print(arr[i]+" ");
    }
    
    private static List<Set<String>> getEntryExitList(String[][] records){
        int lenthOfMainList = records.length;
        List<String> evaluationList =  new ArrayList<>();
        Map<String,String> lastEvent = new HashMap<>();
        Set<String> entrySet = new HashSet<>();
         Set<String> exitSet = new HashSet<>();
         List<Set<String>> finalList = new ArrayList<>();
        for(int i = 0 ; i < lenthOfMainList; i++){
          String[] currentRec = records[i];
          if(!evaluationList.contains(currentRec[0])){
            if(currentRec[1] == "exit"){
              System.out.println(currentRec[0] +" added in exit");
              exitSet.add(currentRec[0]);
              lastEvent.put(currentRec[0],currentRec[1]);
            }else if(currentRec[1] == "enter"){
              lastEvent.put(currentRec[0],currentRec[1]);
            }
            evaluationList.add(currentRec[0]);
          }else{
            String lastVal = lastEvent.get(currentRec[0]);
              String currentVal = currentRec[1];
              System.out.println("last val: "+lastVal+ " "+i);
              System.out.println("current val: "+currentVal);
              if(lastVal.equals(currentVal) && currentVal.equals("enter")){
            	  entrySet.add(currentRec[0]);
                System.out.println(currentRec[0] +" added in entry in else");
              }else if(!lastVal.equals(currentVal)) {
            	  lastEvent.put(currentRec[0],currentRec[1]);
              }else{
                exitSet.add(currentRec[0]);
                System.out.println(currentRec[0] +" added in exit in else");
              }
              lastEvent.put(currentRec[0],currentRec[1]);
            }
          }
        for(Map.Entry<String, String> entry: lastEvent.entrySet()) {
        	if(entry.getValue().equals("enter")) {
        		entrySet.add(entry.getKey());
        	}
        }
        finalList.add(entrySet);
        finalList.add(exitSet);
        return finalList;
      }
}

