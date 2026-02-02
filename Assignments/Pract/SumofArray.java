package Pract;

public class SumofArray {

	
	public void swap(int[] arr) {
		int sum=0;
		for(int i=0;i<=arr.length-1;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
			int arr[]= {100,200,300,400,500, 600};
			SumofArray s=new SumofArray();
			s.swap(arr);
	}



}
