package Assignment8;

public class Vehicle{
	int id;
	String name;
	final int baseRentalPrice;
	static int totalVehiclesCreated;
		Vehicle(){
		id=0;
		name="NA";
		baseRentalPrice=100;
		totalVehiclesCreated++;
	}
			Vehicle(int i,String n,int p){
			id=i;
			name=n;
			baseRentalPrice=p;
			totalVehiclesCreated++;
	}
	double calculateRent(int d){
	return baseRentalPrice*d;
	}
	}
	class Car extends Vehicle{
	int extra;
	Car(int i,String n){
		super(i,n,500);
		extra=200;
	}
	Car(int i,String n,int p,int e){
				super(i,n,p);
				extra=e;
	}
	double calculateRent(int d){
		return baseRentalPrice*d+extra*d;
	}
	}
	class Bike extends Vehicle{
			int extra;
			Bike(int i,String n){
			super(i,n,200);
			extra=50;
	}
	Bike(int i,String n,int p,int e){
			super(i,n,p);
			extra=e;
			}
	double calculateRent(int d){
			return baseRentalPrice*d+extra*d;
			}
	}
	class Main{
	public static void main(String[] args){
	Car c1=new Car(1,"CarA");
	Car c2=new Car(2,"CarB",600,250);
	Bike b1=new Bike(3,"BikeA");
	Bike b2=new Bike(4,"BikeB",300,80);
		System.out.print(c1.calculateRent(5)+" ");
		System.out.print(c2.calculateRent(5)+" ");
		System.out.print(b1.calculateRent(5)+" ");
		System.out.print(b2.calculateRent(5)+" ");
		System.out.print(Vehicle.totalVehiclesCreated);
	}
}