package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

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
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.print("Customs fee: ");
			
			if(aux.toUpperCase().equals("C")) {
				Product product = new Product(name, price);
			} 
		}
		
		sc.close();
		
	}

}
