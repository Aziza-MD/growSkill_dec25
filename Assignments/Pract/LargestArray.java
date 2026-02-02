package Pract;

public class LargestArray {

	public void swap(int[] arr) {
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
		
	}
	public static void main(String[] args) {
			int arr[]= {100,200,300,400,500, 600};
			LargestArray s=new LargestArray();
			s.swap(arr);
	}

}
