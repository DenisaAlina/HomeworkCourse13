package com.fasttrack.exercises;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CommandLine {
    public static void main(String[] args) {
        List<DaySchedule> dayScheduleList = new LinkedList<>();
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.MONDAY, new LinkedList<>(Arrays.asList("read", "clean the house", "going out", "jogging"))));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.TUESDAY, new LinkedList<>(Arrays.asList("do the laundry", "iron the clothes", "wash the car"))));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.WEDNESDAY, new LinkedList<>(Arrays.asList("go to school", "go shopping", "go out with Adina"))));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.THURSDAY, new LinkedList<>(Arrays.asList("go to school", "go to work"))));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.FIRDAY, new LinkedList<>(Arrays.asList("have breakfast", "exercise", "do homework"))));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.SATURDAY, new LinkedList<>(Arrays.asList("cook the lunch", "drive to Cluj", "go out with friends"))));
        dayScheduleList.add(new DaySchedule(DaysOfTheWeek.SUNDAY, new LinkedList<>(Arrays.asList("go for a morning walk", "exercise", "read", "have dinner with friends"))));
        DailyPlanner dailyPlanner = new DailyPlanner(dayScheduleList);
        Scanner scanner = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        String day = "";
        String activity = "";
        printMenu();
        int theChoosenNumber = scanner.nextInt();
        if (!(theChoosenNumber < 1 || theChoosenNumber > 4)) {
            while (theChoosenNumber != 4) {
                switch (theChoosenNumber) {
                    case 1:
                        System.out.println("Please enter the day: ");
                        day = String.format("%s", scanner.next());
                        System.out.println("Please enter the activity: ");
                        activity = String.format("%s", s.nextLine());
                        dailyPlanner.addActivity(DaysOfTheWeek.valueOf(day), activity);
                        System.out.println(dailyPlanner);
                        break;
                    case 2:
                        System.out.println("Please enter the day: ");
                        day = String.format("%s", scanner.next());
                        System.out.println("Please enter the activity: ");
                        activity = String.format("%s", s.nextLine());
                        dailyPlanner.removeActivity(DaysOfTheWeek.valueOf(day), activity);
                        System.out.println(dailyPlanner);
                        break;
                    case 3:
                        System.out.println("Please enter the day: ");
                        day = String.format("%s", scanner.next());
                        System.out.println(dailyPlanner.getActivities(DaysOfTheWeek.valueOf(day)));

                }
                printMenu();
                theChoosenNumber = scanner.nextInt();
            }
            if (theChoosenNumber == 4) {
                System.out.println(dailyPlanner.endPlanning());
            }
        } else {
            System.out.println("Your choice is unavailable. ");
        }
    }

    public static void printMenu() {
        System.out.println("Please choose an option: ");
        System.out.println("1) add an activity");
        System.out.println("2) remove an activity");
        System.out.println("3) list all activities");
        System.out.println("4) end planning");
    }
}
