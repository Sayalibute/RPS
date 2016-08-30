package com.cdk.applicantdetails.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by butesa on 8/30/2016.
 */
@Entity
@Table(name = "Work_Experience")
public class WorkExperience {

    @Column(name = "company")
    String company;

    @Column(name = "to_date")
    Date to;

    @Column(name = "from_date")
    Date from;

    @Column(name = "role")
    String role;

    @Column(name = "reporting_manager")
    String reportingManager;

    @Column(name = "rm_contact_no")
    int reportingManagerContactNo;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getReportingManager() {
        return reportingManager;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }

    public int getReportingManagerContactNo() {
        return reportingManagerContactNo;
    }

    public void setReportingManagerContactNo(int reportingManagerContactNo) {
        this.reportingManagerContactNo = reportingManagerContactNo;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "company='" + company + '\'' +
                ", to=" + to +
                ", from=" + from +
                ", role='" + role + '\'' +
                ", reportingManager='" + reportingManager + '\'' +
                ", reportingManagerContactNo=" + reportingManagerContactNo +
                '}';
    }
}
