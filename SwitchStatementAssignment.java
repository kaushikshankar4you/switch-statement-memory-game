/*
 * Kaushik Shankar
 * Fun Little Colour assignment quiz
 */
package switchStatementAssignment;

import java.util.Scanner;//importing scanner utility from java library

public class SwitchStatementAssignment {
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);//assigns the variable In as a Scanner and takes inputs
		int numb = 0; // integer variable numb is initialized and assigned the value 0
		String colour = "";//String variable colour is initialized and assigned

		System.out.println("Welcome to the colour assignment quiz");

		while (numb != -1) {//loops until number equal -1
			System.out.println("----------------");
			System.out.println("Choose a number from 1 - 10 and I will assign you a colour! ");//instructions
			System.out.println("To exit, please enter the number: -1");//instructions

			numb = In.nextInt();//numb is assigned the integer value the user inputs

			switch (numb) {//used to satisfy cases of when the integer numb is a specific number
			case -1:
				System.out.println("----------------");
				System.out.println("Thank you for testing out my program! \nGoodBye!");
				break;
			case 1:
				System.out.println("----------------");
				colour = "Turquoise";//assigns colour to the String variable
				break;
			case 2:
				System.out.println("----------------");
				colour = "Sky Blue";//assigns colour to the String variable
				break;
			case 3:
				System.out.println("----------------");
				colour = "Navy Green";//assigns colour to the String variable
				break;
			case 4:
				System.out.println("----------------");
				colour = "Bubblegum Pink";//assigns colour to the String variable
				break;
			case 5:
				System.out.println("----------------");
				colour = "Glittery Gold";//assigns colour to the String variable
				break;
			case 6:
				System.out.println("----------------");
				colour = "Bloody Red";//assigns colour to the String variable
				break;
			case 7:
				System.out.println("----------------");
				colour = "Orange Orange";//assigns colour to the String variable
				break;
			case 8:
				System.out.println("----------------");
				colour = "Matte Black";//assigns colour to the String variable
				break;
			case 9:
				System.out.println("----------------");
				colour = "Marshmallow White";//assigns colour to the String variable
				break;
			case 10:
				System.out.println("----------------");
				colour = "Metallic Maroon";//assigns colour to the String variable
				break;
			default://used if any other cases is not satisfied
				System.out.println("----------------");
				System.out.println("Invalid input: number is not inbetween the range of 1-10");
				System.out.println("----------------");
				break;
			}
			if (numb < 11 && numb > 0) {//if numb is within range, print the following
				System.out.println("Number " + numb + " matches up with the colour " + colour + "!");
			}
		}
	}
}
