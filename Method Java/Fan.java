class Fan  {

     static boolean  isConnected;
     static int      currentVolume   = 2;
     static int      maxVolume       = 9;
	 static int      minVolume       = 0; 

     public static void onOrOff(){
	 
	     if(isConnected == false){
	       isConnected = true;	  
           System.out.println("The Fan is turned on "+ isConnected);		   
	   }  
	 else
	   {
	     isConnected = false;
		 System.out.println("The Fan is turned off "+ isConnected);
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
		      System.out.println("Hey... fan on madu ");
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
			 System.out.println("Hey... fan off madu ");
		 }
	 }	   

}