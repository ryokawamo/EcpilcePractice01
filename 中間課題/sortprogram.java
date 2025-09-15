package sortprogram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("配列のサイズを入力してください:");
		int size = scanner.nextInt();
		
		int[] numbers = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.print((i + 1) + "番目の数字を入力してください:");
			numbers[i] = scanner.nextInt();
		}
		
		System.out.print("昇順なら　1、降順なら　2　を入力してください:");
		int choice = scanner.nextInt();
		
		int[] sorted;
		
		if (choice == 1) {
			sorted = sortAscending(numbers);
			System.out.println("昇順にソートしました:");
		} else if (choice == 2) {
			sorted = sortDescending(numbers);
			System.out.println("降順にソートしました:");
		} else {
			System.out.println("無効な選択です");
			return;
		}
		
		for (int num : sorted) {
			System.out.print(num + " ");
		}
		scanner.close();
	}
	
	public static int[] sortAscending(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
	
	public static int[] sortDescending(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

}
