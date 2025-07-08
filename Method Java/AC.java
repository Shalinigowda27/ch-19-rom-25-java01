class AC  {

    static boolean isConnected;
	static int     currentTemperature   = 0;
	static int     maxTemperature       = 8;
	static int     minTemperature;
	
	public static void onOrOff(){
	
	if(isConnected == false){
	   isConnected = true;
	   System.out.println("The AC is turned on "+ isConnected);	
	}
	else 
	{
	   isConnected = false;
	   System.out.println("The AC is turned off "+ isConnected);
	}
  }
  
  //increaseTemperature
  
  public static void increaseTemperature(){
  
     System.out.println("IncreaseTemperature Started ");
	 if(isConnected == true){
	 
	 if(currentTemperature < maxTemperature){
	    currentTemperature = currentTemperature + 1;
		System.out.println("The currentTemperature is "+ currentTemperature);
	 }
    else
	{
	   System.out.println("Max Temperature Reached ");
	}
  }
   else
   {
      System.out.println("AC Temperature on madu");
   }
  }
  
  //decreaseTemperature
  
  public static void decreaseTemperature(){
  
     System.out.println("DecreaseTemperature Started");
	 if(isConnected == true){
	 
	 if(currentTemperature < minTemperature){
	    currentTemperature = currentTemperature - 1;
		System.out.println("The currentTemperature is "+ currentTemperature);
	 }
	 else
	 {
	    System.out.println("Min Temperature Reached ");
	 }
    }
	else
	{
	   System.out.println("AC Temperature off madu");
	}
  }
  
  
}