package main_package;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
	
		//ask user for status input
		System.out.println("Enter number of touchdown passes (TD): ");
		double td = in.nextDouble();
		System.out.println("Enter number of passing yards (YDS): ");
		double yds = in.nextDouble();
		System.out.println("Enter number of interceptions (INT): ");
		double intercept = in.nextDouble();
		System.out.println("Enter number of completions (COMP): ");
		double comp = in.nextDouble();
		System.out.println("Enter number of passes attempted (ATT): ");
		double att = in.nextDouble();
		
		in.close();

		//calculate each components
		double a = (((comp / att) -  0.3) * 5);
		double b = (((yds / att) - 3) * 0.25);
		double c = ((td / att) * 20);
		double d = 2.375 - (intercept * 25 / att);
		
		//check if the components exceed max or min value
		final double max_value = 2.375;
		a = (a > max_value) ?2.375 :a;
		b = (b > max_value) ?2.375 :b;
		c = (c > max_value) ?2.375 :c;
		d = (d > max_value) ?2.375 :d;
		a = (a < 0) ?0 :a;
		b = (b < 0) ?0 :b;
		c = (c < 0) ?0 :c;
		d = (d < 0) ?0 :d;
		
		//calculate the final rating
		double rating = (a + b + c + d) * 100 / 6.0 ;
		
		//print out the qb rating
		System.out.println("The QB rating is " + rating);
	}
}
