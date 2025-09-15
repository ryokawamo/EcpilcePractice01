package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String choice;
		
		while (true) {
			System.out.print("1つ目の数字を入力してください:");
			int num1 = scanner.nextInt();
			
			System.out.print("演算子を入力してください（ + - * / ):");
			String operator = scanner.next();
			
			System.out.print("2つ目の数字を入力してください:");
			int num2 = scanner.nextInt();
			
			int result = 0;
			
			if (operator.equals("+")) {
				result = num1 + num2;
			} else if (operator.equals("-")) {
				result = num1 - num2;
			} else if (operator.equals("*")) {
				result = num1 * num2;
			} else if (operator.equals("/")) {
				if (num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("エラー: 0で割ることはできません");
					continue;
				}
			} else {
				System.out.println("+ - * / の正しい演算子を入力してください");
				continue;
			}
			System.out.println("計算結果:" + result);
			
			System.out.print("継続しますか？(yes / no):");
			choice = scanner.next();
			
			if (choice.equalsIgnoreCase("no") || choice.equals("終了")) {
				System.out.println("プログラムを終了します");
				break;
			}
		}
		scanner.close();

	}

}
