package corejava;

public class parameterizedConst {

	 parameterizedConst() {
		 System.out.println("Default Constructor");
		
	}
	 
	 parameterizedConst(int a,int b){
		 System.out.println("Constructor have two integer parameter.");
	 }
	 
	 parameterizedConst(int a,String name){
		 System.out.println("Constructor have one integer and one string parameter");
	 }

	public static void main(String[] args) {
		parameterizedConst obj1= new parameterizedConst();
		parameterizedConst obj2= new parameterizedConst(10,30);
		parameterizedConst obj3=new parameterizedConst(20,"prutha");
		
	}

}
