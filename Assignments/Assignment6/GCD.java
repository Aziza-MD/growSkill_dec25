package Assignment6;

public class GCD{
	static int findGCD(int a,int b){
		int g=1;
		for(int i=1;i<=a&&i<=b;i++) 
			if(a%i==0&&b%i==0) 
				g=i;
		return g;
		}
		public static void main(String[] args){
		System.out.print(findGCD(24,36));
	}
}