
public class EventRegistration {
	
	String name="";
	String nameOfEvent="";
	double registrationFee;
	
	EventRegistration(String name,String nameOfEvent){
		this.name=name;
		this.nameOfEvent=nameOfEvent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameOfEvent() {
		return nameOfEvent;
	}

	public void setNameOfEvent(String nameOfEvent) {
		this.nameOfEvent = nameOfEvent;
	}

	public double getRegistrationFee() {
		return registrationFee;
	}

	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	public void registerEvent () {
		if (nameOfEvent=="ShakeALeg") {
			setRegistrationFee(100);
			//System.out.println("100");
		}
		else if (nameOfEvent=="Sing&Win") {
			setRegistrationFee(150);
			//System.out.println("150");
		}
		else if (nameOfEvent=="Actathon") {
			setRegistrationFee(70);
			//System.out.println("70");
		}
		else if (nameOfEvent=="PlayAway") {
			setRegistrationFee(130);
			//System.out.println("130");
		}
	}
	
	

}
