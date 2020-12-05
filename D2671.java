import java.util.Arrays;
import java.util.Scanner;

public class D2671 {
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	
			
		   int n=sc.nextInt();
		   int arr[]=new int[n];
		   for(int i=0;i<n;i++)
			   arr[i]=sc.nextInt();
		   
		   Arrays.sort(arr);
	     
		   int mid=(n-1)/2;
		  
		   //printing max number
		   int count=0;
		   if(n%2==1) {
		   int low=mid;
		   
		   int k=0;
			   while(k<mid&&low<n-1) {
				   if(arr[k]<arr[low]&&arr[k]<arr[low+1]) {
					   count++;
					   low++;
					   k++;
				   }
				   else  if(arr[k]==arr[low]) {
					  low++;
					  
					  
				   }
				   else break;
			   
		   }
		   }
		   else {
			   int k=0;int low=mid+1;
			   while(k<=mid&&low<n-1) {
				   if(arr[k]<arr[low]&&arr[k]<arr[low+1]) {
					   count++;
					   low++;
					   k++;
				   }
				   
				   else if(arr[k]==arr[low]) {
						  low++;
						  
				   }
				   else break;
			   }
				   
			   }
		   
		   System.out.println(count);
          
           
		   //printing the array
		   
		   if(n%2==1) {       //number of elements odd
           int i =0;int j=mid;
       
          
           
           
           while(j<n&&i<mid) {
        	   System.out.print(arr[j]+" "+arr[i]+" ");
        	   i++;j++;
           }
           
           System.out.print(arr[j]);
          
           }
           else {             //number of elements even
        	   int i=0;int j=mid+1;
        	   while(j<n&&i<mid+1) {
        		   System.out.print(arr[j]+" "+arr[i]+" ");
        		   i++;j++;
        	   }
        	   
           }
	
	}

}


