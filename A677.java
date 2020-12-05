import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class A677 {
	public static void main(String[] args) throws IOException{

		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		for(int tt=0;tt<t;tt++) {
			
			int n=sc.nextInt();
			int ans=0;
			int digit=n%10;
			ans=10*(digit-1);
			int getcount=count(n);
			while(getcount!=0) {
				ans+=getcount;
				getcount--;
			}
			System.out.println(ans);
			
		}

	}
	static int count(int n) {
		int ans=0;
		while(n!=0) {
			ans++;
			n/=10;
		}
		return ans;
	}
	
}
