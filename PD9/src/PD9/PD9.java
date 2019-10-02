package PD9;

import java.util.Random;
import java.util.Scanner;

public class PD9 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// guessNumber();
		//Triangle();
		// checkWhile();
		// checkFor();
		// sumFor();
		// sumWhile();
		// sumDoWhile();
		// printAbc();
		//multifTable();

	}

	private static void multifTable() {
		int a;
		int b;
		for (a = 1; a <= 100; a++) {
			for (b = 1; b <= 100; b++) {
				System.out.print(a * b + "  ");
			}
			System.out.println();
		}

	}

	private static void printAbc() {
		char ch;
		System.out.println("Didziosios raides:");
		for (ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch + " ");

	}

	private static void sumDoWhile() {
		int i = 0;
		int total = 0;
		do {
			total = total + i;
			i++;

		} while (i <= 100);
		System.out.println(total);

	}

	private static void sumWhile() {
		int total = 0;
		int i = 0;

		while (i <= 100) {
			total = total + i;
			i++;

		}
		System.out.println(total);

	}

	private static void sumFor() {
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			total = total + i;
		}
		System.out.println(total);

	}

	private static void checkFor() {
		for (int number = 0; number <= 10; number++) {
			System.out.println("y=" + 3 * number);
		}

	}

	private static void checkWhile() {
		int number = 0;
		while (number <= 10) {
			System.out.println("y=" + 3 * number);
			number++;
		}

	}

	private static void Triangle() {

		int side1;
		int side2;
		int side3;

		String Q1 = "Pirmoji krastine?";
		String Q2 = "Antroji krastine?";
		String Q3 = "Izambine";

		System.out.println(Q1);
		side1 = input.nextInt();

		while (side1 <= 0) {
			System.out.println("Ivedimo klaida-pasitaisykite");
			side1 = input.nextInt();
		}

		Scanner input2 = new Scanner(System.in);
		System.out.println(Q2);
		side2 = input2.nextInt();

		while (side2 <= 0) {
			System.out.println("Ivedimo klaida-pasitaisykite");
			side2 = input.nextInt();
		}

		Scanner input3 = new Scanner(System.in);
		System.out.println(Q3);
		side3 = input3.nextInt();

		while (side3 <= 0) {
			System.out.println("Ivedimo klaida-pasitaisykite");
			side3 = input.nextInt();
		}

		if ((side1 * side1) + (side2 * side2) == (side3 * side3)) {
			System.out.println("Trikampis yra statusis!");
		} else {
			System.out.println("Trikampis nera statusis");

		}

	}

	private static void guessNumber() {

		int random, guess;
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		random = generator.nextInt(100);
		System.out.print("Guess number between 0 and 100:");
		guess = input.nextInt();

		if (guess != random) {

			System.out.print("Neteisingai!");
		} else

			System.out.print("Atspejote");
	}
}
