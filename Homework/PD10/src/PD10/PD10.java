package PD10;

import java.util.Arrays;
import java.util.Random;

public class PD10 {
	private static int[] numbers = new int[100];

	public static void main(String[] args) {

		// printArray(numbers);
		// ascendingArray(numbers);//sukuria random 100 array ir isrusiuoti ascending
		// acsendingNames();
		// longArray();
		arrays2();

	}

	private static void arrays2() {
		int[] myIntArray1 = new int[30];
		int[] myIntArray2 = new int[30];
		Random random = new Random();
		for (int i = 0; i < 20; i++) {
			myIntArray1[i] = random.nextInt(1000);
		}
		for (int i = 0; i < 20; i++) {
			myIntArray2[i] = random.nextInt(1000);
		}

		Arrays.sort(myIntArray1);
		Arrays.sort(myIntArray2);
		int maxValueOne = myIntArray1[myIntArray1.length - 1];
		int maxValueTwo = myIntArray2[myIntArray2.length - 1];
		System.out.println((maxValueOne + maxValueTwo) / 2);

	}

	private static void longArray() {
		long[] longArray = new long[50000];

		for (int i = 0; i < 50000; i++) {
			longArray[i] = random.nextInt(1000);
		}
		Arrays.sort(longArray);
		System.out.println(Arrays.toString(longArray));

	}

	private static void acsendingNames() {
		String[] names = { "Tomas", "Darius", "Lina", "Rytis", "Justina", "Rita", "Sigitas", "Gytis", "Rusne", "Ana" };

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.println("Ascending order:");
		System.out.println(Arrays.toString(names));

	}

	private static void ascendingArray(int[] numbers) {
		randomFillArray(numbers);
		printArray(numbers);
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}

		printArray(numbers);

	}

	private static void printArray(int[] numbers) {
		for (int number : numbers) {
			System.out.print(number + " ");

		}
		System.out.println();
	}

	private static int[] randomFillArray(int[] numbers) {
		Random random = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i * random.nextInt(100);

		}

		return numbers;

	}

}
