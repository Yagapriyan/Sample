package math2;
//import java.lang.

import java.util.Arrays;

class Absolute 
{
	
	void meth() 
	{
		String A3="Hai buddy";
		StringBuffer obj = new StringBuffer(A3);
		StringBuffer B3=obj.reverse();
		System.out.println(B3);
	}
		
		
		
	
	public static void main(String[] args) {
		
	
			for (int i = 0; i < 5; i++) {
				
				for (int j = 5; j >i; j--) {
					System.out.print("* ");
				}
				System.out.println("");
			}
			 System.out.println(" ");
				
					 //Array duplicate remove
					 int ar[]= {1,2,3,3,4,5,5,6,6};
					 int br[]=new int[ar.length];
					 
					 for (int i = 0; i < ar.length; i++) {
						 int count=0;
					 
						for (int j = i; j < ar.length; j++) {
						
							if(ar[i]==ar[j])
							{
								count++;
							}
						}//closing for 2
							if(count<=1)
							{
							br[i]=ar[i];
							System.out.println(br[i]);
							}
						 }//closing for1
						 System.out.println(" ");
								
								
							//String reverse properly	
						 String A = "Hai maxhi";	
						 String[] B=A.split(" ");	
						  for (int i = B.length-1; i >=0; i--)
						  {
							System.out.print(B[i]+" ");
							 System.out.println(" ");
						}
						  System.out.println(" ");
		
				
								//Anagram
								boolean status = false;
								String A2 = "Peek";
								String B2 = "Keop";
								String AA1= A2.replaceAll("//s", "");
						        String BB1=B2.replaceAll("//s", "");
						        if(AA1.length()!=BB1.length())
						        {
						        	status=false;
						        }
						        else
						        {
						        char[] AAA=AA1.toLowerCase().toCharArray();
						        char[] BBB=BB1.toLowerCase().toCharArray();
						        Arrays.sort(AAA);
						        Arrays.sort(BBB);
						        status=Arrays.equals(AAA, BBB);
						        }
						        if(status)
						        {
						        	System.out.println("anagram");
						        }
						        else
						        {
						        	System.out.println("not an anagram");
						        }
						        System.out.println(" ");
				
						        
									String AA ="yaga";
									String BB="happy";
									String C=AA+B;
									AA=C.substring(AA.length());
									BB=C.substring(0,C.length()-BB.length());
								    System.out.println(A+" "+B);
								    System.out.println(" ");
			
										Absolute obj1 = new Absolute();
										obj1.meth();									
		
	
	}

	
}
   
