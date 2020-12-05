import java.util.*;

public class c666 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int  n=sc.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
				
			}
			boolean flag=mere(a,n);
			if(flag==true)System.out.println("YES");
			if(flag==false) System.out.println("NO");
			t--;
		}
	}
	
	static int GCD(int a,int b) {
		while(a!=b) {
			if(a>b)a-=b;
			if(b>a)b-=a;
			
		}
		return a;
	}
	
	
	
	
	static int min(int[]a) {
		int min=a[0];int minindex=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				minindex=i;
			
			}
		}
		return minindex;
	}
	static boolean mere(int a[],int n) {
		int b[]=Arrays.copyOfRange(a, 0, n);boolean flag=true;
		Arrays.sort(b);
		int min=b[0];
		
				
				for(int i=0;i<n;i++) {
					if(a[i]!=b[i]&&a[i]%min>0) {
						flag=false;
						
					}
				}
		
			return flag;
		
	}
}


