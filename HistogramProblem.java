import java.util.Arrays;
import java.util.Stack;

public class HistogramProblem {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

    private static long getMaxRectangle(int[] arr, int n) {
	int[] pse = new int[n], nse = new int[n];
	Arrays.fill(pse, -1);
	Arrays.fill(nse, n);
	Stack<Integer> stack = new Stack<>();
	stack.add(0);
	for (int i = 1; i < n; i++) {
	    while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
		nse[stack.pop()] = i;
	    }
	    stack.add(i);
	}
	stack.clear();
	stack.add(n - 1);
	for (int i = n - 2; i >= 0; i--) {
	    while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
		pse[stack.pop()] = i;
	    }
	    stack.add(i);
	}
	long ans = 0;
	for (int i = 0; i < n; i++) {
	    ans = Math.max(ans, (long) arr[i] * (long) (nse[i] - pse[i] - 1));
	}
	return ans;
    }

}
