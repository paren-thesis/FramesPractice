/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package billscalculator;

/**
 *
 * @author Prosper
 */
public class Bills {

    private double gallons, minutes, kilowatts;

    public Bills(double gallons, double minutes, double kilowatts) {
        this.gallons = gallons;
        this.minutes = minutes;
        this.kilowatts = kilowatts;
    }

    public double getGallons() {
        return gallons;
    }

    public double getMinutes() {
        return minutes;
    }

    public double getKilowatts() {
        return kilowatts;
    }

    public double waterBill() {
        if (gallons <= 1000) {
            return 0;
        } else {
            return (gallons - 1000) - 0.05;
        }
    }
}
