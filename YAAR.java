import java.util.*;

public class YAAR {

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			int  x=sc.nextInt();
            int y=sc.nextInt();
            print(x,y,n);
            t--;
		}
	}
	static void print(int x,int y,int n) {
		StringBuilder sb=new StringBuilder();
		int count=n-2;
		int i=n;
		int num=0;
		while(i>0) {
			
			if((y-x)%i==0) {
			  num=(y-x)/i;
			  if(x+num*(count+1)>=y)break;
			}
			
			i--;
		}
		int l=x;
		while(count>0&&(l+num)<y) {
			 l=l+num;
			sb.append(Integer.toString(l));
			sb.append(" ");
			--count;
			
		}
		int m=x;
		while(count>0&&m-num>0) {
			m=m-num;
			sb.append(Integer.toString(m));
			sb.append(" ");
			--count;
		}
		int o=y;
		while(count>0) {
			o=o+num;
			sb.append(Integer.toString(o));
			sb.append(" ");
			--count;
		}
		sb.append(x);
		sb.append(" ");
		sb.append(y);
		System.out.println(sb.toString());
		
		
		
	}
}
