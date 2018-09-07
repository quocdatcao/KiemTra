package dat.dev;

import java.util.Scanner;

public class Songuyento {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap n: ");
		int n =  scanner.nextInt();
		if (n > 0) {
			if( ktsnt(n) ==1 )
				System.out.println(n+" La so nguyen to ");
			else 
				System.out.println(n+" Khong phai la so nguyen to");
			
		}
	}
    public static int ktsnt(int n) {
		int dem = 0;
		for (int i = 1; i < n; i++) {
			if (n%i==0)
				dem++;
		}
    	    if(dem ==2)
    	    	return 1;
    	    else return 0;
    }
}
