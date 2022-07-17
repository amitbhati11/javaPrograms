package javaPrograms;

public class Arrayduplicatefind {
	
	public static void main(String [] xyz) {
		
		int [] a=new int [4];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=2;
		
		
		for(int i=0;i<4;i++) {
			for(int j=i+1;j<4;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]+"---duplicate value are");
				}
			}System.out.println(a[i]);
			
		}
		
		
		int [] num= {1,2,3,5,3,6,2,5,9,7,8,1,4,9,4};
		
		for(int k=0;k<num.length-1;k++) {
			for(int m=k+1;m<num.length;m++) {
				if(num[k]==num[m]) {
					System.out.print(num[k]+" ");
				}
			}
			
			
		}
		System.out.println("========");
		
		int [] temp= {1,3,2,4,5,6,7,2,3,1};
		//advance for loop
		for(int s:temp) {
			System.out.println(s);
		}
	}

}
