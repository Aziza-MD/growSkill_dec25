package Pract;

public class Factors {

	public static void main(String[] args) {
		int num=16;
		for(int fact=1;fact<=num;fact++) {
			if(num%fact==0)
				System.out.print(fact+" ");
		}

	}

}
