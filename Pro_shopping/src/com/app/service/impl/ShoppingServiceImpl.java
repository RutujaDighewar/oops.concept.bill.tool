package com.app.service.impl;

import java.util.Scanner;

import com.app.model.Product;
import com.app.service.ShoppingService;

public class ShoppingServiceImpl implements ShoppingService {

	Scanner sc = new Scanner(System.in);

	private Product[] products = null;

	
	Product[] cart = null;
	

	@Override
	public void addProduct() {

		System.out.println("How many products do you want ?");
		int i = sc.nextInt();
		products = new Product[i];

		for (int j = 0; j < i; j++) {
			Product p = new Product();
			System.out.println("Product Name");
			p.setPname(sc.next());
			System.out.println("Id...?");
			p.setId(sc.nextInt());
			System.out.println("price...?");
			p.setPr(sc.nextInt());
			products[j] = p;
			
		}
		

	}

	@Override
	public void addToCart() {
		if (products != null) {
			displayProduct();
			System.out.println("How many products you want to bye ?");
			int num = sc.nextInt();
			cart = new Product[num];

			for (int i = 0; i < num; i++) {
				System.out.println("Enter product id for buy");
				Product p = new Product();
				p.setId(sc.nextInt());

				for (int j = 0; j < products.length; j++) {
					if (p.getId() == products[j].getId()) {
						cart[i] = products[j];
					}
				}

			}
		} else {
			System.out.println("cart is empty");
		}

	}

	@Override
	public void createBill() {
		int finalGrandTotal = 0;

		for (int i = 0; i < cart.length; i++) {
			System.out.println(cart[i].getId() + " " + cart[i].getPname() + " " + cart[i].getPr());
			finalGrandTotal += cart[i].getPr();
		}
		System.out.println("Your Grand Total Price is : " + finalGrandTotal);
	}

	@Override
	public void displayProduct() {
		// TODO Auto-generated method stub
		System.out.println("ID   PRODUCT    PRICE");
		for (int j = 0; j < products.length; j++) {
			Product p = products[j];
			System.out.println(p.getId() + " \t" + p.getPname() + " \t  " + p.getPr());

		}
		System.out.println();
	}

}
