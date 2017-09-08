package multiple;

public class Main {

	public static void main(String[] args) {
		System.out.println("Привет мир");
		
		int first = Integer.valueOf(args[0]);
	    int second = Integer.valueOf(args[1]);
	    int sum = first + second;
	    int subtraction = first - second;
	    int multiplication = first * second;
	    int exponentiation = (int) Math.pow(first, 5);
	    
	    System.out.println("Сумма переменных: " + sum);
	    System.out.println("Разница переменных: " + subtraction);
	    System.out.println("Произведение переменных: " + multiplication);
	    System.out.println("Возведение в степень: " + exponentiation);

	}

}
