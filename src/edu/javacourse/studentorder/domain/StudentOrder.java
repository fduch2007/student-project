package edu.javacourse.studentorder.domain;

import java.time.LocalDate;

public class StudentOrder {
    private long studentOrderId;
    private Adult husband;
    private Adult wife;
    private Child child;
    private String MarriageCertificateId;
    private LocalDate MarriageDate;
    private String MarriageOffice;

    public LocalDate getMarriageDate(LocalDate of) {
        return MarriageDate;
    }

    public void setMarriageDate(LocalDate marriageDate) {
        MarriageDate = marriageDate;
    }

    public String getMarriageOffice(String отдел_загс) {
        return MarriageOffice;
    }

    public void setMarriageOffice(String marriageOffice) {
        MarriageOffice = marriageOffice;
    }

    public String getMarriageCertificateId() {
        return MarriageCertificateId;
    }

    public void setMarriageCertificateId(String marriageCertificateId) {
        MarriageCertificateId = marriageCertificateId;
    }

    public long getStudentOrderId() {
        return studentOrderId;
    }

    public void setStudentOrderId(long studentOrderId) {
        this.studentOrderId = studentOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}