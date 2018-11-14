import java.util.Scanner;
import java.util.Random;

public class Pattern {
	public static void main(String[] args) {
		System.out.println("Hello!");
		System.out.println("Welcome to the Number Patterns Game.");
		System.out.println("A pattern of numbers will be shown."
				+ "\nGuess what creates the series of numbers and the operation involved.");

		int num = (int) (Math.random() * 10 + 1);

		int operator = (int) (Math.random() * 4);

		int start = 1;

		for (int i = 0; i < 5; i++) {
			switch (operator)

			{
			case 0:
				start += num;
				break;
			case 1:
				start -= num;
				break;
			case 2:
				start *= num;
				break;
			case 3:
				start /= num;
				break;
			}

			System.out.print(start + ", ");
		}
		System.out.println();
		Scanner scan = new Scanner(System.in);

		System.out.println("Guess: ");
		int input;
		while (true) {
			input = scan.nextInt();
			if (input == num) {
				System.out.println("Correct!");
				break;
			} else {
				System.out.println("Try again");
			}
		}

		Scanner scanboy = new Scanner(System.in);
		System.out.println("Operation: ");
		String input1;

		boolean correctOp = false;
		while (true) {
			input1 = scan.next();
			switch (input1) {
			case "+":
				if (operator == 0) {
					correctOp = true;
				}
				break;
			case "-":
				if (operator == 1) {
					correctOp = true;
				}
				break;
			case "*":
				if (operator == 2) {
					correctOp = true;
				}
				break;
			case "x":
				if (operator == 2) {
					correctOp = true;
				}
				break;
			case "/":
				if (operator == 3) {
					correctOp = true;
				}
				break;
			default:
				System.out.println("Please enter a valid character");
				break;
			}

			if (correctOp == true) {
				System.out.println("That is correct.");
				break;
			} else {
				System.out.println("Try again");
			}
		}
	}
}
