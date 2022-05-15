package javaPrograms;


abstract class humain{
	//abstract method are only declaire but not define
	 //or if you want to only declare your method it should be abstract method
	 //if an calss have abstract method then class should be abstract
	public abstract void eat();
	//public void sleep(); 
	
}
//when you extend abstract calss you need to define its declare method
 class man extends humain   //concreate class
 {
	
	public void eat() {
		
	}
}
public class AbstractDemo {

	public static void main(String[] args) {

		humain hm=new humain();//thus you can create object of abstract class
		
		humain obj=new man();
	}

}
//why we use abstract class.
// for example Integer,double,float are extends number class which is an abstract class
//we just use number  