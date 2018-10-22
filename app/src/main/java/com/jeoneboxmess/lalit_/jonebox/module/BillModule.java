package com.jeoneboxmess.lalit_.jonebox.module;

public class BillModule {

    String date,time,ammount;

    public BillModule(String date, String time, String ammount) {
        this.date = date;
        this.time = time;
        this.ammount = ammount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }
}
