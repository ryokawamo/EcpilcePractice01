package Practice05;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		calculationSum(scanner);
		calculationCircleArea(scanner);
		calculationGCD(scanner);
		calculationSquareRoot(scanner);
		diceGame(scanner);
		textReverse();
		
		double avg = average(2, 7, 1);
		System.out.println("平均は:" + avg);
		
		scanner.close();
	}
		
	public static void calculationSum(Scanner scanner) {
		
		System.out.print("１つ目の整数を入力してください:");
		int num1 = scanner.nextInt();
		
		System.out.print("２つ目の整数を入力してください:");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		System.out.println("２つの整数の和は:" + sum);
	}
		
	public static void calculationCircleArea(Scanner scanner) {

		System.out.print("円の半径を入力してください:");
		double radius = scanner.nextDouble();
		
		double area = radius * radius * 3.14;
		System.out.println("円の面積は" + area);
	}
	
	public static void calculationGCD(Scanner scanner) {

		System.out.print("１つ目の整数を入力してください:");
		int num1 = scanner.nextInt();
		
		System.out.print("２つ目の整数を入力してください:");
		int num2 = scanner.nextInt();
		
		num1 = Math.abs(num1);
		num2 = Math.abs(num2);
		
		while (num2 != 0) {
			int temp = num2;
			num2 = num1 % num2;
			num1 = temp;
		}
		System.out.println("最大公約数は:" + num1);
	}
	
	public static void calculationSquareRoot(Scanner scanner) {

		System.out.print("平方根を求めたい数を入力してください:");
		double value = scanner.nextDouble();
		
		if (value < 0) {
			System.out.println("負の数の平方根は求められません");
			return;
		}
		
		double result = Math.sqrt(value);
		
		System.out.println(value + "の平方根は" + result);
	}
	
	public static void diceGame(Scanner scanner) {

		Random random = new Random();
		
		System.out.print("サイコロの目を予想してください:");
		int guess = scanner.nextInt();
		
		int dice = random.nextInt(6) + 1;
		
		System.out.println("サイコロの目は:" + dice);
		
		if (guess == dice) {
			System.out.println("正解!");
		} else {
			System.out.println("残念！正解は" + dice + "でした");
		}
	}
	
	public static void textReverse() {
		String text = "ABCDEFG";
		String reversed = "";
		
		for (int i = text.length() - 1; i >= 0; i--) {
			reversed += text.charAt(i);
		}
		
	System.out.println("逆順は:" + reversed);
	}
	
	public static double average(int a, int b, int c) {
		int sum = a + b + c;
		double avg = sum / 3.0;
		return avg;
	}
	
}
