package javaPrograms;


 final class Student{
	
	final int i;//constant if we make a variable final we can't change its value its become constant
	public Student() {
		 i=10;
		 i=15;
	}
	public final void  sleep() {
		System.out.println("ram is everywhere");
	}
}

class child extends Student //if we make a class final class we can't extends that class
{
	
	public final void read() {
		
	}
	
}
class parent extends child{
	public void read() //we can not override final method 
	{
		
	}
}


public class Finaldemo {

	public static void main(String[] args) {

		 Student  obj=new Student();
		 
		 System.out.println(obj.i);
		
	}

}
