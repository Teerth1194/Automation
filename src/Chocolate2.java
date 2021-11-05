public class Chocolate2 {
	private int barCode;
	private String chocolateName;
	private int weight;
	private int cost;

	public Chocolate2() {
		barCode = 105;
		chocolateName = "Parly Chocolate";
		weight = 100;
		cost = 100;
	}

	public Chocolate2(int barCode, String chocolateName, int weight, int cost) {
		this.barCode = barCode;
		this.chocolateName = chocolateName;
		this.weight = weight;
		this.cost = cost;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getChocolateName() {
		return chocolateName;
	}

	public void setChocolateName(String chocolateName) {
		this.chocolateName = chocolateName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public static void main(String args[]) {
		Chocolate2 oChocolate = new Chocolate2();
		System.out.println("Bar Code: " + oChocolate.getBarCode() + " Chocolate Name: " + oChocolate.getChocolateName()
				+ " Weight: " + oChocolate.getWeight() + " Cost: " + oChocolate.getCost());
		oChocolate.setBarCode(101);
		oChocolate.setChocolateName("Kit-Kat");
		oChocolate.setWeight(20);
		oChocolate.setCost(20);
		Chocolate2 oChocolate1 = new Chocolate2(oChocolate.getBarCode(), oChocolate.getChocolateName(),
				oChocolate.getWeight(), oChocolate.getCost());
		System.out
				.println("Bar Code: " + oChocolate1.getBarCode() + " Chocolate Name: " + oChocolate1.getChocolateName()
						+ " Weight: " + oChocolate1.getWeight() + " Cost: " + oChocolate1.getCost());
	}
}