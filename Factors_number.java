package number;

public class Factors_number {

	public static void main(String[] args) {
		int n=79;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
//factors are the numbers which duvids the given number completly