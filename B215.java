import java.util.*;
import java.io.*;

public class B215 {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out=new PrintWriter(System.out);
		StringTokenizer st=new StringTokenizer(br.readLine());
		Scanner sc=new Scanner(System.in);
		
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int a[]=new int[n];
		String [] s=br.readLine().trim().split(" ");
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(s[i]);
			//a[i]=sc.nextInt();
		}
		for(int ele:a)
			System.out.print(ele+" ");
		
		//out.close();
		
		int dp[]=new int[n];
		dp[n-1]=1;
		Set<Integer> set=new HashSet<>();
		set.add(a[n-1]);
		for(int i=n-2;i>=0;i--) {
			if(!set.contains(a[i]))
				dp[i]=dp[i+1]+1;
			else
				dp[i]=dp[i+1];
				
			set.add(a[i]);
				
		}
		//for(int ele:dp)
		  // System.out.print(ele+" ");
		Vector<Integer> v=new Vector<>();
		for(int i=0;i<m;i++) {
			int get=sc.nextInt();
			v.add(dp[get-1]);
		
		}
		for(int ele:v)
			System.out.println(ele);
		
	}
}
