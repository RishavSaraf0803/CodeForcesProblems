import java.util.*;

public class EvenArray {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0) {
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(minmove(arr,N));
		T--;
}
	}
	static int minmove(int[]arr,int n) {
		if(n==0&&arr[0]%2!=0)return -1;
		if(n==0&&arr[0]%2==0)return 0;
		int counteven=0;
		int countodd=0;
		for(int i=0;i<n;i+=2) {
			if(arr[i]%2!=0)counteven++;
		}
		for(int i=1;i<n;i+=2) {
			if(arr[i]%2!=1)countodd++;
		}
		if(counteven==countodd)return counteven;
		else return -1;
	}
}
