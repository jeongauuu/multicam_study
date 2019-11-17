import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		for (int i = M; i <= N; i++) {
			if (is_prime_num(i)) {
				System.out.println(i);
			}
		}

		sc.close();

	}

	public static boolean is_prime_num(int n) {
		
		if(n == 1) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0){
				return false;
			}
		}

		return true;
	}

}