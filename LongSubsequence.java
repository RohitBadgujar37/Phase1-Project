package projectQ;


		import java.util.Scanner;

		import java.util.Arrays;
		 
		public class LongSubsequence 
          {
			
		    public static int longest_increasing_subsequence_length(int a[] , int l[] , int n)
		  {
		      int i,j;
		       
		         for(i=0;i<n;i++)
		       {
		           for(j=0;j<i;j++)
		          {
		              if(a[i]>=a[j])
		               
		                l[i]=Math.max(l[j]+1,l[i]);
		          }
		       }
		       
		       Arrays.sort(l);
		         
		         return l[n-1];
		  }
		  
		       public static void main(String[] args)
		  
		  {
		      Scanner scan = new Scanner (System.in);
		      
		        int n = scan.nextInt();
		      
		        int a[] = new int[n];
		        
		            int l[] = new int[n];
		        
		          int i;
		          
		          for(i=0;i<n;i++)
		         
		          {
		             a[i] = scan.nextInt();
		             
		               l[i]=1;
		         }
		         
		         System.out.println(longest_increasing_subsequence_length(a,l,n));
		  }

		

	}


