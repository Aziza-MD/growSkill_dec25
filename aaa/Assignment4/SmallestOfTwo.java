package Assignment4;

import java.util.Scanner;

public class SmallestOfTwo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();
	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();
	        if (a < b) {
	            System.out.println("Smallest number is: " + a);
	        } else {
	            System.out.println("Smallest number is: " + b);
	        }
	        sc.close();
	    }
}
