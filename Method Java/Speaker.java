class Speaker {
     
	 static boolean isConnected;
	 static int     currentVolume   = 0;
     static int     maxVolume       = 7;
	 static int     minVolume; 
    
	//onOrOff 
	//increaseVolume
	//decreaseVolume
	
	 public static void onOrOff(){
	 
	   if(isConnected == false){
	       isConnected = true;	  
           System.out.println("The Speaker is turned on "+ isConnected);		   
	   }  
	 else
	   {
	     isConnected = false;
		 System.out.println("The Speaker is turned off "+ isConnected);
	   }	 	 
    }
	
	//increaseVolume 
	public static void increaseVolume(){
		
		System.out.println("IncreaseVolume started");
	if(isConnected == true){
		
		if(currentVolume < maxVolume){
			 currentVolume = currentVolume + 1;
			 System.out.println("The currentVolume is  "+ currentVolume);
		}
			else
			{
				System.out.println("Max Volume Reached");
			}
	}
	else 
	{
		System.out.println("Gubee.... speaker on madu");
	}
  }
  
   //decreaseVolume
     public static void decreaseVolume(){
		 
		 System.out.println("DecreaseVolume Started");
		 if(isConnected == true){
			 
			 if(currentVolume > minVolume){
				 currentVolume = currentVolume - 1;
				 System.out.println("The currentVolume is  "+ currentVolume);
			 }
		    else
			{
				System.out.println("Min Volume Reached");
			}
		 }
		 else 
		 {
			 System.out.println("Gubee.... speaker off madu");
		 }
	 }
}