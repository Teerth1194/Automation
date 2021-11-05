
public class platerRatingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlayerRating pr1=new PlayerRating(1,"Beckham");
		pr1.calculateAverageRating(9, 9.9f);
		pr1.display();
		pr1.calculateCatagory();
		
		PlayerRating pr2=new PlayerRating(1,"Oscar");
		pr2.calculateAverageRating(1,1,1);
		pr2.display();
		pr2.calculateCatagory();

	}

}
