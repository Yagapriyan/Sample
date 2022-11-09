import java.util.Arrays;

public class General {
	
	//Palindrome
	void method1() 
	{
	int a =102;
	int sum=0;
	//int count=0;
	while(a>0)
	{
		int mod=a%10;
		sum=(sum*10)+mod;
		a=a/10;
//count++;
	}
	System.out.println("The given input reverse of is "+ sum);
	System.out.println("");
	
	}
	
	
	  //prime numbers from 1 to n 
	  void method2()
	  { for(int i=0;i<=50;i++)
	    { 
		  int count=0;
	       for(int j=1;j<=i;j++) 
	       {
	    	   if(i%j==0)
	    	   { count++; }
	  
	  } if(count==2) { System.out.print(" "+i); }
	  
	  
	  }
	  System.out.println(" ");
	  System.out.println();
	  }
	 
	
	//pattern left angle reverse
	void method3()
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=0;j--)
			{ 
				if(i<j)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	
	 void method4()
	{ //Print array ascending and descending
		 int ar[]= {200,35,15,40,100};
		 int arr []= new int[ar.length];
		Arrays.sort(ar);

		System.out.println("Ascending order: "+Arrays.toString(ar));
		for(int i=4;i>=0;i--)
		{
		 System.out.print("Descending order: "+ar[i]);
		}
		System.out.println();
		System.out.println(Arrays.equals(ar, arr));
		System.out.println();
		
	}
	 
	 //String split
	 void method5()
	 {
		 String A="Hai buddy how are you";
		 System.out.println(A.charAt(5));
		 
		 System.out.println(A.toCharArray());
       
         String C[] =A.split(" ");
         for(int i=0;i<=C.length-1;i++)
         {
        	 System.out.println(C[i]);
        	 
         }
         for(int i=0;i<=C.length-1;i++)
         {
        	 
         
         int count=0;
    	 if(A.charAt(i)==' ')
    	 {
    		 count++;
    	 }
    	 System.out.println(count);
        
         }
	 }
	 
	 
	 void method6()
	 {
		 int a =10;
		 int b=20;
		 int HCF=0;
		 for(int i=1;i<=a;i++)
		 {
			 if(a%i==0 && b%i==0)
			 {
				 HCF=i;
			 }
						 
		 }
		 System.out.println(HCF);

		 
	 }
	 
	 void method7()
	 {
		 int a=3;
		 int b=0;
		 int c=b/a;
		 System.out.println(c);
	 }
	
	public static void main(String[] args) 
	{
	General obj = new General();
	obj.method1();
	obj.method2();
	obj.method3();
	obj.method4();
	obj.method5();
	obj.method6();
	obj.method7();
	}
	
	
}

