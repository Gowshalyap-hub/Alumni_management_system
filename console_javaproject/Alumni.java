package JavaProject;

import java.io.Serializable;

public class Alumni implements Serializable {

    private static final long serialVersionUID = 1L;

    private String alumniId;
    private String name;
    private String email;
    private String phone;
    private String linkedInId;
    private String address;
    private int passingYear;
    private String degree;
    private String company;
    private String batch;
    private String facebookId;

    public Alumni(String alumniId, String name, String email,
                  String phone, String linkedInId,
                  String address, int passingYear, String degree,
                  String company, String batch, String facebookId) {

        this.alumniId = alumniId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.linkedInId = linkedInId;
        this.address = address;
        this.passingYear = passingYear;
        this.degree = degree;
        this.company = company;
        this.batch = batch;
        this.facebookId = facebookId;
    }

    public String getAlumniId() {
        return alumniId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLinkedInId() {
        return linkedInId;
    }

    public String getAddress() {
        return address;
    }

    public int getPassingYear() {
        return passingYear;
    }

    public String getDegree() {
        return degree;
    }

    public String getCompany() {
        return company;
    }

    public String getBatch() {
        return batch;
    }

    public String getFacebookId() {
        return facebookId;
    }
}