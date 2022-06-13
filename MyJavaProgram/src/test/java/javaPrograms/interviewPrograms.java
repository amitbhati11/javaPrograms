package javaPrograms;

public class interviewPrograms {

	public static void main(String[] args) {

		int num=22322;
		int rev=0;
		int temp;
		temp=num;
		String S=String.valueOf(num);
		System.out.println(S);
		String s1=S.substring(0,1);
		System.out.println(s1+"-s1");
		Integer i1=Integer.valueOf(s1);
		String s2=S.substring(1,2);
		System.out.println(s2+"-s2");
		Integer i2=Integer.valueOf(s2);
		String s3=S.substring(2,3);
		System.out.println(s3+"-s3");
		Integer i3=Integer.valueOf(s3);
		String s4=S.substring(3,4);
		System.out.println(s4+"-s4");
		Integer i4=Integer.valueOf(s4);
		String s5=S.substring(4,5);
		System.out.println(s5+"-s5");
		Integer i5=Integer.valueOf(s5);
		
		int i=i1+i2+i3+i4+i5;
		System.out.println(i);
		
		while(num>0) {
			int reminder=num%10;
			rev=rev*10+reminder;
			num=num/10;
		}System.out.println(rev);
		if(rev==temp) {
			System.out.println("pallendirom");
		}else {
			System.out.println("not a pallendirom");
		}
		
		String name="Bhaskerbhati123";
		String b="";
		
		for(int k=name.length()-1;k>=0;k--) {
			 b=b+name.charAt(k);
			 
		}System.out.println(b);
		
		int abc=11;
		int l=abc/10;
		System.out.println(l);
		
	}

}
