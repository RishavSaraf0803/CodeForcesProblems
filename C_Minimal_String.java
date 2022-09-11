import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class C_Minimal_String {

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s = br.readLine();
	String ans = "";
	Stack<Character> st = new Stack<>();
	int n = s.length();
	char[] arr = s.toCharArray();
	char[] min = new char[arr.length];
	min[n - 1] = arr[n - 1];
	for (int i = n - 2; i >= 0; i--) {
	    if (arr[i] - 'a' < min[i + 1] - 'a') {
		min[i] = arr[i];
	    } else {
		min[i] = min[i + 1];
	    }
	}
	for (int i = 0; i < n; i++) {

	    while (!st.isEmpty() && st.peek() - 'a' <= min[i] - 'a') {
		ans += st.pop();
	    }
	    if (arr[i] - 'a' > min[i] - 'a') {
		st.add(arr[i]);
		continue;
	    }
	    ans += arr[i];
	}
	while (!st.isEmpty()) {
	    ans += st.pop();
	}
	System.out.println(ans);

    }

}
