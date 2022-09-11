import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class C_BOXES_PACKING {

    public static void main(String[] args) throws NumberFormatException, IOException {
	// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	int n = Integer.parseInt(br.readLine());
	int[] arr = new int[n];
	String[] temp = br.readLine().split("\\s");
	for (int i = 0; i < n; i++) {
	    arr[i] = Integer.parseInt(temp[i]);
	}

	int ans = helper(arr, n);
	System.out.println(ans);
    }

    private static int helper(int[] arr, int n) {

	Map<Integer, Integer> map = new HashMap<>();

	for (int ele : arr) {
	    map.put(ele, map.getOrDefault(ele, 0) + 1);
	}
	int count = 1;
	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	    count = Math.max(count, entry.getValue());
	}
	return count;
    }

}
