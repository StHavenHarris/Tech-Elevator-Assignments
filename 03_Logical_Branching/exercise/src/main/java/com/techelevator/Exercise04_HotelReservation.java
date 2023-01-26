package com.techelevator;

public class Exercise04_HotelReservation {

 /*
    Innovator's Inn is a new hotel chain with two simple rates:
        $99.99 per night for stays of 1 or 2 nights
        $89.99 per night for stays of 3 nights or more
    The problems below ask you to implement the logic for determining a guest's total amount for their stay.
     */

            // You can use these constants in your solutions.
            private final double DAILY_RATE = 99.99;
            private final double DISCOUNT_RATE = 89.99;

    /*
    Using the rates from above, implement the logic to determine the total amount based on
    the number of nights a guest stays.

    Examples:
    calculateStayTotal(1) ➔ 99.99
    calculateStayTotal(2) ➔ 199.98
    calculateStayTotal(3) ➔ 269.97
     */
            public double calculateStayTotal(int numberOfNights) {
            if (numberOfNights <= 2){
                double totalRate = numberOfNights * DAILY_RATE;
                return totalRate;

            }
            else if (numberOfNights >= 3){
                double totalRate2 = numberOfNights * DISCOUNT_RATE;
                return totalRate2;
            }


            return 0;
        }

    /*
    The owners of Innovator's Inn realized weekends are more popular than weekdays. Because of this, they've raised
    the rate for weekend night rates to $99.99 regardless of how many nights a guest is staying.
    If a guest is staying 3 or more nights, the weekday rate is still $89.99 per night. Otherwise, the $99.99 rate applies.
    Implement the logic to return the total amount of the stay based on the total number of nights and the number of weekend nights.
    NOTE: the numOfTotalNights parameter includes weekend nights.

    Examples:
    calculateStayTotal(2, 0) ➔ 199.98
    calculateStayTotal(2, 1) ➔ 199.98
    calculateStayTotal(3, 0) ➔ 269.97
    calculateStayTotal(3, 1) ➔ 279.97
    calculateStayTotal(3, 2) ➔ 289.97
     */
            public double calculateStayTotal(int numOfTotalNights, int numOfWeekendNights) {
            if (numOfTotalNights < 3 || numOfWeekendNights < 0){
                double totaleRate3 = numOfTotalNights * DAILY_RATE;
                return totaleRate3;

            }
            else if(numOfTotalNights >= 3 && numOfWeekendNights >= 0) {
                double discountNights = numOfTotalNights - numOfWeekendNights;
                double totalRate5 = discountNights * DISCOUNT_RATE;
                double totalRate6 = numOfWeekendNights * DAILY_RATE;
                double sum2 = totalRate5 + totalRate6;
                return sum2;

            }
            return 0;
        }

    /*
    Innovator's Inn continues to grow in popularity and now offers a rewards program to its customers.
    If a guest is a member of the rewards program, they get a rate of $89.99 per night regardless of the number of nights and weekends.
    Otherwise, the rates for weekday and weekend nights apply as described in the previous problem.
    Now implement the logic to return the total amount of a guest's stay based on
    the total number of nights, the number of weekend nights, and if the guest is a member of the rewards program.
    NOTE: the numOfTotalNights parameter includes weekend nights.

    Examples:
    calculateStayTotal(2, 0, false) ➔ 199.98
    calculateStayTotal(2, 0, true) ➔ 179.98
    calculateStayTotal(3, 0, true) ➔ 269.97
    calculateStayTotal(3, 1, true) ➔ 269.97
     */
            public double calculateStayTotal(int numOfTotalNights, int numOfWeekendNights, boolean isRewardsMember) {
            if(numOfTotalNights <= 2 && numOfWeekendNights >= 0 && isRewardsMember == false)
            {
                double nonMemRate = numOfTotalNights  * DAILY_RATE;
                return nonMemRate;
            }
            else if (isRewardsMember == true)
            {
                double memberRate = numOfTotalNights * DISCOUNT_RATE;
                return memberRate;
            }
              else if (isRewardsMember != true && numOfTotalNights >= 3 && numOfWeekendNights >= 0)

              {
                double discountNights = numOfTotalNights - numOfWeekendNights;
                double totalRate9 = discountNights * DISCOUNT_RATE;
                double totalRate10 = numOfWeekendNights * DAILY_RATE;
                double sum3 = totalRate9 + totalRate10;
                return sum3;
                }

                return 0;
            }
    }
