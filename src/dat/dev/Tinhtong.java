package dat.dev;

import java.util.Scanner;

public class Tinhtong {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao n so nguyen");
		int n =  scanner.nextInt();
		int i = 0;
		int sum = 0;
		while (i <= n) {
		    sum = sum + i;
			i++;
		}
		System.out.println("Tong cua cac so la: "+sum);
	}

}
