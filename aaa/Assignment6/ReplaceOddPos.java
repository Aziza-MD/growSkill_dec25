package Assignment6;

public class ReplaceOddPos{
	public static void main(String[] args){
		int n=48291,pos=1,res=0,p=1,d;
		while(n>0){
		d=n%10;
		if(pos%2==1) 
			d=0;
			res=res+d*p;
			p=p*10;
			pos++;
			n=n/10;
		}
	System.out.print(res);
	}
}