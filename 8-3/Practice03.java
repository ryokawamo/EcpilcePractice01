package Practice03;

public class Main {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			sum += i;
		}
			System.out.println(sum);
			
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
