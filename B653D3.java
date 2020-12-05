import java.util.Scanner;

public class B653D3 {

	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			
		   int n=sc.nextInt();
		   System.out.println(solve(n));
		   t--;
		}
	}
	static int solve(int n) {
		int count=0;boolean flag=true;
	
		
		while(n>=1) {
			if(n==1)return count;
		    if(n%6!=0&&n%6!=3)return -1;
		    if(n%6==3) {
		    	n*=2;
		    	count++;
		    }
		    if(n%6==0) {
		    	n/=6;
		    	count++;
		
		}
		   
	}
		return -1;
	}
}
