package p1;

public class ParticipantMainClass {
	
	public static void main(String[] args)
	{
	Participants obj= new Participants();
	
	obj.setName("Pankaj");
	obj.displayInfo();
	obj.turnOnCamera();
	obj.turnOnScreenShare();
	obj.turnOnMic();
	obj.displayInfo();
	obj.turnOffCamera();
	obj.turnOffScreenShare();
	obj.turnOffMic();
	obj.displayInfo();
	}
}
