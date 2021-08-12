package com.techelevator.projects.model;

import java.time.LocalDate;

public class Timesheet {
    private Long timesheetId;
    private Long employeeId;
    private Long projectId;
    private LocalDate dateWorked;
    private double hoursWorked;
    private boolean billable;
    private String description;

    public Timesheet() {}

    public Timesheet(Long timesheetId, Long employeeId, Long projectId, LocalDate dateWorked, double hoursWorked,
                     boolean billable, String description) {
        this.timesheetId = timesheetId;
        this.employeeId = employeeId;
        this.projectId = projectId;
        this.dateWorked = dateWorked;
        this.hoursWorked = hoursWorked;
        this.billable = billable;
        this.description = description;
    }

    public Long getTimesheetId() {
        return timesheetId;
    }

    public void setTimesheetId(Long timesheetId) {
        this.timesheetId = timesheetId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public LocalDate getDateWorked() {
        return dateWorked;
    }

    public void setDateWorked(LocalDate dateWorked) {
        this.dateWorked = dateWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public boolean isBillable() {
        return billable;
    }

    public void setBillable(boolean billable) {
        this.billable = billable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        // null check {
        if (o == null) {
            return false;
        }

        // type check and cast
        if (getClass() != o.getClass()) {
            return false;
        }

        Timesheet sheet2 = (Timesheet) o;

        if (!this.getTimesheetId().equals(sheet2.getTimesheetId())) {
            return false;
        } else if (!this.getEmployeeId().equals(sheet2.getEmployeeId())) {
            return false;
        } else if (!this.getProjectId().equals(sheet2.getProjectId())) {
            return false;
        } else if (!this.getDateWorked().equals(sheet2.getDateWorked())) {
            return false;
        } else if (!(this.getHoursWorked() == sheet2.getHoursWorked())) {
            return false;
        } else if (!(this.isBillable() == sheet2.isBillable())) {
            return false;
        }  else if (!this.getDescription().equals(sheet2.getDescription())) {
            return false;
        }

        return  true;
    }
}
