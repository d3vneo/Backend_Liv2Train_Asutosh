package com.example.liv2train.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class TrainingCentre {
    @Id
    @Size(min = 12, max = 12, message = "Centre code should be of exactly 12 characters")
    private String centreCode;
    @NotEmpty
    @Size(max = 40, message = "Centre name should not have more than 40 characters")
    private String centreName;
    @OneToOne(optional = false, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "addressId")
    private Address address;
    private int studentCapacity;
    @ElementCollection(targetClass = String.class)
    private Set<String> coursesOffered;
    @JsonIgnore
    private LocalDateTime createdOn;
    @Email
    private String contactEmail;
    @NotEmpty
    @Pattern(regexp = "^\\d{10}$", message = "Phone number should have only 10 digits")
    private String contactPhone;

    public TrainingCentre() {
        createdOn = LocalDateTime.now();
    }

    public String getCentreCode() {
        return centreCode;
    }

    public void setCentreCode(String centreCode) {
        this.centreCode = centreCode;
    }

    public String getCentreName() {
        return centreName;
    }

    public void setCentreName(String centreName) {
        this.centreName = centreName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public Set<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(Set<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
