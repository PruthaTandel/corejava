package corejava;
import java.lang.*;
import java.util.*;
public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the case");
		int x=sc.nextInt();
		switch(x)
		{
		case 0:
			System.out.println(0);
			break;
			
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
		default:
			System.out.println("default");
			
		}
		
			
	}

}
