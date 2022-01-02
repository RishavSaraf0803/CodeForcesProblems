import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//Date:02-01-2022
public class A_IntegerDiversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while( t!= 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i = 0; i < n ; i++) {
				arr[i] = sc.nextInt();
			}
			int result = getDiversity(arr);
			System.out.println(result);
			t--;
		}
	}
	static int getDiversity(int[] arr) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			map.put(Math.abs(arr[i]), map.getOrDefault(Math.abs(arr[i]), 0)+1);
		}
		int ans = 0;
		if(map.containsKey(0)) {
		 ans = Math.min(1, map.get(0));
		 map.remove(0);
		}
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			ans += Math.min(2, entry.getValue()); 
		}
		return ans;
		
	
	}
}

