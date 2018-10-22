package com.jeoneboxmess.lalit_.jonebox.module;

public class CancelModule {

    String date,day,both,morning,eving;

    public CancelModule(String date, String day, String both, String morning, String eving) {
        this.date = date;
        this.day = day;
        this.both = both;
        this.morning = morning;
        this.eving = eving;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getBoth() {
        return both;
    }

    public void setBoth(String both) {
        this.both = both;
    }

    public String getMorning() {
        return morning;
    }

    public void setMorning(String morning) {
        this.morning = morning;
    }

    public String getEving() {
        return eving;
    }

    public void setEving(String eving) {
        this.eving = eving;
    }
}
