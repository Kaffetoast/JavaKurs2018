import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		char operat;

		double result = 0;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("Which operator do you want to use? Operators are chosen by typing +,-,*,or /");

			try {
				operat = scan.nextLine().trim().charAt(0);

				while (operat != '+' && operat != '-' && operat != '*' && operat != '/') {
					System.out.println("Needs a valid operator: + , - , * or /");
					operat = scan.nextLine().trim().charAt(0);
				};

				if (operat == '/' || operat == '*') {
					double[] numbers = getNumbers(2);

					switch (operat) {
					case '*':
						result = numbers[0] * numbers[1];
						break;
					case '/':
						result = numbers[0] / numbers[1];
						break;
					}
					printResult(numbers, result, operat);

				} else {

					int choice;

					System.out.println("How many numbers are in your sum?");
					System.out.println("*INPUT HIGH NUMBERS AT OWN RISK*");

					choice = getInteger();
					while (choice < 2 || choice > 10) {
						System.out.println("There need to be more than 1 and less than 10 numbers in your sum!");
						choice = getInteger();
					}

					double[] numbers = getNumbers(choice);

					result = doCalc(numbers, operat);
					printResult(numbers, result, operat);
				}
			} catch (Exception e) {
				System.out.println("Needs a valid operator: + , - , * or /");
			}

		}
	}

	private static void printResult(double[] numberList, double result, char operator) {
		String printResult = "The result of ";

		for (int i = 0; i < numberList.length; i++) {
			printResult += formatTheD(numberList[i]);

			if ((i + 1) < numberList.length)
				printResult += " " + operator + " ";
		}

		System.out.println(printResult += " = " + formatTheD(result));
	}

	private static double doCalc(double[] numberList, char operator) {
		double result = 0;

		for (int i = 0; i < numberList.length; i++) {

			if (i == 0) {
				result = numberList[i];
			} else {
				switch (operator) {
				case '+':
					result += numberList[i];
					break;
				case '-':
					result -= numberList[i];
					break;
				}
			}
		}

		return result;
	}

	private static String formatTheD(double d) {
		if (d == (long) d)
			return String.format("%d", (long) d);
		else
			return String.format("%s", d);
	}

	private static double[] getNumbers(int amountOfNumbersWanted) {

		double[] inputList = new double[amountOfNumbersWanted]; // Fucked over by Operator Kabowski

		for (int i = 0; i < amountOfNumbersWanted; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			inputList[i] = getDouble();
		}

		return inputList;
	}

	private static int getInteger() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		try {

			return scan.nextInt();

		} catch (InputMismatchException e) {
			System.out.println("Invalid input, must enter a valid number:");
		}

		return getInteger();

	}

	private static double getDouble() {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		try {

			return scan.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Invalid input, must enter a valid number:");
		}

		return getDouble();

	}

}
