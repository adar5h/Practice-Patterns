package nestedForLoops;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int k = 1;
		
		if(n<1) {
			System.out.print("Invalid input");
		}
		
		else {
		
		for(int i = 1; i<=2*n-1; i++) {
			System.out.print(" ");
		}
		System.out.println("1 ");
		
		for(int i = 2; i<=2*n; i++) {
			
			int number = 1;
			
			if(i%2==0) continue;
			
			for(int j = 1; j<=2*n-i; j++) {
				
				System.out.print(" ");
			}
			
			System.out.print(i-k++ +" ");
			
			for(int j = 1; j<=i-2; j++) {
				
				System.out.print("0 ");
			}
			
			System.out.print(i-k+1 +" ");
			
			System.out.println();
			
		}
		}
	}
		
	}


