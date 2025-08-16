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
public class MyBill extends Bills {

    public MyBill() {
        super(1, 1, 1);
    }

    public MyBill(double gallons, double minutes, double kilowatts) {
        super(gallons, minutes, kilowatts);
    }

    public double electricityBill() {
        if (getKilowatts() <= 500) {
            return 0;
        } else {
            return (getKilowatts() - 500) * 2.01;
        }
    }

    public double telephoneBill() {
        if (getMinutes() <= 5) {
            return 0;
        } else {
            return (getMinutes() - 5) * 0.60;
        }
    }
    
    public double totalBill() {
        return waterBill() + telephoneBill() + electricityBill();
    }
}
