class BankAccountRunner   {

        public static void main(String args[]){
		
		    System.out.println("main started");	
			//methodName(credit)
             BankAccount.credit(2000.00);
               System.out.println("The current balance is  "+ BankAccount.balance);
			//methodName(debit) 
			 BankAccount.debit(2000.00);			 
			System.out.println("The current balance is  "+ BankAccount.balance); 
				
		    System.out.println("main ended");		

		}
}