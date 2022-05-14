package javaPrograms;

import org.testng.annotations.Test;

public class breakncontinue {
	
	@Test
	
	public void brekstatment() {
		
		
		for(int i=1;i<10;i++)
		{
			if(i==4) {
			System.out.println(i+"");
			continue;
		}
		}
	}
}
