package com.fasttrack.exercises;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class DailyPlanner extends DaySchedule {
    private List<DaySchedule> dayScheduleList;

    public DailyPlanner(List<DaySchedule> dayScheduleList) {
        this.dayScheduleList = dayScheduleList;
    }

    public void addActivity(DaysOfTheWeek day, String activity){
            if(activity==null){
                throw new CustomUncheckedException("NoActivityException");
            }
            for(DaySchedule daySchedule : dayScheduleList){
                if((daySchedule.getDay()).equals(day)){
                        (daySchedule.getActivities()).add(activity);
                }
            }
    }

    public void removeActivity(DaysOfTheWeek day, String activity){
        if(activity==null){
            throw new CustomUncheckedException("NoActivityException");
        }

        for(DaySchedule daySchedule : dayScheduleList){
            if((daySchedule.getDay()).equals(day)){
                if(daySchedule.getActivities().contains(activity)){
                    daySchedule.getActivities().remove(activity);
                }else{
                    System.out.println(String.format("%s does not belong to %s list of activities!", activity, day));
                }
            }
        }
    }

    public List<String> getActivities(DaysOfTheWeek day){
        List<String> result = new LinkedList<>();
        for(DaySchedule daySchedule : dayScheduleList){
            if((daySchedule.getDay()).equals(day)){
                result= daySchedule.getActivities();
            }
        }
        return result;
    }

    public Map<DaysOfTheWeek, List<String>> endPlanning()  {
        Map<DaysOfTheWeek, List<String>> result =new HashMap<>();
        try{
            for(DaySchedule daySchedule : dayScheduleList){
                if((daySchedule.getActivities()).isEmpty()){
                    throw new CustomCheckedException("NoActivitiesForDayException");
                }
            }
        }catch (CustomCheckedException e){
            System.out.println("A day has no activities!");
        }finally{
            for(DaySchedule daySchedule : dayScheduleList){
                result.put(daySchedule.getDay(), daySchedule.getActivities());
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "DailyPlanner{" +
                "dayScheduleList=" + dayScheduleList +
                '}';
    }
}
