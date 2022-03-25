package corejava;
import java.util.*;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	    int i,sum=0;
	    for(i=1;i<=num;++i)
	    {
	    	sum=sum+i;
	    }
		System.out.println("sum of natural numbers : "+sum);
		   
		
	}

	

}
