class Contact {

    String contactName;
    String contactNumber;
    boolean isFavorite;

    public void getContactDetails() {
	
        System.out.println("The Contact Details Are:");
        System.out.println("Contact name: " + contactName);
        System.out.println("Contact number: " + contactNumber);
        System.out.println("Is favorite: " + isFavorite);
    }
}
