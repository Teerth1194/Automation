
public class ContractEmployee extends Employee {

	double wage;
	int hour;
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void calculateSalary() {
		salary=getHour()*getWage();
		System.out.println("Contract Employee : Your salary is "+salary);
		
	}
	
}
