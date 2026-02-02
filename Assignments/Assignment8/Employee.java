package Assignment8;

public class Employee{
	String name;
	int id;
	final int joiningYear;
	static String companyName="TechNova Pvt Ltd";
	static int employeeCount;
	Employee(){
			name="Unknown";
			id=0;
			joiningYear=2020;
			employeeCount++;
	}
	Employee(String n,int i,int y){
			name=n;
			id=i;
			joiningYear=y;
			employeeCount++;
	}
	double calculateSalary(){
			return 30000;
	}
	void displayDetails(){
			System.out.print(name+" "+id+" "+joiningYear+" "+companyName+" "+calculateSalary()+"\n");
	}
	}
	class Developer extends Employee{
				int bonus;
				Developer(String n,int i){
				super(n,i,2021);
				bonus=0;
	}
	Developer(String n,int i,int b){
			super(n,i,2021);
			bonus=b;
	}
	double calculateSalary(){
	return 30000+bonus;
	}
	}
	class Manager extends Employee{
			int allowance;
			Manager(String n,int i){
			super(n,i,2021);
			allowance=0;
	}
			Manager(String n,int i,int a){
			super(n,i,2021);
			allowance=a;
	}
	double calculateSalary(){
				return 40000+allowance;
	}
	}
	class MainEmp{
	public static void main(String[] args){
	Developer d1=new Developer("A",1);
	Developer d2=new Developer("B",2,5000);
	Manager m1=new Manager("C",3);
	Manager m2=new Manager("D",4,8000);
			d1.displayDetails();
			d2.displayDetails();
			m1.displayDetails();
			m2.displayDetails();
	System.out.print(Employee.employeeCount);
	}
}