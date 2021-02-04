package com.app.client;

import java.util.Scanner;

import com.app.service.impl.ShoppingServiceImpl;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShoppingServiceImpl s=new ShoppingServiceImpl();
		Scanner sc=new Scanner(System.in);
		String a=" ";
		
	do {
		System.out.println("1] Product");
		System.out.println("2] view product");
		System.out.println("3] add to cart");
		System.out.println("4] view bill");
		System.out.println("5] exit");
		System.out.println();
		
		
		System.out.println("What are you looking for ?");
		int option=sc.nextInt();
		
		
		
		switch (option) {
		case 1:
               s.addProduct();
              

			break;
		case 2:
			s.displayProduct();
			break;
		case 3:
			 s.addToCart();
			break;
		case 4:
             s.createBill();
			break;
		
		case 5:
                System.exit(0);
			break;
		default:
			System.out.println("Invalid selection...!");
			break;
		}
		System.out.println("Do you want to continue ?  y/n");
		a=sc.next();

	}
	while(a.equals("y"));

}
}