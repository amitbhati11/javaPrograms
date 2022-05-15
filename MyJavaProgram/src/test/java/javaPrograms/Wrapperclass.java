package javaPrograms;

public class Wrapperclass {
	
	//Java is an object oriented programming so everything acceptable as object
	//we have primmitve data type Int,string,char,float,double
	//For this we have wrapper class-Integer,Character,Float,Double
	//intoday's world primitve is more usefull because it muchfaster then wrapper class
	//but reason behind to use wrapper class is some framework support only premitive data type
	
	public static void main(String [] args) {
		int i=5;//primitive 
		Integer refvar=new Integer(5);
		Integer ii=new Integer(i);//when you put primitve data type value inside object is called as Boxing oe wrapping
		int k=ii.intValue();//unboxing
		Integer value=i;//autoboxing
		System.out.println(refvar);
	}

}
