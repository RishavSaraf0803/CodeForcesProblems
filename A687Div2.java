import java.util.Scanner;

public class A687Div2 {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int r=sc.nextInt();
			int c=sc.nextInt();
			int ans=solve(n,m,r,c);
			
			System.out.println(ans);
			t--;
		}
	}
	static int solve(int n,int m,int r,int c)
	{
		int x=Math.max(n-r, r-1);
		int y=Math.max(m-c,c-1 );
		return x+y;
	}
}
