package javaPrograms;

import org.testng.annotations.Test;

public class patternProgram {
	@Test
	
	public void righttringle() {
		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=0;i<=4;i++) {
			for(int j=4; j>i;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	@Test
	
	public void lefttringle() {
		for(int i=0;i<=9;i++) {
			for(int j=9;j>=i;j--) {
				System.out.print(" ");
			}for(int k=0;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=0;i<=10;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=10;j>i;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	@Test
	
	public void alaphanumric() {
		int alpha=65;
		for(int i=0;i<=25;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alpha+j)+" ");
			}System.out.println();
		}
		for(int i=0;i<=25;i++) {
			 alpha=65;
			for(int j=25;j>i;j--) {
				System.out.print((char)(alpha)+" ");
				alpha++;
			}System.out.println();
		}
	}
	@Test
	
	public void num100t() {
		int count=1;
		for(int i=0;i<=99;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count+j+" ");
			}
			;
			System.out.println();
		}
	}
	
	

}
