package javaPrograms;

import java.util.Scanner;

import org.testng.annotations.Test;

public class revrsenumber {
	
	@Test
	public void revrsenumber() {
		
		int num=12356;
		
		int revrse=0;
		
		while(num!=0) {
			int temp=num%10;
			revrse=revrse*10+temp;
			num=num/10;
		}System.out.println("revrseno is:"+revrse);
	}
	@Test
	public void pallendirom() {
		
		int num=4641;
		int reverse=0;
		int temp=0;
		int z=num;
		while(num!=0) {
			temp=num%10;
			reverse=reverse*10+temp;
			num=num/10;
			
		}if(reverse==z) {
			System.out.println("palendirom");
		}else {
			System.out.println("not palendriom");
		}
	}
	
	@Test
	
	public void factoraildata() {
		
		int num=4;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}System.out.println("factorial value:"+fact);
	}
	
	@Test
	
	public void fabbonacinumber() {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int b=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int c=a+b;
			System.out.println("fabonacci sereies"+c);
		
			a=b;
			a=b;
			b=c;
		}
		
	}
	
	@Test
	
	public void odevenumber() {
		int num=100;
		for(int i=1; i<=num;i++) {
			if(i%2==0) {
				System.out.println("its a even number-->"+i);
			}else {
				System.out.println("odd number-->"+i);
			}
		}
	}
}