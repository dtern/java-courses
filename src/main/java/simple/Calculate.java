package simple;

import java.util.Scanner;

public class Calculate {
	
	public static void main(String[] args) {
		
		
		// ���� ������ �� ���������
		String typeOne = "int";
		String typeTwo = "int";
		
		// ������� �������:
		Scanner scan = new Scanner(System.in);
		
		// ����������� ��� ������, � ������� ����� �������� ������������:
		System.out.println("������� ��� ������ ������� ��������� (int, short, long, byte ...): ");
		typeOne = scan.next();
		System.out.println("������� ��� ������ ������� ��������� (int, short, long, byte ...): ");
		typeOne = scan.next();
		
		
		
		if (typeOne.equals("int") && typeOne.equals("int")) {
			
			System.out.println("������� ������ ��������: ");
			int first = scan.nextInt();
			System.out.println("������� ������ ��������: ");
			int second = scan.nextInt();
			
			int sum = first + second;
			System.out.println("����� ����������: " + sum);
		}
		
		
		
		
		// ����������� ������:
		System.out.println("������� ������ ��������: ");
		int first = scan.nextInt();
		System.out.println("������� ������ ��������: ");
		int second = scan.nextInt();

		// ���������� ����������:
	    int sum = first + second;
	    int subtraction = first - second;
	    int multiplication = first * second;
	    int exponentiation = (int) Math.pow(first, 5);
	    
	    // ������� ���������:
	    System.out.println("����� ����������: " + sum);
	    System.out.println("������� ����������: " + subtraction);
	    System.out.println("������������ ����������: " + multiplication);
	    System.out.println("���������� � �������: " + exponentiation);

	}

}
