package calcClass;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		int sumA = 0;
		int sumB = 0;
		boolean status = true;
		while (status) {

			String stringA;
			String stringB;

			System.out.println("Following operations are supported : \n" + "1. Addition (+) \n"
					+ "2. Subtraction (-) \n" + "3. Multiplication (*) \n" + "4. Division (/) \n");
			
			Scanner scanner ;
			if(sumA<=1) {
			scanner = new Scanner(System.in);
			char operation = scanner.next().charAt(0);
			
			System.out.print("Enter the first number: ");
			int num1 = scanner.nextInt();
			
			
			System.out.print("Enter the second number: ");
			int num2 = scanner.nextInt();

			if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
				System.err.println("Invalid Operator. Please use only + or - or * or / or Please choose only A or B");

			}
			

			/*
			 * if(!(operation == '/' && num2 == 0.0)) {
			 * System.err.println("The second number cannot be zero for division operation."
			 * ); }
			 */

			if (operation == '+') {
				sumA = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + (sumA));

			}

			if (operation == '-') {
				sumA = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + (sumA));
			}
			if (operation == '*') {
				sumA = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + (sumA));
			}
			if (operation == '/') {
				sumA = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + (sumA));
			}

			System.out.println("A or B");

			Scanner sca = new Scanner(System.in);
			char op = sca.next().charAt(0);

			if (!(op == 'a' || op == 'b')) {
				System.err.println("Invalid Operator. Please choose only A or B ");
			}
			
		}else
			{
			scanner = new Scanner(System.in);
			char operation = scanner.next().charAt(0);
			
			System.out.println("The first number: "+ sumA);
			
			
			System.out.print("Enter the second number: ");
			int num2 = scanner.nextInt();
			
			if (operation == '+') {
				sumA = sumA + num2;
				System.out.println("The new sum is " + (sumA));
			}

			if (operation == '-') {
				sumA = sumA - num2;
				System.out.println("The new sum is " +(sumA));
			}
			if (operation == '*') {
				sumA = sumA * num2;
				System.out.println("The new sum is " +(sumA));
			}
			if (operation == '/') {
				sumA = sumA / num2;
				System.out.println("The new sum is " +(sumA));
			}
			
			}

//		if(op == 'a') {
//		 for(int i= 0; i<num1; i++) //loops as many times as num1 (if num1 is 3 then it loops 3 times)
//	        {
//	            System.out.println("Please enter a new number: "); //output message
//	            num = scan.nextInt(); //every time the loop body executes it reads in a number and saves it in the variable num
//	            sum += num; //num is then added onto sum (sum starts at 0 but when you add 3 sum is now 3 then next time when you add 1 sum is now 4 and so on)
//	        }
//	        System.out.println("the average is: "+(sum)/num1); //to get the average of a bunch of numbers you must add all of them together (which is what the loop is doing) and then you divide it by the number of items (which is what is being done here)  
//		}

		}
	}
}
