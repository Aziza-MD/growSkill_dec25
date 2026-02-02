package Pract;

public class DigitandZero {

	public static void main(String[] args) {
		int num=23;
		int temp=num;
		int digits=0;
		while(num>0) {
//			int rem=num%10;	//2		 
			num=num/10;
			digits++;
		}
		if(digits==1)
			System.out.println(temp*10);
		else if(digits==2)
		System.out.println(temp*100);
		else
			System.out.println(temp);

	}

}
