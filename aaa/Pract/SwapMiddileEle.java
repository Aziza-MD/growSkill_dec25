package Pract;

public class SwapMiddileEle {
	

	public void swap(int[] arr) {
		int length=arr.length;
		if(length%2==0) {
			int mid=length/2-1;
			
			arr[mid]=arr[mid]+arr[mid+1];
			arr[mid+1]=arr[mid]-arr[mid+1];
			arr[mid]=arr[mid]-arr[mid+1];
			
			for(int i=0;i<=arr.length-1;i++)
			   System.out.print(arr[i]+" ");
		}
		
		else {
			for(int i=0;i<=arr.length-1;i++)
				   System.out.print(arr[i]+" ");
			}
		}
		
	public static void main(String[] args) {
		int arr[]= {100,200,300,400,500, 600};
		SwapMiddileEle s=new SwapMiddileEle();
		s.swap(arr);

	}


}
