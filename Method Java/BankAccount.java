class BankAccount  {

  static double balance = 5000.00;
  
     public static void main(String []args){
	    System.out.println("main started");	  
	  //methodname();
	 
	 debit(2000.00);
	 credit(2000.00);	 
	 
	    System.out.println("The current balance is  "+ balance);	 
	    System.out.println("main ended");
	 }
    //Datatype variableName-parameter
   //<access-specifier> returntype methodName(parameter)

      public static void debit(double amount){
	     System.out.println("debit started");
		 boolean amountcheck = amount <= 2000.0;
		 if(amountcheck){
	     balance = balance-amount;
		 }
		else {
			System.out.println("No funds available ");
		} 
		 System.out.println("debit ended");	  
	  }

      public static void  credit(double amount){
	     System.out.println("credit started");
		 boolean amountcheck = amount > 0.00;
		 if(amountcheck){
	     balance = balance+amount;
		 }
		else {
			System.out.println("The amount should be greater than zero ");
		}
		 System.out.println("credit ended");	  
	  
	     return;
	  }

}