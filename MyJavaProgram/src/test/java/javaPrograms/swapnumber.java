package javaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class swapnumber {
	
	@Test
	
	public void swapnumber() {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("the number is of m:"+num);
		
		int m=35, n=46;
		 n=m+n;
		 m=n-m;
		 n=n-m;
		System.out.println("the value of M"+m+"the value of n"+n);
	}

}
