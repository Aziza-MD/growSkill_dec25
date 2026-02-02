package Assignment5;

public class EvenOddDigits{
	public static void main(String[] args){
		int n=24879,e=0,o=0,rem;
		while(n>0){
		rem=n%10;
			if(rem%2==0) 
				e++; 
			else 
				o++;
		n=n/10;
		}
		System.out.print("Even digits: "+e+"\nOdd digits: "+o);
		}
		}