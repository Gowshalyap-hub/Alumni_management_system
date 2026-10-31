package JavaProject;

import java.util.ArrayList;

public class DisplayService {

    // =========================================================
    // DISPLAY ALUMNI
    // =========================================================

    public void displayAlumniList(ArrayList<Alumni> alumniList) {

        System.out.println();
        System.out.println("========== ALUMNI DETAILS ==========");

        if (alumniList.isEmpty()) {
            System.out.println("No alumni records found.");
            return;
        }

        for (Alumni a : alumniList) {

            System.out.println("------------------------------------");
            System.out.println("Alumni ID    : " + a.getAlumniId());
            System.out.println("Name         : " + a.getName());
            System.out.println("Email        : " + a.getEmail());
            System.out.println("Phone        : " + a.getPhone());
            System.out.println("LinkedIn ID  : " + a.getLinkedInId());
            System.out.println("Address      : " + a.getAddress());
            System.out.println("Passing Year : " + a.getPassingYear());
            System.out.println("Degree       : " + a.getDegree());
            System.out.println("Company      : " + a.getCompany());
            System.out.println("Batch        : " + a.getBatch());
            System.out.println("Facebook ID  : " + a.getFacebookId());
        }
    }


    // =========================================================
    // DISPLAY EVENTS
    // =========================================================

    public void displayEventList(ArrayList<Event> eventList) {

        System.out.println();
        System.out.println("========== EVENT DETAILS ==========");

        if (eventList.isEmpty()) {
            System.out.println("No event records found.");
            return;
        }

        for (Event e : eventList) {

            System.out.println("------------------------------------");
            System.out.println("Event ID    : " + e.getEventId());
            System.out.println("Event Name  : " + e.getEventName());
            System.out.println("Description : " + e.getDescription());
            System.out.println("Date        : " + e.getDate());
            System.out.println("Location    : " + e.getLocation());
            System.out.println("Organizer   : " + e.getOrganizer());
        }
    }


    // =========================================================
    // DISPLAY ENGAGEMENT
    // =========================================================

    public void displayEngagementList(
            ArrayList<Engagement> engagementList) {

        System.out.println();
        System.out.println("========== ENGAGEMENT DETAILS ==========");

        if (engagementList.isEmpty()) {
            System.out.println("No engagement records found.");
            return;
        }

        for (Engagement e : engagementList) {

            System.out.println("------------------------------------");
            System.out.println("Engagement ID : " + e.getEngagementId());
            System.out.println("Alumni ID     : " + e.getAlumniId());
            System.out.println("Type          : " + e.getEngagementType());
            System.out.println("Description   : " + e.getDescription());
            System.out.println("Date          : " + e.getDate());
            System.out.println("Location      : " + e.getLocation());
            System.out.println("Status        : " + e.getStatus());
        }
    }


    // =========================================================
    // DISPLAY MESSAGES
    // =========================================================

    public void displayMessageList(ArrayList<Message> messageList) {

        System.out.println();
        System.out.println("========== MESSAGE DETAILS ==========");

        if (messageList.isEmpty()) {
            System.out.println("No message records found.");
            return;
        }

        for (Message m : messageList) {

            System.out.println("------------------------------------");
            System.out.println("Message ID  : " + m.getMessageId());
            System.out.println("Sender ID   : " + m.getSenderId());
            System.out.println("Receiver ID : " + m.getReceiverId());
            System.out.println("Subject     : " + m.getSubject());
            System.out.println("Message     : " + m.getMessageContent());
            System.out.println("Date        : " + m.getDate());
        }
    }


    // =========================================================
    // DISPLAY USERS
    // =========================================================

    public void displayUserList(ArrayList<User> userList) {

        System.out.println();
        System.out.println("========== USER DETAILS ==========");

        if (userList.isEmpty()) {
            System.out.println("No user records found.");
            return;
        }

        for (User u : userList) {

            System.out.println("------------------------------------");
            System.out.println("User ID  : " + u.getUserId());
            System.out.println("Username : " + u.getUsername());
            System.out.println("Password : " + u.getPassword());
            System.out.println("Role     : " + u.getRole());
        }
    }


    // =========================================================
    // DISPLAY REPORTS
    // =========================================================

    public void displayReportList(ArrayList<Report> reportList) {

        System.out.println();
        System.out.println("========== REPORT DETAILS ==========");

        if (reportList.isEmpty()) {
            System.out.println("No report records found.");
            return;
        }

        for (Report r : reportList) {

            System.out.println("------------------------------------");
            System.out.println("Report ID      : " + r.getReportId());
            System.out.println("Report Type    : " + r.getReportType());
            System.out.println("Date           : " + r.getDate());
            System.out.println("Report Details : " + r.getReportDetails());
        }
    }
}