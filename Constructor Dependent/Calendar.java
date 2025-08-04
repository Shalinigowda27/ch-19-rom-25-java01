class Calendar {

    String calendarName;
    String owner;
    boolean isShared;
    Meeting meeting;

    public void getCalendarDetails() {

        System.out.println("The Calendar Details Are:");
        System.out.println("Calendar Name: " + calendarName);
        System.out.println("Owner: " + owner);
        System.out.println("Is Shared: " + isShared);

        this.meeting.getMeetingDetails();
    }
}