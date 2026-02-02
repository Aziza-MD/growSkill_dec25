package Pract;

public class Digizer {

	public static void main(String[] args) {
		
		int num=2111;
		int temp=num;
		int count=0;
		int multiplier=1;		
		while(num>0) {
			count++;
			num/=10;
		}		
		while(count>0) {
			multiplier=multiplier*10;
			count--;
		}		
		System.out.println(temp	*multiplier);
	}

}
