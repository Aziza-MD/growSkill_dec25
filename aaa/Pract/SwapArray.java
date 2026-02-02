package Pract;

public class SwapArray {
	
	public void swap(int[] arr) {
//		
			int temp=arr[0];
			arr[0]=arr[arr.length-1];
			arr[arr.length-1]=temp;
			for(int i=0;i<=arr.length-1;i++) 
			  System.out.print(arr[i]+" ");
			
	}
	public static void main(String[] args) {
		int arr[]= {100,200,300,400,500};
		SwapArray s=new SwapArray();
		s.swap(arr);		

	}

}
