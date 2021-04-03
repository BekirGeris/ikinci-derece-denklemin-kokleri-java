package JavaOdevler2;

import java.util.Scanner;

public class IkinciDerecedenDenklemCözümü {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("ax^2 + bx + c ikinci derece "
				+ "denklem için a, b, c değerlerini giriniz.");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();
		
		double diskriminat = b * b - 4 * a * c;
		if (diskriminat > 0) {
			double x1 = (-b + Math.pow(diskriminat, 0.5)) / (2 * a);
			double x2 = (-b - Math.pow(diskriminat, 0.5)) / (2 * a);
			System.out.printf("Deklemin farklı iki kökü vardır."
					+ "x1 = %.3f x2 = %.3f", x1, x2);
		}else {
			if (diskriminat == 0) {
				double x1x2 = (-b) / (2 * a);
				System.out.printf("Denklemin bir kökü vardır."
						+ "x1 = x2 = %.3f",x1x2);
			}else {
				System.out.printf("Denklemin hiç bir gerçek kökü yoktur.");
			}
		}
			
	}
}
