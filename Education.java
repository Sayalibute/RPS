package com.cdk.applicantdetails.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by butesa on 8/30/2016.
 */
@Entity
@Table(name = "EducationDetails")
public class Education {

    @Column(name = "qualification")
    String qualification;

    @Column(name = "college")
    String college;

    @Column(name = "university")
    String University;

    @Column(name = "score")
    int score;

    @Column(name = "year_of_passing")
    Date yearOfPassing;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Date getYearOfPassing() {
        return yearOfPassing;
    }

    public void setYearOfPassing(Date yearOfPassing) {
        this.yearOfPassing = yearOfPassing;
    }

    @Override
    public String toString() {
        return "Education{" +
                "qualification='" + qualification + '\'' +
                ", college='" + college + '\'' +
                ", University='" + University + '\'' +
                ", score=" + score +
                ", yearOfPassing=" + yearOfPassing +
                '}';
    }
}


