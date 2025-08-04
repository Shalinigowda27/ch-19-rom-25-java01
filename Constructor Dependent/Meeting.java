class Meeting {

    String meetingTitle;
    String meetingTime;
    Invitee invitee;

    public void getMeetingDetails() {
        System.out.println("Meeting Details:");
        System.out.println("Meeting Title: " + meetingTitle);
        System.out.println("Meeting Time: " + meetingTime);

        this.invitee.getInviteeDetails();
    }
}