import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			
		   int n=sc.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++) {
			   arr[i]=sc.nextInt();
			   
		   }
		   Arrays.sort(arr);
		   int result=removeDuplicates(arr);
		   System.out.println(result);
		   t--;
		}
	}
	 public static int removeDuplicates(int[] nums) {
	        
	        int low=0;int high=0;int temp=0;int result=0;
	        
	       while(high<nums.length){
	           if(nums[low]==nums[high]){
	               
	                   temp++;
	                   high++;
	                   if(high==nums.length)result++;
	               }
	               else {
	            	   if(temp>=2)result+=2;
	            	   else result+=temp;
	            	   low=high;
	            	   temp=0;
	            	   
	               }
	           }
	       
	        return result;
	    }

}
