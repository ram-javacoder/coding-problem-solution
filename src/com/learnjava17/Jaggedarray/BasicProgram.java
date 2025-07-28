package com.learnjava17.Jaggedarray;

public class BasicProgram {

	public static void main(String[] args) {

		int arr[][] = new int[5][];

		arr[0] = new int[5];
		arr[1] = new int[4];
		arr[2] = new int[3];
		arr[3] = new int[2];
		arr[4] = new int[1];
		int count = 1;
		int rev = 6;
		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				arr[row][col] = count++;
			}
			count = 1;

		}

		for (int row = 0; row < arr.length; row++) {

			for (int col = 0; col < arr[row].length; col++) {

				System.out.print(arr[row][col] + "  ");

			}
			System.out.println(" ");

		}
		System.out.println("------------------");

		int arr2[][] = new int[6][];

		arr2[0] = new int[6];
		arr2[1] = new int[6];
		arr2[2] = new int[6];
		arr2[3] = new int[6];
		arr2[4] = new int[6];
		arr2[5] = new int[6];

		for (int i = 0; i < arr2.length; i++) {

			for (int j = i; j < arr2[i].length; j++) {
				arr2[i][j] = rev--;

			}
			rev = 6;
			rev = rev - (i + 1);
		}

		for (int i = 0; i < arr2.length; i++) {

			for (int j = 0; j < arr2[i].length; j++) {

				System.out.print("");
				if (arr2[i][j] == 0) {

					System.out.print("  ");
				} else {

					System.out.print(arr2[i][j] + " ");
				}

			}
			System.out.println();
		}
		System.out.println("__________________");
		int arr3Count = 1;
		int arr3[][] = new int[5][];

		arr3[0] = new int[5];
		arr3[1] = new int[5];
		arr3[2] = new int[5];
		arr3[3] = new int[5];
		arr3[4] = new int[5];
		for (int i = 0; i < arr3.length; i++) {

			for (int j = 0; j <= i; j++) {

				arr3[i][j] = arr3Count++;
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {

				if (arr3[i][j] > 0) {
					System.out.print(arr3[i][j] + " ");
				} else {

					System.out.print(" ");

				}

			}
			System.out.println();
		}

	}

}
