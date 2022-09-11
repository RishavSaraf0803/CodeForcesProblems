import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
	// TODO Auto-generated method stub
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	int[] arr = new int[n];
	String[] temp = br.readLine().split(" ");
	for (int i = 0; i < n; i++) {
	    arr[i] = Integer.parseInt(temp[i]);
	}
	String t = br.readLine();
	Stack<Integer> st1 = new Stack<>();
	Stack<Integer> st2 = new Stack<>();
	boolean flag = true;
	for (int i = 0; i < n; i++) {
	    if (!st1.isEmpty() && arr[i] < st1.peek()) {
		st2.add(st1.pop());
	    }
	    while (!st2.isEmpty() && st2.peek() > st1.peek() && arr[i] > st2.peek()) {
		int x = st2.pop();
		st1.add(x);
	    }
	    st1.add(arr[i]);

	}
	while (!st2.isEmpty()) {
	    st1.add(st2.pop());
	}
	int x = st1.pop();
	while (!st1.isEmpty() && st1.peek() >= x) {
	    x = st1.pop();
	}
	if (!st1.isEmpty())
	    flag = false;

	if (flag) {
	    System.out.println("Yes");
	} else {
	    System.out.println("No");
	}
    }

}
