package Pract;

public class replacezero {

	public static void main(String[] args) {
		int num=1234;
		int position=1;
		int placevalue=1;
		int temp=0;
		
		while(num>0) {
			int rem=num%10;//4
			if(position%2!=0) {
				rem=0;
			}
			temp=temp+rem*placevalue;
			placevalue=placevalue*10;
			position++;
			num=num/10;
		}
		System.out.println(temp);

	}

}
