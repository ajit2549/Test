package programs;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class CompanyNotFoundException extends Exception{
    // write your code here ..
    public CompanyNotFoundException(String str){
        super(str);
    }
}

class NoVacancyFoundException extends Exception{
    // write your code here ..
    public NoVacancyFoundException(String str){
        super(str);
    }
}

 class Company{
    private String name;
    private int requiredCandidates;
    Company(String CompanyName,int numberOfCandidates){
        this.name = CompanyName;
        this.requiredCandidates = numberOfCandidates;
    }

    public String getName(){
        return this.name;
    }

    public int getCandidates(){
        return this.requiredCandidates;
    }
}

class JobPortal{
    public String applyJob(Company jobData,String CompanyName, int numberOfCandidates) throws CompanyNotFoundException, NoVacancyFoundException{
        if(!jobData.getName().equals(CompanyName)){
            throw new CompanyNotFoundException("no such company found");
        }else if(jobData.getCandidates() < numberOfCandidates){
            throw new NoVacancyFoundException("no vacancy available");
        }else{
            return "applied successfully";
        }
    }
}

public class Source {
	public static void main(String args[] ){
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Company data = new Company("Doselect",24);
        JobPortal obj = new JobPortal();
        try {
        	System.out.println(obj.applyJob(data,"Doselect",10));
        }catch(Exception ex){
        	System.out.println(ex.getMessage());
        }
	}
}