import java.util.*;



public class Missingnumber {
	


		public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
			int T=sc.nextInt();
			while(T>0) {
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=sc.nextInt();
			}
			int init=1;
			
			for(int i=0;i<N;i++){
			    init++;
			    if(arr[i]!=init){
			        System.out.println(init);
			        
			  }
			}
			
			T--;
			}
		}
	}


