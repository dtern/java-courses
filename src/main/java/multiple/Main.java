package multiple;

public class Main {

	public static void main(String[] args) {
		System.out.println("������ ���");
		
		int first = Integer.valueOf(args[0]);
	    int second = Integer.valueOf(args[1]);
	    int sum = first + second;
	    int subtraction = first - second;
	    int multiplication = first * second;
	    int exponentiation = (int) Math.pow(first, 5);
	    
	    System.out.println("����� ����������: " + sum);
	    System.out.println("������� ����������: " + subtraction);
	    System.out.println("������������ ����������: " + multiplication);
	    System.out.println("���������� � �������: " + exponentiation);

	}

}
