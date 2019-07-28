package com.example.madridopen.model;

public class Recurrence {
    private float interval;
    private String days;
    private String frequency;


    // Getter Methods

    public float getInterval() {
        return interval;
    }

    public String getDays() {
        return days;
    }

    public String getFrequency() {
        return frequency;
    }

    // Setter Methods

    public void setInterval(float interval) {
        this.interval = interval;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
}