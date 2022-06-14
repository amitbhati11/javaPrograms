package javaPrograms;


abstract class humain{
	//abstract method are only declare but not define
	 //or if you want to only declare your method it should be abstract method
	 //if an class have abstract method then class should be abstract
	public abstract void eat();
	//public void sleep(); 
	
}
//when you extend abstract class you need to define its declare method
 class man extends humain   //concreate class
 {
	
	public void eat() {
		
	}
}
public class AbstractDemo {

	public static void main(String[] args) {

		humain hm=new humain();//thus you can't create object of abstract class
		
		humain obj=new man();//you can create the object of subclass
	}

}
//why we use abstract class.
// for example Integer,double,float are extends number class which is an abstract class
//we just use number  