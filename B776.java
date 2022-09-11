import java.util.Arrays;
import java.util.Scanner;

public class B776 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	solve(n + 1);

    }

    private static void solve(int n) {
	if (n == 2 || n == 3) {
	    System.out.println(1);
	    for (int i = 1; i < n; i++) {
		System.out.print(1 + " ");
	    }
	    return;
	}
	int[] prime = new int[n + 1];
	Arrays.fill(prime, 0);
	prime[0] = 1;
	prime[1] = 1;

	for (int i = 2; i <= n; i++) {
	    if (prime[i] > 0)
		continue;
	    int colourNumber = 1;
	    prime[i] = colourNumber;
	    colourNumber++;

	    for (int j = i; (long) ((long) j * (long) i) <= n; j++) {
		prime[i * j] = colourNumber;
	    }
	}
	System.out.println(2);
	for (int i = 2; i <= n; i++) {
	    System.out.print(prime[i] + " ");
	}
    }

}
