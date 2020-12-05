import java.util.Scanner;

public class SubsetSumPartitoner {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0) {
		int n=sc.nextInt();
		int num[]=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		if(Sumpartitioner(num,n)==true)System.out.println("YES");
		else System.out.println("NO");
		t--;
	}
}
static boolean Sumpartitioner(int[] num,int n) {
	
	int sum=0;
	for(int i=0;i<n;i++) {
		sum+=num[i];
	}
	if(sum%2==1)return false;
	else {
		int k=sum/2;                                                                     
		boolean dp[][]=new boolean[n+1][k+1];
		for(int i=0;i<=n;i++)dp[i][0]=true;
		for(int j=1;j<=k;j++)dp[0][j]=false;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				if(num[i-1]<=j)dp[i][j]=dp[i-1][j-num[i-1]] || dp[i-1][j];
				else dp[i][j]=dp[i-1][j];
			}
		} 
		return dp[n][k];
		
	}
}
}
