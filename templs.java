import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class templs {

    public static void main(String[] args) {
	/*
	 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
	 * class should be named Solution.
	 */
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	List<String> list = new ArrayList<>();
	helper(0, 0, 0, 0, 0, new char[2 * (n + m)], n, m, list);
	for (String s : list) {
	    System.out.println(s);
	}
    }

    private static void helper(int o1, int c1, int o2, int c2, int indx, char[] ch, int n, int m, List<String> list) {
	if (indx >= ch.length) {
	    list.add(String.valueOf(ch));
	    return;
	}
	if (o1 < n) {
	    ch[indx] = '(';
	    helper(o1 + 1, c1, o2, c2, indx + 1, ch, n, m, list);
	}
	if (o2 < m) {
	    ch[indx] = '{';
	    helper(o1, c1, o2 + 1, c2, indx + 1, ch, n, m, list);

	}
	if (o1 == n && c1 < n && (indx == 0 || ch[indx - 1] == '(')) {
	    ch[indx] = ')';
	    helper(o1, c1 + 1, o2, c2, indx + 1, ch, n, m, list);
	}
	if (o2 == m && c2 < m && (indx == 0 || ch[indx - 1] == '{')) {
	    ch[indx] = '}';
	    helper(o1, c1, o2, c2 + 1, indx + 1, ch, n, m, list);
	}
    }
}