import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class C_WatchMen {

    public static void main(String[] args) throws NumberFormatException, IOException {
	// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int n = Integer.parseInt(br.readLine());
	int[][] arr = new int[n][2];

	for (int i = 0; i < n; i++) {
	    String[] temp = br.readLine().split("\\s");
	    arr[i][0] = Integer.parseInt(temp[0]);
	    arr[i][1] = Integer.parseInt(temp[1]);
	}

	long ans = helper(arr, n);
	System.out.println(ans);
    }

    private static long helper(int[][] arr, int n) {
	Map<Integer, Integer> xmap = new HashMap<>();
	Map<Integer, Integer> ymap = new HashMap<>();
	Map<String, Integer> xymap = new HashMap<>();
	for (int[] ele : arr) {
	    String key = ele[0] + "::" + ele[1];
	    xymap.put(key, xymap.getOrDefault(key, 0) + 1);
	    xmap.put(ele[0], xmap.getOrDefault(ele[0], 0) + 1);
	    ymap.put(ele[1], ymap.getOrDefault(ele[1], 0) + 1);

	}
	long ans = 0;
	for (Map.Entry<Integer, Integer> entry : xmap.entrySet()) {
	    long val = (long) entry.getValue();
	    ans += val * (val - 1) / 2;
	}
	for (Map.Entry<Integer, Integer> entry : ymap.entrySet()) {
	    long val = (long) entry.getValue();
	    ans += val * (val - 1) / 2;
	}
	for (Map.Entry<String, Integer> entry : xymap.entrySet()) {
	    long val = (long) entry.getValue();
	    ans -= val * (val - 1) / 2;
	}
	return ans;

    }

}
