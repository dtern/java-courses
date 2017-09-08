package simple;

import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] args) {
		
		
		// Типы данных по умолчанию
		String typeOne = "int";
		String typeTwo = "int";
		
		// Создаем сканнер:
		Scanner scan = new Scanner(System.in);
		
		// Запрашиваем тип данных, с которым хочет работать пользователь:
		System.out.println("Введите тип данных первого аргумента (int, short, long, byte ...): ");
		typeOne = scan.next();
		System.out.println("Введите тип данных второго аргумента (int, short, long, byte ...): ");
		typeOne = scan.next();
		
		
		
		if (typeOne.equals("int") && typeOne.equals("int")) {
			
			System.out.println("Введите первый аргумент: ");
			int first = scan.nextInt();
			System.out.println("Введите второй аргумент: ");
			int second = scan.nextInt();
			
			int sum = first + second;
			System.out.println("Сумма переменных: " + sum);
		}
		
		
		
		
		// Запрашиваем данные:
		System.out.println("Введите первый аргумент: ");
		int first = scan.nextInt();
		System.out.println("Введите второй аргумент: ");
		int second = scan.nextInt();

		// Производим вычисления:
	    int sum = first + second;
	    int subtraction = first - second;
	    int multiplication = first * second;
	    int exponentiation = (int) Math.pow(first, 5);
	    
	    // Выводим результат:
	    System.out.println("Сумма переменных: " + sum);
	    System.out.println("Разница переменных: " + subtraction);
	    System.out.println("Произведение переменных: " + multiplication);
	    System.out.println("Возведение в степень: " + exponentiation);

	}

}
