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
            for(DaySchedule daySchedule : dayScheduleList){
                if((daySchedule.getDay()).equals(day)){
                    if(!(activity==null)){
                        (daySchedule.getActivities()).add(activity);
                    }else{
                        throw new CustomUncheckedException("No Activity Exception");
                    }
                }
            }
    }

    public void removeActivity(DaysOfTheWeek day, String activity){
        for(DaySchedule daySchedule : dayScheduleList){
            if((daySchedule.getDay()).equals(day)){
                if(!(activity==null)){
                    daySchedule.getActivities().remove(activity);
                }else{
                    throw new CustomUncheckedException("NoActivityException");
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
