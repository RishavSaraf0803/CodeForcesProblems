import java.util.Scanner;

public class WrongSubtraction {

	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
        long n =sc.nextLong();
        int k=sc.nextInt();
        
        for(int i=k;k>=1;k--) {
        	if(n%10!=0)
        		n=n-1;
        	else if(n%10==0)
        		n=n/10;
        }
        System.out.print(n);
	}
}
                                      


