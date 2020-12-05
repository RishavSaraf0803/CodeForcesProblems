import java.util.*;

public class B666 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
	
			int  n=sc.nextInt();
			int arr[]=new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				}
			
			Arrays.sort(arr);
			
			long big=(long)Math.pow(10,15 );
			long res=big;long c=1;
			
			while(true) {
				long value=0;long pw=1;
				for(int i=0;i<n;i++) {
					
					
					
					 if(pw>=big) {
						 value=-1;
						 break;
					 }
			
					 value+=Math.abs(pw-arr[i]);
					 pw*=c;
					
				}
				if(value==-1)break;
				res=Math.min(res,value);
				c++;
				
			}
			System.out.print(res);
	    		
   
}}
