
public class PlayerRating {
	
	int playerPosition;
	String playerName;
	float criticoneRating;
	float critictwoRating;
	float criticthreeRating;
	
	float averageRating;
	
	public PlayerRating(int playerPosition,String playerName) {
		this.playerName=playerName;
		this.playerPosition=playerPosition;
	}
	
	public void calculateAverageRating(float criticoneRating, float critictwoRating){
		averageRating=(criticoneRating+critictwoRating)/2;
	}
	
	public void calculateAverageRating(float criticoneRating, float critictwoRating, float criticthreeRating){
		averageRating=(criticoneRating+critictwoRating+criticthreeRating)/3;
	}
	
	public void calculateCatagory() {
		if (averageRating>8) {
			System.out.println("the category is A \n");
		}
		else if((averageRating>5) &&(averageRating<=8) ) {
			System.out.println("the category is B \n");
		}
		else if((averageRating>0) &&(averageRating<=5) ) {
			System.out.println("the category is C \n");
		}
	}
	
	public void display() {
		System.out.println("the player name is "+playerName);
		System.out.println("the player position is "+playerPosition);
		System.out.println("the average rating is "+averageRating);
	}
	
	
	
}
