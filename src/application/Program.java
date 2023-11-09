package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= n; i++) {
			System.out.printf("\nProduct #%d data\n", i);
			System.out.print("Common, used or imported? (c/u/i): ");
			String aux = sc.nextLine();
			
			
			
		}
		
		sc.close();
		
	}

}
