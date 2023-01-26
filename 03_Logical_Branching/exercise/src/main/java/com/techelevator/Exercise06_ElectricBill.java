package com.techelevator;

public class Exercise06_ElectricBill {

    /*
    Tech Electric is an energy provider with a simple pricing model:
        The first 100 units are $0.20 per unit. 
        Anything more than 100 units is $0.25 per unit.
    The following problems have you calculate a customer's total for their energy usage.
     */

    // You can use these constants in your solutions.
    private final double BASE_RATE = 0.20;
    private final double EXCESS_RATE = 0.25;
    private final double EXCESS_UNITS_LIMIT = 100.0;
    private final double DISCOUNT_FACTOR = 0.95;

    /*
    Implement the logic to calculate what a customer owes for the units they've used.

    Examples:
    calculateElectricBill(50) ➔ 10.0
    calculateElectricBill(63.7) ➔ 12.74
    calculateElectricBill(110) ➔ 22.5
     */
    public double calculateElectricBill(double unitsUsed) {
        if (unitsUsed <= 100) {
            double baseRate = unitsUsed * BASE_RATE;
            return baseRate;
        } else if (unitsUsed > 100) {
            double unitDiff = unitsUsed - 100.0;
            double excRate = unitDiff * EXCESS_RATE;
            double sum = (EXCESS_UNITS_LIMIT * BASE_RATE) + excRate;
            return sum;
        }


        return 0;

    }

    //public static void main(String[] args){
    //Exercise06_ElectricBill object = new Exercise06_ElectricBill();
    // System.out.println(object.calculateElectricBill(100.1) + " 20.025");
    //}

    /*
    Tech Electric realized some of their customers have renewable energy like solar panels.
    To reward those customers, they'll give them 5% off their bill.
    Using the same rates, implement the logic to calculate what a customer owes for the units 
    they've used and if they have renewable energy.

    Examples:
    calculateElectricBill(50, false) ➔ 10.0
    calculateElectricBill(50, true) ➔ 9.5
    calculateElectricBill(110, true) ➔ 21.375
     */
    public double calculateElectricBill(double unitsUsed, boolean hasRenewableEnergy) {
        if (unitsUsed <= 100 && hasRenewableEnergy) {
            double baseRate = unitsUsed * BASE_RATE;
            double perOff = baseRate * 0.05;
            double totalBill = baseRate - perOff;
            return totalBill;
        } else if (unitsUsed > 100 && hasRenewableEnergy) {
            double unitDiff = unitsUsed - 100.0;
            double excRate = unitDiff * EXCESS_RATE;
            double sum1 = (EXCESS_UNITS_LIMIT * BASE_RATE) + excRate;
            double sum2 = sum1 * 0.05;
            double sum3 = sum1 - sum2;
            return sum3;
        } else if (unitsUsed <= 100 && !hasRenewableEnergy) {
            double baseRate = unitsUsed * BASE_RATE;
            return baseRate;

        } else if (unitsUsed > 100 && !hasRenewableEnergy) {
            double unitDiff = unitsUsed - 100.0;
            double excRate = unitDiff * EXCESS_RATE;
            double sum4 = (EXCESS_UNITS_LIMIT * BASE_RATE) + excRate;
            return sum4;
        }

        return 0;
    }


    /*
    On further research, customers with renewable energy can put electricity back into the system.
    Tech Electric wants to give credit to these customers, subtracting the units returned from the units they've used.
    These customers should still receive the 5% discount.
    Implement the logic to calculate what a customer owes for the units they've used, and the units returned.

    Note: If a customer returns more than they used, they'll receive money back.
    The refund is a rate of $0.20 per unit regardless of the amount. Don't apply the 5% discount if the customer receives a refund.

    Examples:
    calculateElectricBill(50, 0) ➔ 10.0
    calculateElectricBill(50, 4) ➔ 8.74
    calculateElectricBill(50, 60) ➔ -2.0
    calculateElectricBill(110, 6) ➔ 19.95
    calculateElectricBill(110, 20) ➔ 17.1
    calculateElectricBill(110, 120) ➔ -2.0
     */
    public double calculateElectricBill(double unitsUsed, double unitsReturned) {
        double unitDifference = (unitsUsed - unitsReturned);
        double monthPayment = 0;
        double exUnits = 0;

        if( unitDifference <= EXCESS_UNITS_LIMIT){
            monthPayment = unitDifference * BASE_RATE;
        }
        else {
            exUnits = unitDifference - EXCESS_UNITS_LIMIT;
            unitDifference -= exUnits;
            monthPayment = (unitDifference* BASE_RATE) + (exUnits * EXCESS_RATE);
        }
        if (unitsReturned >0 && unitDifference > 0){
            monthPayment *= DISCOUNT_FACTOR;
        }
        return monthPayment;

    }
}



