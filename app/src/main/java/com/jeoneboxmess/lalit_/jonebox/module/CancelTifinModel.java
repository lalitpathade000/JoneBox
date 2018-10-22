package com.jeoneboxmess.lalit_.jonebox.module;

public class CancelTifinModel {


    String day;
    String month;
    String year;
    String days;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public CancelTifinModel(String day, String month, String year, String days) {

        this.day = day;
        this.month = month;
        this.year = year;
        this.days = days;
    }
}
