import java.util.Scanner;
import java.io.PrintWriter;
import java.util.*;
class GSUB {
	 
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 PrintWriter out=new PrintWriter(System.out);
		 int t=sc.nextInt();
		 while(t!=0)
		 {
			 int n=sc.nextInt();
			 int q=sc.nextInt();
			 int arr[]=new int[n];
			 for(int i=0;i<n;i++)
			 {
				 arr[i]=sc.nextInt();
			 }
			 int length=findlongest(arr,n);
			 StringBuilder sb=new StringBuilder();
			 for(int j=0;j<q;j++)
			 {
				 int x=sc.nextInt()-1;
				 int y=sc.nextInt();
				 if(x!=0)
				 {
					 length-=(arr[x-1]!=arr[x]?1:0);
					 length+=(arr[x-1]!=y?1:0);
				 }
				 if(x!=n-1)
				 {
					 length-=(arr[x+1]!=arr[x]?1:0);
					 length+=(arr[x+1]!=y?1:0);
				 }
				sb.append(length+"\n");
				 arr[x]=y;
				
			} 
			out.println(sb.toString());	 
			 t--;
			 
		 }
		 out.close();
	 }
	 static int findlongest(int[]arr,int n)
	 {
		 int res=0;
		 int prev=-1;
		 for(int i=0;i<n;i++)
		 {
			 if(prev!=arr[i])
			 {
				 prev=arr[i];
				 res++;
			 }
		 }
		 return res;
		 
	 }

}
