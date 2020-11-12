package com.Heraizen.cj.day1;
import java.util.*;
public class BillingDiscount {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int net_amount;
	System.out.println("Enter the billing amount: ");
	int billing_amount=sc.nextInt();
	if(billing_amount>6000) {
		net_amount= billing_amount-(billing_amount/10);
	}
	else {
		net_amount=billing_amount;
	}
	System.out.println("your Net billing amount: " +net_amount);
	sc.close();
	}

}
