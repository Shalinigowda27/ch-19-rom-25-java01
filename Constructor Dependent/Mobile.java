class Mobile {

    String mobileBrand;
    String mobileModel;
    boolean isSmartphone;
    PhoneBook phoneBook;

    public void getMobileDetails() {
	
        System.out.println("The Mobile Details Are:");
        System.out.println("The mobile brand is " + mobileBrand);
        System.out.println("The mobile model is " + mobileModel);
        System.out.println("Is smartphone: " + isSmartphone);

        this.phoneBook.getPhoneBookDetails();
    }
}
