class WashingMachine  {

     static boolean isConnected;
     static int      currentVolume   = 1;
     static int      maxVolume       = 8;
	 static int      minVolume       = 0; 

     public static void onOrOff(){
	 
	     if(isConnected == false){
	       isConnected = true;	  
           System.out.println("The washingmachine is turned on "+ isConnected);		   
	   }  
	 else
	   {
	     isConnected = false;
		 System.out.println("The washingmachine is turned off "+ isConnected);
	   }	 	  	 
	}
        //increaseVolume

        public static void increaseVolume(){
		
		   System.out.println("IncreaseVolume Started ");
		    if(isConnected == true){
			
			if(currentVolume < maxVolume){
			   currentVolume = currentVolume + 1;
			   System.out.println("The Current Volume is  "+ currentVolume );
			}
		  else
		  {
		      System.out.println("Max Volume Reached ");
		  }	
		 }
		  else
		  {
		      System.out.println("Oii...washing machine on madu ");
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
			 System.out.println(" Oii... washing machine off madu ");
		 }
	 }	   

}