import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class A_Plug_In {

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String s = br.readLine();
	Stack<Character> st = new Stack<>();
	int i = 0;
	while (i < s.length()) {
	    if (st.isEmpty()) {
		st.add(s.charAt(i));
		i++;
	    } else if (s.charAt(i) != st.peek()) {
		st.add(s.charAt(i));
		i++;
	    } else {

		if (!st.isEmpty())
		    st.pop();
		i++;
	    }
	}
	StringBuilder sb = new StringBuilder();
	while (!st.isEmpty())
	    sb.append(st.pop());
	System.out.println(sb.reverse().toString());
    }

}
