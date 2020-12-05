import java.util.*;
public class largestremovingkdigits {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
	    String num=sc.next();
	    int k=sc.nextInt();
	    
	    System.out.print(largest(num,k));
	
	}
	static String largest(String num,int k) {
		Stack<Character> st=new Stack<>();
        if(num.length()==k)return "0";
        for(int i=0;i<num.length();i++){
            char c=num.charAt(i);
            while(k>0&&!st.isEmpty()&&st.peek()<c){
                st.pop();
                k--;
            }
            
            st.push(c);
        }
        for(int i=0;i<k;i++){
            st.pop();
        }
        StringBuilder sb=new StringBuilder();
        
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        return sb.reverse().toString();
	}
}
