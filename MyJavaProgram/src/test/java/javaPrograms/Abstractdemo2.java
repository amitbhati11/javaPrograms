package javaPrograms;
/*An abstract class is a class that contains at least one abstract method. 
An abstract method is a method that is declared, but not implemented in the code.
An abstract class is a class that contains at least one abstract method.
 An abstract method is a method that is declared, but not implemented in the code.*/
 abstract class Writer {
	public abstract void write();
	public void read() {
		System.out.println("reading books");
	}
}

class Pen extends Writer{
	
	public void write() {
		System.out.println("Pen");
	}
		
	
}
class Pencil extends Writer{
	public void write() {
		System.out.println("Pencil");
	}
}

class kit{
	
	public void doSomehting(Writer w) {
		w.write();
	}
}

public class Abstractdemo2 {

	public static void main(String[] args) {

		kit k=new kit();
		Pen p=new Pen();
		//Writer abs=new Writer();//we can't create the object of abstract class
		Writer pc=new Pencil();
		Writer pp=new  Pen();
		
		k.doSomehting(pp);
		
		pp.read();
	}

}
