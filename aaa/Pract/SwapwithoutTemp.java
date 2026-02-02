package Pract;

public class SwapwithoutTemp {

	public void swap(int[] arr) {  
		int a=arr[0];
		int b=arr[arr.length-1];  
		a=a+b;
		b=a-b;
		a=a-b;
		
		arr[0]=a;
		arr[arr.length-1]=b;
		for(int i=0;i<=arr.length-1;i++)
		   System.out.print(arr[i]+" ");
		
	}

	
	public static void main(String[] args) {
		int arr[]= {100,200,300,400,500};
		SwapwithoutTemp s=new SwapwithoutTemp();
		s.swap(arr);		
	}


}
