package com.fasttrack.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DaySchedule> dayScheduleList = new LinkedList<>();
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.MONDAY, new LinkedList<>(Arrays.asList("read", "clean the house", "going out", "jogging")) ));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.TUESDAY, new LinkedList<>(Arrays.asList("do the laundry", "iron the clothes", "wash the car"))));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.WEDNESDAY,new LinkedList<>( Arrays.asList("go to school", "go shopping", "go out with Adina"))));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.THURSDAY, new LinkedList<>(Arrays.asList("go to school", "go to work" ))));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.FIRDAY, new LinkedList<>(Arrays.asList("have breakfast", "exercise", "do homework"))));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.SATURDAY,new LinkedList<>( Arrays.asList("cook the lunch", "drive to Cluj", "go out with friends"))));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.SUNDAY, new LinkedList<>(Arrays.asList("go for a morning walk", "exercise", "read", "have dinner with friends"))));
        DailyPlanner dailyPlanner = new DailyPlanner(dayScheduleList);
        System.out.println(dailyPlanner);
        dailyPlanner.addActivity(DaysOfTheWeek.MONDAY, "do the laundry");
        System.out.println(dailyPlanner);
        dailyPlanner.removeActivity(DaysOfTheWeek.TUESDAY, "do the laundry");
        System.out.println(dailyPlanner);
        System.out.println(dailyPlanner.getActivities(DaysOfTheWeek.SUNDAY));
        System.out.println(dailyPlanner.endPlanning());

    }
}
