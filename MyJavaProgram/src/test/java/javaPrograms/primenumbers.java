package javaPrograms;

import org.testng.annotations.Test;

public class primenumbers {
@Test
	public void Primenum() {
	int n=100;
	
  for(int i=1; i<=n; i++) {
	 
	  if(i%2!=0) {
		  System.out.println(i+"prime number");
	  }else {
		  System.out.println(i+"number is not prime");
	  }
  }
}
@Test
public void fabonaci() {
	
	int a=2,  b=3;
	System.out.println(a+"-->"+b);
	int c;
	for(int i=0;i<10;i++) {
		
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
			}
	
}
}