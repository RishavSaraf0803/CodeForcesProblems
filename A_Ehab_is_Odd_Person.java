import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A_Ehab_is_Odd_Person {

    public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	List<Long> arr = new ArrayList<>();
	int countOdd = 0, countEven = 0;
	String[] temp = br.readLine().split(" ");
	for (int i = 0; i < n; i++) {

	    arr.add(Long.parseLong(temp[i]));
	    if (arr.get(i) % 2 == 1) {
		countOdd++;
	    } else {
		countEven++;
	    }
	}
	if (countOdd != n && countEven != n) {
	    Collections.sort(arr);
	}
	StringBuilder sb = new StringBuilder();
	for (long ele : arr) {
	    sb.append(ele);
	    sb.append(" ");
	}
	System.out.println(sb.toString());
    }

}
