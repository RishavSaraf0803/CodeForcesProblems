import java.io.IOException;
import java.util.*;

 class B677 
{
	
	public static void main(String[] args) throws IOException
	{

		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		for(int tt=0;tt<t;tt++) 
		{
			
			int n=sc.nextInt();
			ArrayList<Integer> adj[]=new ArrayList[n+1];
			for(int i=0; i<=n; i++)
			{
				adj[i]=new ArrayList<>();
			}
			
			for(int i=0;i<n-1;i++) 
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				adj[a].add(b);
				adj[b].add(a);
			}
			bfs(adj,n,1);
			for(int i=1;i<=n;i++) 
			{
			System.out.print(ans[i]+" ");	
			}
			System.out.println();
		}
	}
	static int[] ans;
	static void bfs(ArrayList<Integer> adj[],int n,int s)
	{
		ans=new int[n+1];
		boolean visited[]=new boolean[n+1];
		ans[s]=2;
		Queue<Integer> q=new LinkedList<>();
		q.add(s);
		visited[s]=true;
		while(!q.isEmpty())
		{
			s=q.poll();
			for(int i=0;i<adj[s].size();i++)
			{
				int v=adj[s].get(i);
				if(visited[v]!=true)
				{
					if(ans[s]==2)
						ans[v]=1;
					else
						ans[v]=2;
					q.add(v);
					visited[v]=true;
				}
			}
		}
	}
}

		
