class Signal  {

	static String redLight          = "Stop";
	static String yellowLight       = "Get ready";
	static String greenLight        = "Move";
	static int    noOfSignalLights  = 3;
	
	boolean isSignalLightsGood = false;
	
	public static String getRedLight(){
		return redLight;
	}
	
	public static String getYellowLight(){
		return yellowLight;
	}
	
	public static String getGreenLight(){
		return greenLight;
	}
	
	public static int getNoOfSignalLights(){
		return noOfSignalLights;
	}
	
	public static boolean getSignalLightsGood(){
	boolean isSignalLightsGood = true;
	return isSignalLightsGood;
	}
	
public static void getInfo(){
	System.out.println("The red Light indicates "+ redLight);
	System.out.println("The yellow Light indicates "+ yellowLight);
	System.out.println("The green Light indicates "+ greenLight);
	System.out.println("The no Of Signal Lights indicates "+ noOfSignalLights);
}
}
	
