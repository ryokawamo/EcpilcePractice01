package Practice04;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int [10];
		
		numbers[0] = 10;
		numbers[1] = 12;
		numbers[2] = 14;
		numbers[3] = 16;
		numbers[4] = 18;
		numbers[5] = 20;
		numbers[6] = 22;
		numbers[7] = 24;
		numbers[8] = 26;
		numbers[9] = 28;

		System.out.println(numbers[2]);
		
		
		int[] numbers2 = {11, 12, 13, 14, 15};
		for (int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		
		int[] numbers3 = {55, 60, 70, 82};
		int sum3 = 0;
		for (int j = 0; j < numbers3.length; j++) {
			sum3 = sum3 + numbers3[j];
		System.out.println(sum3);
		}
		
		int[] numbers4 = {5, 8, -1, 2};
		for (int i = 0; i < numbers4.length; i++) {
			int value = numbers4[i];
			
			if(value % 2 == 0) {
				System.out.println(value + "は偶数");
			} else {
				System.out.println(value + "は奇数");
			}
		}
		
		int[] numbers5 = {30, 20, 25, 35};
		int sum5 = 0;
		for (int i = 0; i < numbers5.length; i++) {
			sum5 += numbers5[i];
		}
		int threshold = 100;
		if (sum5 > threshold) {
			System.out.println("閾値を超えました");
		} else {
			System.out.println("閾値を超えていません");
		}
		
		int[][] kuku = new int[9][9];
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				kuku[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(kuku[i][j] + "\t");
			}
			System.out.println();
		}
	}	
}
