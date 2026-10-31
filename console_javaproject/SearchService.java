package JavaProject;

import java.util.ArrayList;

public class SearchService {

    public void searchByName(ArrayList<Alumni> alumniList, String name) {

        boolean found = false;

        for (Alumni a : alumniList) {

            if (a.getName().equalsIgnoreCase(name)) {

                System.out.println("\nAlumni Found!");
                System.out.println("ID      : " + a.getAlumniId());
                System.out.println("Name    : " + a.getName());
                System.out.println("Email   : " + a.getEmail());
                System.out.println("Company : " + a.getCompany());

                found = true;
            }
        }

        if (!found) {
            System.out.println("Alumni not found.");
        }
    }


    public void searchByBatch(ArrayList<Alumni> alumniList, String batch) {

        boolean found = false;

        for (Alumni a : alumniList) {

            if (a.getBatch().equalsIgnoreCase(batch)) {

                System.out.println("\nAlumni Found!");
                System.out.println("ID      : " + a.getAlumniId());
                System.out.println("Name    : " + a.getName());
                System.out.println("Batch   : " + a.getBatch());
                System.out.println("Company : " + a.getCompany());

                found = true;
            }
        }

        if (!found) {
            System.out.println("No alumni found for this batch.");
        }
    }


    public void searchByCompany(ArrayList<Alumni> alumniList,
                                String company) {

        boolean found = false;

        for (Alumni a : alumniList) {

            if (a.getCompany().equalsIgnoreCase(company)) {

                System.out.println("\nAlumni Found!");
                System.out.println("ID      : " + a.getAlumniId());
                System.out.println("Name    : " + a.getName());
                System.out.println("Company : " + a.getCompany());

                found = true;
            }
        }

        if (!found) {
            System.out.println("No alumni found in this company.");
        }
    }
}