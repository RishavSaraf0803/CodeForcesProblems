import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C_MAGIC_FORMULAS {

    public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int n = Integer.parseInt(br.readLine());
	long[] arr = new long[n];
	String[] temp = br.readLine().split("\\s");
	for (int i = 0; i < n; i++) {
	    arr[i] = Long.parseLong(temp[i]);
	}

	long ans = helper(arr, n);
	System.out.println(ans);
    }

    private static long helper(long[] arr, int n) {
	long[] f = new long[n + 1];
	f[0] = 0;
	for (int i = 0; i < n; i++) {
	    f[i + 1] = f[i] ^ (i + 1);
	}
	long xor = 0;
	for (int i = 1; i <= n; i++) {
	    int temp = n / i;
	    if (temp % 2 == 1) {
		xor ^= (arr[i - 1] ^ f[i - 1]) ^ (f[n % i]);
	    } else {
		xor ^= arr[i - 1] ^ f[n % i];
	    }
	}
	return xor;
    }
}
