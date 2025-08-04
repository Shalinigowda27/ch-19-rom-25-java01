class MobileRunner {

    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        PhoneBook phoneBook = new PhoneBook();
        Contact contact = new Contact();

        mobile.mobileBrand = "Vivo";
        mobile.mobileModel = "V 25";
        mobile.isSmartphone = true;
        mobile.phoneBook = phoneBook;

        phoneBook.ownerName = "Shalini";
        phoneBook.totalContacts = 150;
        phoneBook.isSyncedToCloud = true;
        phoneBook.contact = contact;

        contact.contactName = "Vilas";
        contact.contactNumber = "9876543210";
        contact.isFavorite = true;

        mobile.getMobileDetails();
    }
}
