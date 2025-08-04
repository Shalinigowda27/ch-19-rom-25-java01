class Invitee {

    String inviteeName;
    String email;
    boolean hasAccepted;

    public void getInviteeDetails() {
	
        System.out.println("Invitee Details:");
        System.out.println("The Invitee Name: " + inviteeName);
        System.out.println("The Invitee Email: " + email);
        System.out.println("Has Accepted: " + hasAccepted);
    }
}