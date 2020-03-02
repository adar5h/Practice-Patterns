package nestedForLoops;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int res = 2*n;
		for(int i = 1; i<=res; i++) {
		
			if(i%2==0) {
				continue;
			}
			
			for(int j = 1; j<=res-i; j++) {
				System.out.print("  ");
			}
			
			for(int j = 1; j<=i; j++) {
				System.out.print(j+"   ");
			}
			
			System.out.println();
		}
		
	}

	
}

