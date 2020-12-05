import java.util.*;

public class A666 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int  n=sc.nextInt();
			String arr[]=new String[n];
			
			for(int i=0;i<n;i++) {
				arr[i]=sc.next();
				}
			int count[]=new int [26];
			Arrays.fill(count,0);
			for(int i=0;i<n;i++) {
				
			String s=arr[i];
				for(int j=0;j<s.length();j++) {
					count[(s.charAt(j)-'a')]++;
				}
					
				}
			boolean flag=true;
			for(int i=0;i<26;i++) {
				if(count[i]%n!=0) {
					flag=false;
					break;
				}
			}
			if(flag==true)System.out.println("YES");
			else System.out.println("NO");
			t--;
		}
			}

}
