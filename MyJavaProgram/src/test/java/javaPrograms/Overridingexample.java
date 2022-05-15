package javaPrograms;

import javax.swing.plaf.synth.SynthScrollBarUI;



class A{
	public void student() {
		System.out.println("jess");
	}
}
	class B extends A{
		@Override
		public void student() {
			//super.student();
			System.out.println("baby");
		}
	}
	class C extends A{
		public void student() {
			System.out.println("shantuni");
		}
	}


public class Overridingexample   {
	
	public static void main(String [] args) {
		A obj=new B();//runtime polymorphism (beacuse we decide it at run time)
		obj.student();
		obj=new C();
		obj.student();//Dynamic method dispatch
	}
	
	

}
