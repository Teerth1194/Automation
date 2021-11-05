
public class PermanentEmployee extends Employee {

	double basicPay;
	double hra;
	int experience;
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public void calculateSalary() {
		
		double variableComponent;
		if (getExperience()<3) {
			variableComponent=getBasicPay()*0;
			salary=basicPay+hra+variableComponent;
		}
		
		else if ((getExperience()>=3) &&(getExperience()<5)) {
			variableComponent=getBasicPay()*0.05;
			salary=basicPay+hra+variableComponent;
		}
		
		else if ((getExperience()>=5) &&(getExperience()<10)) {
			variableComponent=getBasicPay();
			salary=basicPay+hra+variableComponent;
		}
		
		else if ((getExperience()>=12)) {
			variableComponent=getBasicPay()*(12/100);
			salary=basicPay+hra+variableComponent;
		}
		
		System.out.println("Parmanent Employee : Your salary is "+getSalary() );
	}
}
