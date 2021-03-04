package p1;

public class Participants {

	private String name;
	private boolean camera=false;
	private boolean screen_share=false;
	private boolean mic=false;
	
	public void setName(String participantName)
	{
		name=participantName;
	}
	public void turnOnCamera()
	{
		camera=true;
	}
	public void turnOffCamera()
	{
		camera=false;
	}
	public void turnOnScreenShare()
	{
		screen_share=true;
	}
	public void turnOffScreenShare()
	{
		screen_share=false;
	}
	public void turnOnMic()
	{
		mic=true;
	}
	public void turnOffMic()
	{
		mic=false;
	}
	public void displayInfo()
	{
		System.out.println("Name:"+name);
		System.out.println("Camera:"+camera);
		System.out.println("Screen Share:"+screen_share);
		System.out.println("Mic:"+mic);
		
		
	}
	
	
}
