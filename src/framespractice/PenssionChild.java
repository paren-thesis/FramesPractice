/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framespractice;

import java.time.LocalDate;

/**
 *
 * @author Prosper
 */
public class PenssionChild extends Penssion{
    
    private double year1, year2, year3;

    public PenssionChild(double year1, double year2, double year3, LocalDate dob, int months) {
        super(dob, months);
        this.year1 = year1;
        this.year2 = year2;
        this.year3 = year3;
    }
    
    public double avgSalary() {
        return (year1 + year2 + year3) / 3;
    }
    
    public double annualPension() {
        return avgSalary() * (pRight()/100);
    }
    
    public double monthlyPenssion() {
        return annualPension() / 12;
    }
    
}
