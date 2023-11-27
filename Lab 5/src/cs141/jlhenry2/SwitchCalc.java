/**
 * 
 */
package cs141.jlhenry2;
import java.util.Scanner;
/**
 * @author jlhenry2
 *
 */
public class SwitchCalc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		double num1;
		double num2;
		int sign; 
		double answer; 
		// This finds out what operation sign you'll be using! Ex. + * / - 
		System.out.println("1. Add\r\n" + "2. Subtract\r\n" + "3. Multiply\r\n" + "4. Divide ");
		System.out.println("Please choose one of the numbers that corresponding with the menu items: ");
		sign = scnr.nextInt();
		
		
		// Heres the switch statement 
		switch (sign) {
		case 1 : // add
			System.out.println("Please choose a number: ");
			num1 = scnr.nextDouble();
			System.out.println("Please choose another number: ");
			num2 = scnr.nextDouble();
			answer = num1 + num2; 
			System.out.println("The sum of " + num1 + " and " + num2 +" is: " + answer);
			break;
			
		case 2 : // subtract
			System.out.println("Please choose a number: ");
			num1 = scnr.nextDouble();
			System.out.println("Please choose another number: ");
			num2 = scnr.nextDouble();
			answer = num1 - num2; 
			System.out.println("The difference of " + num1 + " and " + num2 +" is: " + answer);
			break;
			
		case 3 : // multiply
			System.out.println("Please choose a number: ");
			num1 = scnr.nextDouble();
			System.out.println("Please choose another number: ");
			num2 = scnr.nextDouble();
			answer = num1 * num2; 
			System.out.println("The product of " + num1 + " and " + num2 +" is: " + answer);
			break;
			
		case 4 : // divide
			System.out.println("Please choose a number: ");
			num1 = scnr.nextDouble();
			System.out.println("Please choose another number: ");
			num2 = scnr.nextDouble();
			answer = num1 / num2; 
			System.out.println("The quotient of " + num1 + " and " + num2 +" is: " + answer);
			break;
			
		default : // if someone chooses something other than1-4 it'll tell them to choose something 1-4
			System.out.println("You must enter a 1,2,3, or 4");
			break;
			//-JH
		}
		

	}

}
