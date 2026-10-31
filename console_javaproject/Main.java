package JavaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    // Lists for storing objects
    static ArrayList<Alumni> alumniList = new ArrayList<>();
    static ArrayList<Event> eventList = new ArrayList<>();
    static ArrayList<Engagement> engagementList = new ArrayList<>();
    static ArrayList<Message> messageList = new ArrayList<>();
    static ArrayList<User> userList = new ArrayList<>();
    static ArrayList<Report> reportList = new ArrayList<>();

    // Service classes
    static DisplayService display = new DisplayService();
    static SearchService search = new SearchService();

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println();
            System.out.println("==========================================");
            System.out.println("       ALUMNI MANAGEMENT SYSTEM");
            System.out.println("==========================================");

            System.out.println("1. Alumni Management");
            System.out.println("2. Event Management");
            System.out.println("3. Engagement Management");
            System.out.println("4. Message Management");
            System.out.println("5. User Management");
            System.out.println("6. Reports");
            System.out.println("7. Search Alumni");
            System.out.println("8. Display All Data");
            System.out.println("9. Save Data");
            System.out.println("10. Load Data");
            System.out.println("11. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    alumniManagement();
                    break;

                case 2:
                    eventManagement();
                    break;

                case 3:
                    engagementManagement();
                    break;

                case 4:
                    messageManagement();
                    break;

                case 5:
                    userManagement();
                    break;

                case 6:
                    reportManagement();
                    break;

                case 7:
                    searchAlumni();
                    break;

                case 8:
                    displayAllData();
                    break;

                case 9:
                    saveAllData();
                    break;

                case 10:
                    loadAllData();
                    break;

                case 11:
                    System.out.println("\nThank you for using Alumni Management System!");
                    break;

                default:
                    System.out.println("\nInvalid choice!");
            }

        } while (choice != 11);

        sc.close();
    }


    // =========================================================
    // ALUMNI MANAGEMENT
    // =========================================================

    public static void alumniManagement() {

        System.out.println();
        System.out.println("========== ALUMNI MANAGEMENT ==========");

        System.out.println("1. Add Alumni");
        System.out.println("2. Display Alumni");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Alumni ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Phone: ");
            String phone = sc.nextLine();

            System.out.print("Enter LinkedIn ID: ");
            String linkedin = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Passing Year: ");
            int year = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Degree: ");
            String degree = sc.nextLine();

            System.out.print("Enter Company: ");
            String company = sc.nextLine();

            System.out.print("Enter Batch: ");
            String batch = sc.nextLine();

            System.out.print("Enter Facebook ID: ");
            String facebook = sc.nextLine();

            // Creating Alumni object
            Alumni alumni = new Alumni(
                    id,
                    name,
                    email,
                    phone,
                    linkedin,
                    address,
                    year,
                    degree,
                    company,
                    batch,
                    facebook
            );

            // Adding object to ArrayList
            alumniList.add(alumni);

            System.out.println("\nAlumni added successfully!");

        } else if (choice == 2) {

            display.displayAlumniList(alumniList);

        } else {

            System.out.println("Invalid choice!");
        }
    }


    // =========================================================
    // EVENT MANAGEMENT
    // =========================================================

    public static void eventManagement() {

        System.out.println();
        System.out.println("========== EVENT MANAGEMENT ==========");

        System.out.println("1. Add Event");
        System.out.println("2. Display Events");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Event ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Event Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Description: ");
            String description = sc.nextLine();

            System.out.print("Enter Date: ");
            String date = sc.nextLine();

            System.out.print("Enter Location: ");
            String location = sc.nextLine();

            System.out.print("Enter Organizer: ");
            String organizer = sc.nextLine();

            // Creating Event object
            Event event = new Event(
                    id,
                    name,
                    description,
                    date,
                    location,
                    organizer
            );

            eventList.add(event);

            System.out.println("\nEvent added successfully!");

        } else if (choice == 2) {

            display.displayEventList(eventList);

        } else {

            System.out.println("Invalid choice!");
        }
    }


    // =========================================================
    // ENGAGEMENT MANAGEMENT
    // =========================================================

    public static void engagementManagement() {

        System.out.println();
        System.out.println("========== ENGAGEMENT MANAGEMENT ==========");

        System.out.println("1. Add Engagement");
        System.out.println("2. Display Engagement");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Engagement ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Alumni ID: ");
            String alumniId = sc.nextLine();

            System.out.print("Enter Engagement Type: ");
            String type = sc.nextLine();

            System.out.print("Enter Description: ");
            String description = sc.nextLine();

            System.out.print("Enter Date: ");
            String date = sc.nextLine();

            System.out.print("Enter Location: ");
            String location = sc.nextLine();

            System.out.print("Enter Status: ");
            String status = sc.nextLine();

            // Creating Engagement object
            Engagement engagement = new Engagement(
                    id,
                    alumniId,
                    type,
                    description,
                    date,
                    location,
                    status
            );

            engagementList.add(engagement);

            System.out.println("\nEngagement added successfully!");

        } else if (choice == 2) {

            display.displayEngagementList(engagementList);

        } else {

            System.out.println("Invalid choice!");
        }
    }


    // =========================================================
    // MESSAGE MANAGEMENT
    // =========================================================

    public static void messageManagement() {

        System.out.println();
        System.out.println("========== MESSAGE MANAGEMENT ==========");

        System.out.println("1. Add Message");
        System.out.println("2. Display Messages");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Message ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Sender ID: ");
            String sender = sc.nextLine();

            System.out.print("Enter Receiver ID: ");
            String receiver = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Message Content: ");
            String content = sc.nextLine();

            System.out.print("Enter Date: ");
            String date = sc.nextLine();

            // Creating Message object
            Message message = new Message(
                    id,
                    sender,
                    receiver,
                    subject,
                    content,
                    date
            );

            messageList.add(message);

            System.out.println("\nMessage added successfully!");

        } else if (choice == 2) {

            display.displayMessageList(messageList);

        } else {

            System.out.println("Invalid choice!");
        }
    }


    // =========================================================
    // USER MANAGEMENT
    // =========================================================

    public static void userManagement() {

        System.out.println();
        System.out.println("========== USER MANAGEMENT ==========");

        System.out.println("1. Add User");
        System.out.println("2. Display Users");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter User ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Username: ");
            String username = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            System.out.print("Enter Role: ");
            String role = sc.nextLine();

            // Creating User object
            User user = new User(
                    id,
                    username,
                    password,
                    role
            );

            userList.add(user);

            System.out.println("\nUser added successfully!");

        } else if (choice == 2) {

            display.displayUserList(userList);

        } else {

            System.out.println("Invalid choice!");
        }
    }


    // =========================================================
    // REPORT MANAGEMENT
    // =========================================================

    public static void reportManagement() {

        System.out.println();
        System.out.println("========== REPORT MANAGEMENT ==========");

        System.out.println("1. Add Report");
        System.out.println("2. Display Reports");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Report ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Report Type: ");
            String type = sc.nextLine();

            System.out.print("Enter Date: ");
            String date = sc.nextLine();

            System.out.print("Enter Report Details: ");
            String details = sc.nextLine();

            // Creating Report object
            Report report = new Report(
                    id,
                    type,
                    date,
                    details
            );

            reportList.add(report);

            System.out.println("\nReport added successfully!");

        } else if (choice == 2) {

            display.displayReportList(reportList);

        } else {

            System.out.println("Invalid choice!");
        }
    }


    // =========================================================
    // SEARCH ALUMNI
    // =========================================================

    public static void searchAlumni() {

        System.out.println();
        System.out.println("========== SEARCH ALUMNI ==========");

        System.out.println("1. Search by Name");
        System.out.println("2. Search by Batch");
        System.out.println("3. Search by Company");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            search.searchByName(alumniList, name);

        } else if (choice == 2) {

            System.out.print("Enter Batch: ");
            String batch = sc.nextLine();

            search.searchByBatch(alumniList, batch);

        } else if (choice == 3) {

            System.out.print("Enter Company: ");
            String company = sc.nextLine();

            search.searchByCompany(alumniList, company);

        } else {

            System.out.println("Invalid choice!");
        }
    }


    // =========================================================
    // DISPLAY ALL DATA
    // =========================================================

    public static void displayAllData() {

        System.out.println();
        System.out.println("==========================================");
        System.out.println("             ALL SYSTEM DATA");
        System.out.println("==========================================");

        display.displayAlumniList(alumniList);

        display.displayEventList(eventList);

        display.displayEngagementList(engagementList);

        display.displayMessageList(messageList);

        display.displayUserList(userList);

        display.displayReportList(reportList);
    }


    // =========================================================
    // SAVE ALL DATA
    // =========================================================

    public static void saveAllData() {

        System.out.println();
        System.out.println("========== SAVING DATA ==========");

        FileUtil.saveData(alumniList, "alumni.dat");

        FileUtil.saveData(eventList, "events.dat");

        FileUtil.saveData(engagementList, "engagement.dat");

        FileUtil.saveData(messageList, "messages.dat");

        FileUtil.saveData(userList, "users.dat");

        FileUtil.saveData(reportList, "reports.dat");

        System.out.println("All data saved successfully!");
    }


    // =========================================================
    // LOAD ALL DATA
    // =========================================================

    @SuppressWarnings("unchecked")
    public static void loadAllData() {

        System.out.println();
        System.out.println("========== LOADING DATA ==========");

        Object alumniData = FileUtil.loadData("alumni.dat");

        if (alumniData != null) {
            alumniList = (ArrayList<Alumni>) alumniData;
        }


        Object eventData = FileUtil.loadData("events.dat");

        if (eventData != null) {
            eventList = (ArrayList<Event>) eventData;
        }


        Object engagementData = FileUtil.loadData("engagement.dat");

        if (engagementData != null) {
            engagementList = (ArrayList<Engagement>) engagementData;
        }


        Object messageData = FileUtil.loadData("messages.dat");

        if (messageData != null) {
            messageList = (ArrayList<Message>) messageData;
        }


        Object userData = FileUtil.loadData("users.dat");

        if (userData != null) {
            userList = (ArrayList<User>) userData;
        }


        Object reportData = FileUtil.loadData("reports.dat");

        if (reportData != null) {
            reportList = (ArrayList<Report>) reportData;
        }

        System.out.println("All available data loaded successfully!");
    }
}