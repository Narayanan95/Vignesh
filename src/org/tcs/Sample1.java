package org.tcs;
//child class

public class Sample1{
	
	public static void main(String[] args) {
		
		int oddsum= 0; 
		for (int i = 0  ; i<=1; i++) { 
			
			if (i%2!=0) {
				System.out.println(i);
				oddsum = oddsum+i; 
			}				
			
		}
	
	System.out.println("the sum of the oddd numbers is " + oddsum);
	}
	
	
	
	}

	


