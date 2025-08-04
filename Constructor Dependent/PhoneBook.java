class PhoneBook {

    String ownerName;
    int totalContacts;
    boolean isSyncedToCloud;
    Contact contact;

    public void getPhoneBookDetails() {
	
        System.out.println("The PhoneBook Details Are:");
        System.out.println("Owner name: " + ownerName);
        System.out.println("Total contacts: " + totalContacts);
        System.out.println("Is synced to cloud: " + isSyncedToCloud);

        this.contact.getContactDetails();
    }
}
