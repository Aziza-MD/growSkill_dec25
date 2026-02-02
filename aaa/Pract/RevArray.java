package Pract;

public class RevArray {
	
	public void reverse(int arr[]) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int arr[]= {100,200,300,400,500};
		RevArray a=new RevArray();	
		a.reverse(arr);

	}


}
