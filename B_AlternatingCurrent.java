import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_AlternatingCurrent {

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s = br.readLine();
	Stack<Character> st = new Stack<>();
	int i = 0;
	while (i < s.length()) {
	    char c = s.charAt(i);
	    if (st.isEmpty() || c != st.peek()) {
		st.add(c);

	    } else {

		st.pop();

	    }
	    i++;
	}
	if (st.isEmpty())
	    System.out.println("Yes");
	else
	    System.out.println("No");

    }

}
