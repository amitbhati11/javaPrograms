package javaPrograms;

import org.testng.annotations.Test;

public class Revresestring {
//String is immutable class we can not change the string and we can create the multiple object it
	
	@Test
	public void reverseString() {
		String a="Amit";
		System.out.println(a.length());
		String b="";
		for(int i=a.length()-1; i>=0;i--) {
			b=b+a.charAt(i);
		}
		
		System.out.println(b);
		
	}
	@Test
	
	  public void addstring() {
		String ab="amit";
		String cd="bhati";
		String de=ab+cd;
		System.out.println(de+"-->");
	}
	
	@Test
	
	public void palendiromstring() {
		String a="NiTIn";
		String b="";
		String temp=a;
		
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(temp.equals(b)) {
				System.out.println("its an pallendirom-->"+b);
			}else {
				System.out.println("it is not a pallendirom-->"+b);
			}
		}
	}

