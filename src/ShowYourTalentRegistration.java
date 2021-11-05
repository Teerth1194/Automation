
public class ShowYourTalentRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleEventRegistration se1=new SingleEventRegistration("Jenny", "Sing&Win", 1);
		se1.registerEvent();
		
		SingleEventRegistration se2=new SingleEventRegistration("Hudson", "PlayAway", 2);
		se2.registerEvent();
		
		SingleEventRegistration se3=new SingleEventRegistration("Jimmy", "Actathon", 3);
		se3.registerEvent();
		
		TeamEventRegistration te1=new TeamEventRegistration("Aura","ShakeALeg",5,1);
		te1.registerEvent();
		
		TeamEventRegistration te2=new TeamEventRegistration("Aura","Sjdkjds",5,1);
		te2.registerEvent();
	}
}
