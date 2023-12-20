package org.example.list;

public class CalculateYearsUser {
    public static void main(String args[]){
       int years, days, months;

       years = 47;
       days = 365 * years;
       months = 12 * years;

       System.out.println("A sua idade é " + years);
       System.out.println("Você tem " + days + " dias vividos.");
       System.out.println("Você tem " + months + " meses vividos.");
    }
}
