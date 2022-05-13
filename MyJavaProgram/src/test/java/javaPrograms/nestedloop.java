package javaPrograms;

import org.testng.annotations.Test;

public class nestedloop {
	
	@Test
	
	public void printstar() {
		
		for(int i=1;i<6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}System.out.println("");
		}
	}
	
	@Test
	
	public void printnumber() {
		int row=6; 
		for(int l=1;l<row;l++) {
			int num=1;
			for(int k=1;k<=l;k++) {
				System.out.print(num);
				num++;
			}System.out.println();
		}
	}

}
