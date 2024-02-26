package com.level2Program;

import java.util.Scanner;

public class PetrolRemainingInTheCar {

	public static String remainingPetrol(int petrol, int[] bunksArray, int[] capacity) {
		for (int i = 0; i < bunksArray.length; i++) {
			int distance = bunksArray[i];
			if (petrol >= distance) {

				while (distance > 0) {
					petrol--;
					distance--;

				}
				petrol += capacity[i];
			} else {
				return "Cannot Travel Out Of Petrol..";

			}

		}

		return "Remaining Petrol in the Car is " + petrol + " litre..";

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Your Name : ");
		String name = scanner.nextLine();
		System.out.print("Enter the Initial Petrol Quantity in the Car : ");
		int petrol = scanner.nextInt();
		System.out.print("Enter the Petrol Bunk Count Present Inbetween Journey : ");
		int bunks = scanner.nextInt();

		System.out.println("Enter the Petrol Bunk Distances : ");
		int[] bunksArray = new int[bunks];
		for (int i = 0; i < bunks; i++) {
			bunksArray[i] = scanner.nextInt();
		}

		System.out.println("Enter the Petrol Bunk Capacites : ");
		int[] capacity = new int[bunks];
		for (int i = 0; i < bunks; i++) {
			capacity[i] = scanner.nextInt();
		}

		System.out.println("Hi " + name + " , " + remainingPetrol(petrol, bunksArray, capacity));
		scanner.close();
	}

}
