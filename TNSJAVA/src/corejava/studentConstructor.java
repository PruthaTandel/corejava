package corejava;
import java.util.*;

public class studentConstructor {
	String name;
	int roll_no;

	public studentConstructor(String name,int roll_no) {
		this.name=name;
		this.roll_no=roll_no;
		    
	}

	public static void main(String[] args) {
		int i;
		for(i=0;i<2;i++) {
		System.out.println("enter the details:");
		Scanner sc=new Scanner(System.in);
		System.out.println("name:");
		String name=sc.nextLine();
		System.out.println("roll_no:");
		int roll_no=sc.nextInt();
		System.out.println(name);
		System.out.println(roll_no);
		}
		/*System.out.println("enter the student1 name");
		String name=sc.nextLine();
		System.out.println("enter the student1 roll no");
		int roll_no=sc.nextInt();
		
		studentConstructor s1=new studentConstructor(""+name,+roll_no) ;
		studentConstructor s2=new studentConstructor("prutha",56) ;
		System.out.println(s1.name+" " +s1.roll_no);
		System.out.println(s2.name+" " +s2.roll_no);*/
		
	}

}
