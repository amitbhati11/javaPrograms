package javaPrograms;

import org.testng.annotations.Test;

public class pattern {

	@Test
	
	public void pattrenmethod() {
		
		//increasing pattern
		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<=4;i++) {
			for(int j=4;j>i;j--) {
				System.out.print("*");
			}	System.out.println();	
		}
		
	}
	
	@Test
	public void leftpattern() {
		
		for(int i=0;i<=4; i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}for(int k=0;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	@Test
	
	public void leftbotmpatrn() {
		
		for(int i=0;i<=4;i++) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	@Test
	
	public void daimondprint() {
		for(int i=0;i<=4; i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}for(int k=0;k<=i;k++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for(int i=0;i<=4;i++) {
			for(int k=1;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}System.out.println();
		}
		
		}
	@Test
	
	public void alphabaticpattern() {
		
		int alpha=65;
		
		for(int i=0;i<=25;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print( (char)(alpha+j)+" ");
			}System.out.println();
		}
				
	}
	
	@Test
	
	public void numberpattern() {
		int count=1;
		int counts=10;
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count+j+" ");
			}System.out.println();
		}
		for(int i=0;i<=9;i++) {
			for(int j=9;j>i;j--) {
				System.out.print(counts-j+" ");
			}System.out.println();
		}
	}
	
	@Test //count+
		public void numberincreasing() {
		int count=0;
		for(int i=0;i<=9;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count+" ");
				
			}count++;
			
			System.out.println(); 
		}
	}
	
	@Test//alpha
	public void alhpapatrn() {
		int alpha=65;
		for(int i=0;i<=25;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)alpha+" ");
			} alpha++;
			System.out.println();
		}
	}
	
	@Test
	
	public void print100number() {
		int count=1;
		for(int i=0;i<=99; i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count+j+ " ");
			}System.out.println();
		}
	}
	
	@Test //upertringle
	
	public void uppertrigle() {
		
		for(int i=0;i<=10;i++) {
			for(int j=10;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(" *");
			}System.out.println();
		}
	}
	}

