package calcClass;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		
		boolean status = true;
	    while(status){
		
		System.out.println("A or B");
		
		Scanner sca = new Scanner (System.in);
		char op = sca.next().charAt(0);
		
		if (!(op == 'a' || op == 'b' )) {
			System.err.println("Invalid Operator. Please use only A or B ");	
		}
		
		System.out.println("Following operations are supported : \n" +
				  "1. Addition (+) \n" +
				  "2. Subtraction (-) \n" +
				  "3. Multiplication (*) \n" +
				  "4. Division (/) \n");
		
		Scanner scanner = new Scanner (System.in);
		char operation = scanner.next().charAt(0);
		
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();
		
		if (!(operation == '+' || operation == '-' ||operation == '*' ||operation == '/')) {
			System.err.println("Invalid Operator. Please use only + or - or * or /");
			
		}
		
		/*if(!(operation == '/' && num2 == 0.0)) {
			System.err.println("The second number cannot be zero for division operation.");
		}*/
		
		if (operation == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		if (operation == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}
		if (operation == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		}
		if (operation == '/') {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}

	   }
	}
}
