import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class A_Sounya_And_Queries {

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int t = Integer.parseInt(br.readLine());
	Map<Long, Integer> map = new HashMap<>();

	while (t-- != 0) {
	    String[] temp = br.readLine().split("\\s");
	    char c = temp[0].charAt(0);
	    String s = temp[1].trim();
	    long hash = hashValue(s);
	    if (c == '+') {
		map.put(hash, map.getOrDefault(hash, 0) + 1);
	    } else if (c == '-') {
		map.put(hash, map.getOrDefault(hash, 0) - 1);
	    } else {

		System.out.println(map.getOrDefault(hash, 0));
	    }
	}
    }

    private static long hashValue(String s) {

	long val = 0;
	long temp = 1;
	for (int i = s.length() - 1; i >= 0; i--) {
	    int parity = (s.charAt(i) - '0') % 2;
	    val += parity * temp;
	    temp *= 2;
	}
	return val;
    }
}
