
public class SingleEventRegistration extends EventRegistration {

	int participantNo;
	
	SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
		super(name, nameOfEvent);
		// TODO Auto-generated constructor stub
		setParticipantNo(participantNo);
	}

	public int getParticipantNo() {
		return participantNo;
	}

	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	
	@Override
	public void registerEvent() {
		// TODO Auto-generated method stub
		//super.registerEvent();
		super.registerEvent();
		if ((nameOfEvent=="ShakeALeg") ||(nameOfEvent=="Sing&Win")||(nameOfEvent=="PlayAway")) {
			registrationFee=super.getRegistrationFee();
			System.out.println("Thank You "+ getName()+ " for your participation.Your registration fee is:"+registrationFee + "\n"+
					"You are participant no: "+getParticipantNo()+"\n");
		}
		else {
			System.out.println("Hey "+getName()+", your choice "+getNameOfEvent() +" is not allowed for single event registation"+"\n");
		}
		
		
	}
}
