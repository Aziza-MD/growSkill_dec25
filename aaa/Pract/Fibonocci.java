package Pract;

public class Fibonocci {
	static void fib(int count) {
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2+" ");
		int i=1;
		while(i<(count-2)) {
			int num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
			i++;
		}
	}
	public static void main(String[] args) {
		Fibonocci f = new Fibonocci();
		f.fib(7);

	}

}
