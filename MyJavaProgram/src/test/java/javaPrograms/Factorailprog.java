package javaPrograms;

import org.testng.annotations.Test;

public class Factorailprog {
	
	
	@Test//factorailprogram
	public void factorialprogram() {
		
		int num=7;
		int fact=1;
		
		for(int i=1;i<=5;i++) {
			
			fact=fact*i;
		}
		System.out.println("value of fact:"+fact);
		
	}
	
	@Test//reverse number(check whether is pallendirom or not)
	
	public void revrsenum() {
		int num=898;
		int reminder;
		int revrse=0;
		int temp;
		temp=num;
		while(num!=0) {
			reminder=num%10;
			revrse=revrse*10+reminder;
			num=num/10;
		}System.out.println("revrse number"+revrse);
		
	if(temp==revrse) {
			System.out.println("its a pallendirom");
		}else {
			System.out.println("its not pallendirom");
		}
}}


