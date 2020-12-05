import java.util.*;

public class MinimumCoins2 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int coins[]=new int[5];
		coins[0]=1;coins[1]=5;coins[2]=10;coins[3]=20;coins[4]=100;
		int n=sc.nextInt();
		
		System.out.print(mincoin(coins,n));
	}
	static int mincoin(int[]coins,int n) {
		int result=0;
		for(int i=coins.length-1;i>=0;i--) {
		while(n>=coins[i]) {
		
			n-=coins[i];
			result++;
		
		}
		if(n==0)break;
	}
		return result;
		}
}
