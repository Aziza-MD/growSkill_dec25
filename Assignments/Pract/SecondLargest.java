package Pract;

public class SecondLargest {
	public void swap(int[] arr) {
		int max=arr[0];
		int second=Integer.MIN_VALUE;
		for(int i=0;i<=arr.length-1;i++) {
			int current=arr[i];
			if(current>max) {
				second=max;
				max=current;
			}
			else if(current<max && current>second)
				second=current;		
		}		
		System.out.println(second);
		
	}
	public static void main(String[] args) {
			int arr[]= {100,200,300,400,500, 600};
			SecondLargest s=new SecondLargest();
			s.swap(arr);
	}


}
