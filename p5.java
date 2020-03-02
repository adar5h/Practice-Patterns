package nestedForLoops;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int rows = 2 * n + 2;
		
		int dec = 0;

		for(int i = 1; i<=rows; i++) {
			if(i>=rows/2 && i<=rows/2 + 1) { 
				System.out.println();
				continue;
			}
			
			if(i<=n) {
			
				for(int j = 1; j<=rows; j++) {
				
				if(j>=rows/2-i+1 && j<=rows/2+i) {
					System.out.print("   ");
					continue;
				}
				System.out.print("*  ");
			}
			System.out.println();
		}
			
			else {
			int j;
				for( j = 1; j<=i-n-2; j++) {
					
					System.out.print("*  ");
					
				}
				dec = dec + 2;
				for(int k = 1; k<=rows-dec; k++) {
					
					System.out.print("   ");
				}
				
				for(int k = 1; k<=j-1; k++) {
					System.out.print("*  ");
				}
			
				System.out.println();

		}
	}
			
}
}

	
	