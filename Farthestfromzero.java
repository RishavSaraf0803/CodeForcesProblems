import java.util.*;
public class Farthestfromzero {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0) {
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(arr[0]>=0) {
			System.out.print(arr[N-1]);
		}
		else {
			if((-1*arr[0])>arr[N-1]) {
				System.out.print(-1*arr[0]);
			}
			else {
				System.out.print(arr[N-1]);
			}
		}
	}
	}
}
