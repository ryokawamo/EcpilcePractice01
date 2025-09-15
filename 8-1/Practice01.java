package practice;

public class Main {

	public static void main(String[] args) {
		int num = 2;
		
		String name = "RyoKawamoto";
		
		final double PI = 3.14;
		
		System.out.println(num);
		System.out.println(name);
		System.out.println(PI);
		
		int myInt = 10;
		
		double myDouble = myInt * 2;
		
		char myChar = 'A';
		
		boolean myBoolean = (myInt>1);
		
		String myString = "Ryo";
		
		System.out.println("myInt:" + myInt);
		System.out.println("myDouble:" + myDouble);
		System.out.println("myChar:" + myChar);
		System.out.println("myBoolean:" + myBoolean);
		System.out.println("myString:" + myString);
		
		int a = 12;
		int b = 5;
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		int sumResult = a + b;
		
		System.out.println("sumResult:" + sumResult);
		
		int differenceResult = a - b;
		
		System.out.println("differenceResult:" + differenceResult);
		
		int productResult = a * b;
		
		System.out.println("productResult:" + productResult);
		
		int quotientResult = a / b;
		
		System.out.println("quotientResult:" + quotientResult);
		
		int remainderResult = a % b;
		
		System.out.println("remainderResult:" + remainderResult);
		
		boolean isEqual = (a == b);
		
		System.out.println("isEqual:" + isEqual);
		
		boolean isGreater = (a > b);
		
		System.out.println("isGreater:" + isGreater);
		
		boolean isLess = (a < b);
		
		System.out.println("isLess:" + isLess);
		
		int base = 10;
		int height = 7;
		int triangleArea = (base * height) / 2;
		
		System.out.println("三角形の面積:" + triangleArea);
		
		int radius = 5;
		double circleArea = radius * radius * 3.14;
		
		System.out.println("円の面積:" + (int)circleArea);
	}

}
