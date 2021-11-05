
public class Chocolate {

	int barCode = 0;
	String name ="";
	int weight=0;
	int cost=0;
		
	Chocolate(){
		barCode=101;
		name ="Cadbury";
		weight=12;
		cost=10;
	}
	
	public int getBarCode() {
		return barCode;
	}
	
	public void setBarCode(int pbarCode) {
		barCode=pbarCode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String pname) {
		name=pname;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int pweight) {
		weight=pweight;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setCost(int pcost) {
		cost=pcost;
	}
	
	public void displayDetails() {
		System.out.println("barCode"+barCode);
		System.out.println("Cost"+cost);
		System.out.println("Name"+name);
		System.out.println("Weight"+weight);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate c1=new Chocolate();
		c1.setBarCode(102);
		c1.setCost(50);
		c1.setName("Hershey's");	
		c1.setWeight(24);
		c1.displayDetails();
	}

}
