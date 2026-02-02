package Assignment7;

public class ArrayOps{
	static int largest(int a[]){
		int m=a[0];
		for(int i=1;i<a.length;i++) 
			if(a[i]>m) m=a[i];
		return m;
		}
		static void fun(int a[]){
				int m=largest(a);
		for(int i=0;i<a.length;i++) 
			if(a[i]==m) 
				a[i]=0;
		}
		static int secLargest(int a[]){
				int f=Integer.MIN_VALUE,s=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
		if(a[i]>f)
		{
			s=f;f=a[i];
		}
		else if(a[i]>s&&a[i]!=f) 
			s=a[i];
		}
		return s;
		}
		public static void main(String[] args){
				int a[]={5,9,3,7};
				System.out.print(largest(a)+" ");
				fun(a);
				System.out.print(secLargest(a));
	}
}