package javaPrograms;

class A{
	//bind your data with methods is known as Encapsulation
	//Need for Encapsulation:- to make sure data safe and data privacy,to 
	//maintain log file for those variables if its not binding with method 
	//we can do it on variables, so make our variable to private and we do that.
	 private int rollno;
	private String name;
	//setter and getter method
	
	public void setRollnum(int r) {
		rollno=r;
	}
	public  int getRollnum() {
		
		return rollno;
	}
}

public class Encapsulaton {
	
	public static void main(String [] args) {
		
		A obj=new A();
		//obj.number="amit";
	//	obj.rollno=2;
		
		obj.setRollnum(5);
		System.out.println(obj.getRollnum());
	}

}
