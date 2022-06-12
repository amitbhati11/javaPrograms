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
		
		
		int [] num= {1,2,3,5,3,6,2,5,9};
		for(int k=0;k<9;k++) {
			for(int m=k+1;m<9;m++) {
				if(num[k]==num[m]) {
					System.out.println(num[k]+"-duplicate value in array");
				}
			}
			
			System.out.println(num[k]+"--value of k");
		}
	}

}
