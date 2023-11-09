package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.UsedProduct;

public class Program {
	
	public static void main(String[]args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
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
				list.add(product);
			} else if(aux.toUpperCase().equals("U")) {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				
				Product product = new UsedProduct(name, price, date);
				list.add(product);
			}
		}
		
		sc.close();
		
	}

}
