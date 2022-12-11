package math2;

import java.util.Arrays;

//import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Test1 {
	int A[]= {23,45,67,12,7};
	int J=2;
	int [] B = new int[A.length];
	
	void Method1()
	{
	 
	 for(int i=0;i<A.length;i++)
	  { 
		 if(A[i]!=A[J])
		 {
		B[i]=A[i];	
		 }
	  }
	  for(int j=0;j<B.length;j++)
	   {
	   System.out.println(B[j]);
	   }
	}   
	
	void Method2()
	{//To print a string each word start and end in caps
		 String A ="Anything can be achieved if we are consistent in that";
		 String B[] = A.split(" ");
		 
		 for(int i=0;i<=B.length-1;i++)
		 {
			 
			 
		 }
	}
	
	void Method3()
	{
		String A[] = {"satish","ramesh","abilash","dinesh","bala"};
		//for(int i=0;i<A.length;i++)
		
			
		 Arrays.sort(A);
		 System.out.println(Arrays.toString(A));
		
		 //Try it without arrays class 
	}
	
	
	public static void main(String[] args) 
	{
		Test1 obj = new Test1();
		obj.Method1();
		//obj.Method2();
		obj.Method3();
	}
}
