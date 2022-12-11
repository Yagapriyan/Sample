package math2;

public class Thready 
{
	public static void main(String[] args) {
		//bottom pointing arrow.
		
		int A[]= {5,2,8,9,3,6,4,1};
		//ARRAY ASCENDING ORDER
		for (int i = 0; i < A.length; i++) 
		{
			int sum =0;
			for (int j = i+1; j < A.length; j++) 
			{	
			if(A[i]>A[j])
			{
				sum = A[i];
		        A[i]=A[j];
		        A[j]=sum;
			}
			
			}
			System.out.println("    "+A[i]);
		}
		//System.out.println("");
	
		/*Inverted pyramid*/
		for (int i = 5; i >0; i--) {
			for (int k =5; k>i; k--) {
				System.out.print(" ");	
				}
			for (int j = 0; j <i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
}
