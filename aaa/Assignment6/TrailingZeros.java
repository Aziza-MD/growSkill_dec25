package Assignment6;

public class TrailingZeros{
	public static void main(String[] args){
		int n=45,t=n,c=0;
		while(t>0)
		{
		c++;
		t/=10;
		}
		if(c==1) 
			System.out.print(n*10);
		else if(c==2) 
			System.out.print(n*100);
		else System.out.print(n);
	}
}