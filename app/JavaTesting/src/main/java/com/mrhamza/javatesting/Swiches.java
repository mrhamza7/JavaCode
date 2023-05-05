package com.mrhamza.javatesting;

public class Swiches {
    public static void main(String[] args) {
        String day = "Sunday";
        switch(day)
        {
            case "Sunday":System.out.println("It is Sunday(Holiday)");
                break;
            case "Monday":System.out.println("It is Monday");
                break;
            case "Tuesday":System.out.println("It is Tuesday ");
                break;
            case "Wednesday":System.out.println("It is Wednesday");
                break;
            case "Thursday":System.out.println("It is Thursday ");
                break;
            case "Friday":System.out.println("It is Friday");
                break;
            case "Saturday":System.out.println("It is Saturday");
                break;

            default :System.out.println("It is not a day! ");
        }
    }
}
