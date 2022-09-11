import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_KarenAndCoffe {

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	int m = 200002;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] temp = br.readLine().split(" ");
	int n = Integer.parseInt(temp[0]);
	int k = Integer.parseInt(temp[1]);
	int q = Integer.parseInt(temp[2]);
	int[][] degrees = new int[n][2];
	int[] dp = new int[m];
	for (int i = 0; i < n; i++) {
	    String[] s = br.readLine().split(" ");
	    degrees[i][0] = Integer.parseInt(s[0]);
	    degrees[i][1] = Integer.parseInt(s[1]);

	}

	Arrays.fill(dp, 0);
	for (int i = 0; i < n; i++) {
	    dp[degrees[i][0]] += 1;
	    dp[degrees[i][1] + 1] -= 1;
	}

	for (int i = 1; i < m; i++) {
	    dp[i] += dp[i - 1];
	}
	int[] dp2 = new int[m];
	dp2[0] = dp[0] >= k ? 1 : 0;
	for (int i = 1; i < m; i++) {
	    dp2[i] += dp2[i - 1] + (dp[i] >= k ? 1 : 0);
	}

	for (int i = 0; i < q; i++) {
	    String[] s = br.readLine().split(" ");
	    int a = Integer.parseInt(s[0]);
	    int b = Integer.parseInt(s[1]);

	    System.out.println(dp2[b] - dp2[a - 1]);

	}
    }

}
