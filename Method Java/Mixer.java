class Mixer {

       static boolean   isConnected;
	   static int       currentSpeed   = 2;
	   static int       maxSpeed       = 6;
	   static int       minSpeed       = 0;
	   
	   public static void onOrOff(){
	   
	     if(isConnected == false){
		    isConnected = true;
			System.out.println("The mixer is turned on ");
		 }
        else
           {
		    isConnected = false;
		    System.out.println("The mixer is turned off ");
		   }		
	   }
	   
	   //increaseSpeed
	   
	   public static void increaseSpeed(){
	   
	      System.out.println("IncreaseSpeed Started ");
		  if(isConnected == true){
		   
		   if(currentSpeed < maxSpeed){
		      currentSpeed = currentSpeed + 1;
			  System.out.println("The Current Speed is "+ currentSpeed);
		   }
		  else
           {
		      System.out.println("Max Speed Reached ");
		   }
         }		   
		  else
		  {
		     System.out.println("Plz mixer on madu ");
		  }	
	      System.out.println("IncreaseSpeed Ended ");
             		  
	   }
	   
	   //decreaseSpeed
	   
	   public static void decreaseSpeed(){
	   
           System.out.println("DecreaseSpeed Started ");	   
           if(isConnected == true){
		   
		   if(currentSpeed < minSpeed){
		      currentSpeed = currentSpeed - 1;
			  System.out.println("The Current Speed is "+ currentSpeed);		   
		   }
		   else 
		   {
		      System.out.println("Min Speed Reached ");
		   }
		 }
		 else
		 {
		     System.out.println("Plz mixer off madu ");
		 }
	   }	   
}