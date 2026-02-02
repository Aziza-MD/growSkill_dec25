package Pract;

public class zeroadd {

    public static void main(String[] args) {
        int num=1234;
        int temp=0;
        int position=1;
        int placevalue=1;
    /*rem → what digit
placevalue → where the digit goes
position → whether to keep or zero it*/   
        while(num>0) {
        	int rem=num%10;//4
        	//odd position replace with 0
        	if(position%2!=0) {
        		rem=0;
        	}
        	temp = temp+
        	placevalue = placevalue*10;          	
        	
        	num=num/10;
        }
    }

}
