import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double pi = 3.14159;
		
		double area = pi * raio * raio;
		
		System.out.printf("A area do circulo e de: %.4f%n", area);

	}

}
