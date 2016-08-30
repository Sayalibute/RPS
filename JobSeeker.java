package com.cdk.applicantdetails.domain;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by butesa on 8/30/2016.
 */
@Entity
@Table(name ="JobSeeker")
public class JobSeeker {

    @Id
    @GeneratedValue
    @Column(name = "job_seeker_id")
    int jobSeekerId;

    @Column(name = "full_name ")
    String fullName;

    @Column(name = "email_id")
    String emailId;

    @Column(name = "password")
    String password;

    @Column(name="contact")
    int contactNo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "job_seeker_id", unique = true)
    private Set<Address> addresses;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "job_seeker_id", unique = true)
    private Set<Education> educations;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "job_seeker_id", unique = true)
    private Set<WorkExperience> workExperiences;



    public int getJobSeekerId() {
        return jobSeekerId;
    }

    public void setJobSeekerId(int jobSeekerId) {
        this.jobSeekerId = jobSeekerId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<Education> getEducations() {
        return educations;
    }

    public void setEducations(Set<Education> educations) {
        this.educations = educations;
    }

    public Set<WorkExperience> getWorkExperiences() {
        return workExperiences;
    }

    public void setWorkExperiences(Set<WorkExperience> workExperiences) {
        this.workExperiences = workExperiences;
    }

    @Override
    public String toString() {
        return "JobSeeker{" +
                "jobSeekerId=" + jobSeekerId +
                ", fullName='" + fullName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", contactNo=" + contactNo +
                ", addresses=" + addresses +
                ", educations=" + educations +
                ", workExperiences=" + workExperiences +
                '}';
    }
}

