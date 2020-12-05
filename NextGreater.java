import java.util.*;
public class NextGreater {

public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0) {
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> al=new ArrayList<>();
		Stack<Integer> st=new Stack<>();
		HashMap<Integer,Integer> hm=new HashMap<>();
		st.push(arr[0]);
		int i=1;
		while(i<N){
		    while(!st.isEmpty()&&arr[i]>st.peek()){
		        
		        
		        int g=st.pop();;
		        hm.put(g,arr[i]);
		        
		    }
		    st.push(arr[i]);
		    i++;
		}
		while(!st.isEmpty()){
		    
		    int h=st.peek();
		    hm.put(h,-1);
		    st.pop();
		}
		for(int j=0;j<N;j++){
			int re=hm.get(arr[j]);
		    System.out.print(re+" ");
		}
		System.out.println();
		T--;
		}
	}
}
