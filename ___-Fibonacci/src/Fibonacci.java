import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int numToprint;
		Scanner sc = new Scanner(System.in);
		System.out.print("number of print Fibonacci numbers: ");
		numToprint = sc.nextInt();
		sc.close();
		int current = 1;
		int last = 0;
		System.out.println(last);
		System.out.println(current);
		int lastlast ;
		for(int c = 2; c < numToprint ; c++) {
			lastlast = last;
			last = current;
			current = lastlast+last;
			System.out.println(current);
		}

	}

}
