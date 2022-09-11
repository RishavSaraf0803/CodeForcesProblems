import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_KepaAndCompany {

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] temp = br.readLine().split(" ");
	int n = Integer.parseInt(temp[0]);
	int d = Integer.parseInt(temp[1]);
	long[][] arr = new long[n][2];

	for (int i = 0; i < n; i++) {
	    String[] t = br.readLine().split(" ");
	    arr[i][0] = Long.parseLong(t[0]);
	    arr[i][1] = Long.parseLong(t[1]);
	}

	long ans = helper(arr, n, d);
	System.out.println(ans);
    }

    private static long helper(long[][] arr, int n, int d) {
	Arrays.sort(arr, (a, b) -> (int) a[0] - (int) b[0]);
	int i = 0, j = 1;
	long ans = arr[0][1], sum = arr[0][1];
	while (j < n) {
	    if (arr[j][0] - arr[i][0] < d) {
		sum += arr[j][1];
		j++;
	    } else {
		sum -= arr[i][1];
		i++;
	    }
	    ans = Math.max(ans, sum);
	}
	return ans;

    }

}
