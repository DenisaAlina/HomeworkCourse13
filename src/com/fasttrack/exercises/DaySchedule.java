package com.fasttrack.exercises;

import java.util.List;

public class DaySchedule {

    private DaysOfTheWeek day;
    private List<String> activities;

    public DaySchedule(DaysOfTheWeek day, List<String> activities) {
        this.day = day;
        this.activities = activities;
    }

    public DaySchedule(){

    }

    public void setDay(DaysOfTheWeek day) {
        this.day = day;
    }

    public DaysOfTheWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }
}
