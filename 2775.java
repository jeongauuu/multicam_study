package practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			int T = Integer.parseInt(sc.nextLine());

			for(int i =0;i<T;i++) {
				int a = Integer.parseInt(sc.nextLine());
				int b = Integer.parseInt(sc.nextLine());

				System.out.println(resident(a, b));
			}

			sc.close();
		}
	}

	public static int resident(int a, int b) {
		if (a == 0)
			return b;
		else {
			int sum = 0;
			for (int i = 1; i <= b; i++) {
				sum += resident(a - 1, i);
			}

			return sum;
		}
	}
}
