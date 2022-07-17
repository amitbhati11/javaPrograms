package javaPrograms;

import org.testng.annotations.Test;

public class array {
	@Test
	public  void onedarray() {
		
	//1d array-
		
		int n[] =new int[5];
		n[0]=20;
		n[1]=25;
		n[2]=30;
		n[3]=34;
		n[4]=37;
		
		int k[] = {12,13,15,34,45,67,89,90};
		
		for(int b:n) {
			System.out.println("value is b"+b);
		}
	System.out.println(n[4]);	
	System.out.println(k[6]+"-->");
	
	for(int i=0; i<5;i++) {
		System.out.println(n[i]);
	}
	for(int l=0;l<8;l++) {
		System.out.println(k[l]);
	}
	}
	
	@Test
	
	public void twodarray() {
		int d[][]= {{1,2,3,4},{9,8,7,6},{5,1,7,3}};
		
		for(int m=0;m<3;m++) {
			
			for(int s=0;s<4;s++) {
				System.out.print(d[m][s]);
			}System.out.println();
		}
		for(int l[]:d) {
			for(int j:l)
			System.out.println("val of j"+j);
		}
	}
	
	@Test
	
	public void jaggedarray() {
		int o [][]= {{8,9,1,6},{2,5,6},{1,4,6,9}};
		
		for(int t=0;t<o.length;t++) {
			for(int f=0;f<o[t].length;f++) {
				System.out.print(" "+o[t][f]);
				}System.out.println();
		}
	}
	@Test
	
	public void loopEnhance() {
		int h[]= {1,2,3,4,5,6,7};
		for(int p:h) {
			System.out.println(" vlaue of array p--->"+p);
		}
	}
	
	@Test
	
	public void loop1ench() {
		int d[][]= {{1,2,3,4},{9,8,7,6},{5,1,7,3}};
		for(int b[]:d) {
			for(int s:b) {
				System.out.print(" "+s);
			}System.out.println();
		}
	}
	

}
