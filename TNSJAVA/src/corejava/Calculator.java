package corejava;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the opearator");
		String operator=sc.nextLine();
		System.out.println("enter the first number");
		int x1=sc.nextInt();
		System.out.println("enter the second number");
		int x2=sc.nextInt();
		int result;
		
		switch(operator)
		{
		case"+":
		{
			result=x1+x2;
			System.out.println(" addition of the number:"+result);
			break;
		}
		case"-":
		{
			result=x1-x2;
			System.out.println("subtraction of the number:"+result);
			break;
		}
		case"*":
		{
			result=x1*x2;
			System.out.println("multiplication of the number"+result);
			break;
		}
		case"/":
		{
			result=x1/x2;
			System.out.println("division of the number:"+result);
			break;
		}
		default:
			{System.out.println("invalid operator");
			break;
			}
			}
		}
	
		
	}


