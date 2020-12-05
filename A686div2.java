import java.util.Scanner;

public class A686div2 {
	
	public static void main(String[]args) 
	{
	
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t!=0)
		{
			int n=sc.nextInt();
			
			StringBuilder sb=new StringBuilder();
			if(n%2==0)
			{
				for(int i=n;i>=1;i--)
				{
				
					sb.append(i+" ");
				}
				System.out.println(sb.toString());
			}
			else
			{
				int mid=n/2 +1;
				sb.append(mid+" ");
				for(int i=n;i>=1;i--)
				{
					if(i!=mid)
					{
						sb.append(i+" ");
					}
				}
				System.out.println(sb.toString());
			}
			t--;
	}
	}
}


