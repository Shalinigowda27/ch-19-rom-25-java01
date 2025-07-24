class BillRunner {

	public static void main(String bill[]){
	System.out.println("Main Started");
	
		Bill ref = new Bill();
		ref.billId         = 1;
		ref.billAmountWithTax = 120.00;
		ref.planType       = "Montly Plan";
	    ref.billIssueDate  = "20-05-2025";
	    ref.paymentMode  = "PhonePay";
		ref.bankName       = "State Bank Of India";
		ref.transactionId  = "NBIN1234567890TXN";
	    ref.billDueDate    = "20-06-2025";
		ref.taxAmount      = 55.00;
		ref.mobileNumber   = 9876543897L;
		ref.emailId        = "abc123@gmail.com";
		ref.customerAddress = "Rajajinagar";
		ref.offers         = "5%";
		ref.latePaymentFee = 100;
	    ref.isTaxInclusive = true;
	    ref.isBillPaid     = true;
	    ref.isBillOverDue  = true;
		System.out.println("The first Bill is "+ ref.billId);
		System.out.println("The bill amount with tax is "+ ref.billAmountWithTax);
		System.out.println("The bill plan type is "+ ref.planType);
		System.out.println("The bill issue date is "+ ref.billIssueDate);
		System.out.println("The payment method is "+ ref.paymentMode);
		System.out.println("The bank name is "+ ref.bankName);
		System.out.println("The transaction id is "+ ref.transactionId);		
		System.out.println("The bill due date is "+ ref.billDueDate);
		System.out.println("The tax amount is "+ ref.taxAmount);
		System.out.println("The mobile number is "+ ref.mobileNumber);
		System.out.println("The email id is "+ ref.emailId);
		System.out.println("The customer address is "+ ref.customerAddress);
		System.out.println("The offers is "+ ref.offers);
		System.out.println("The late payment fee is "+ ref.latePaymentFee);
		System.out.println();
		
		
		Bill ref2 = new Bill();
		ref2.billId         = 3;
		ref2.billAmountWithTax = 599.00;
		ref2.planType       = "Montly Plan";
	    ref2.billIssueDate  = "10-06-2025";
	    ref2.paymentMode    = "GooglePay";
		ref2.bankName       = "Canara Bank";
		ref2.transactionId  = "SBIS1234567890TXN";
	    ref2.billDueDate    = "10-08-2025";
		ref2.taxAmount      = 69.00;
		ref2.mobileNumber   = 6786552897L;
		ref2.emailId        = "ravi19@gmail.com";
		ref2.customerAddress = "";
		ref2.offers         = "5%";
		ref2.latePaymentFee = 120;
	    ref2.isTaxInclusive = true;
	    ref2.isBillPaid     = false;
	    ref2.isBillOverDue  = true;
		System.out.println("The first Bill is "+ ref2.billId);
		System.out.println("The bill amount with tax is "+ ref2.billAmountWithTax);
		System.out.println("The bill plan type is "+ ref2.planType);
		System.out.println("The bill issue date is "+ ref2.billIssueDate);
		System.out.println("The payment method is "+ ref2.paymentMode);
		System.out.println("The bank name is "+ ref2.bankName);
		System.out.println("The transaction id is "+ ref2.transactionId);		
		System.out.println("The bill due date is "+ ref2.billDueDate);
		System.out.println("The tax amount is "+ ref2.taxAmount);
		System.out.println("The mobile number is "+ ref2.mobileNumber);
		System.out.println("The email id is "+ ref2.emailId);
		System.out.println("The customer address is "+ ref2.customerAddress);
		System.out.println("The offers is "+ ref2.offers);
		System.out.println("The late payment fee is "+ ref2.latePaymentFee);
		System.out.println();	
		
		
		Bill ref3 = new Bill();
		ref3.billId         = 3;
		ref3.billAmountWithTax = 699.00;
		ref3.planType       = "Montly Plan";
	    ref3.billIssueDate  = "01-04-2025";
	    ref3.paymentMode    = "PhonePay";
		ref3.bankName       = "State Bank Of India";
		ref3.transactionId  = "NBIN1234567890TXN";
	    ref3.billDueDate    = "01-07-2025";
		ref3.taxAmount      = 60.00;
		ref3.mobileNumber   = 8986543897L;
		ref3.emailId        = "xyz123@gmail.com";
		ref3.customerAddress = "";
		ref3.offers         = "5%";
		ref3.latePaymentFee = 100;
	    ref3.isTaxInclusive = true;
	    ref3.isBillPaid     = false;
	    ref3.isBillOverDue  = true;
		System.out.println("The first Bill is "+ ref3.billId);
		System.out.println("The bill amount with tax is "+ ref3.billAmountWithTax);
		System.out.println("The bill plan type is "+ ref3.planType);
		System.out.println("The bill issue date is "+ ref3.billIssueDate);
		System.out.println("The payment method is "+ ref3.paymentMode);
		System.out.println("The bank name is "+ ref3.bankName);
		System.out.println("The transaction id is "+ ref3.transactionId);		
		System.out.println("The bill due date is "+ ref3.billDueDate);
		System.out.println("The tax amount is "+ ref3.taxAmount);
		System.out.println("The mobile number is "+ ref3.mobileNumber);
		System.out.println("The email id is "+ ref3.emailId);
		System.out.println("The customer address is "+ ref3.customerAddress);
		System.out.println("The offers is "+ ref3.offers);
		System.out.println("The late payment fee is "+ ref3.latePaymentFee);
		System.out.println();				
		

	
	System.out.println("Main Started");

	}
} 