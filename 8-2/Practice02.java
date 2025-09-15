package practice02;

public class Main {

	public static void main(String[] args) {
		int score = 79;
		
		if (score >= 80) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
		
		int dayOfWeek = 3;
			
		switch (dayOfWeek) {
			case 1:
				System.out.println("月曜日");
				break;
			case 2:
				System.out.println("火曜日");
				break;
			case 3:
				System.out.println("水曜日");
				break;
			case 4:
				System.out.println("木曜日");
				break;
			case 5:
				System.out.println("金曜日");
				break;
			case 6:
				System.out.println("土曜日");
				break;
			case 7:
				System.out.println("日曜日");
				break;
			default:
				System.out.println("不明");
				break;
		}
		
			int num1 = 10;
			int num2 = 20;
			
			String result = (num1 > num2) ? "num1が大きい" : "num2が大きい";
			System.out.println(result);

	}

}
