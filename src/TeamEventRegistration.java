
public class TeamEventRegistration extends EventRegistration {
	
	int noOfParticipants;
	int teamNo;
	
	TeamEventRegistration(String name,String nameOfEvent, int noOfParticipant, int teamNo){
		super(name, nameOfEvent);
		setTeamNo(teamNo);
		setNoOfParticipants(noOfParticipant);
	}

	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	public void registerEvent() {
		if (nameOfEvent=="ShakeALeg") {
			setRegistrationFee(50*getNoOfParticipants());
			//System.out.println("100");
			System.out.println("Thank You "+getName()+" for your participation.Your registration fee is:"+ getRegistrationFee()+"\n"+ 
					"You are participant no: "+getTeamNo()+"\n");
		}
		else if (nameOfEvent=="Sing&Win") {
			setRegistrationFee(60*getNoOfParticipants());
			//System.out.println("150");
			System.out.println("Thank You "+getName()+" for your participation.Your registration fee is:"+ getRegistrationFee()+"\n"+ 
					"You are participant no: "+getTeamNo()+"\n");
		}
		else if (nameOfEvent=="Actathon") {
			setRegistrationFee(80*getNoOfParticipants());
			//System.out.println("70");
			System.out.println("Thank You "+getName()+" for your participation.Your registration fee is:"+ getRegistrationFee()+"\n"+ 
					"You are participant no: "+getTeamNo()+"\n");
		}
		else if (nameOfEvent=="PlayAway") {
			setRegistrationFee(100*getNoOfParticipants());
			//System.out.println("130");
			System.out.println("Thank You "+getName()+" for your participation.Your registration fee is:"+ getRegistrationFee()+"\n"+ 
					"You are participant no: "+getTeamNo()+"\n");
		}
		
		else {
			System.out.println("Hey "+getName()+", your choice is invalid \n");
		}
		
		
	}
	
}
