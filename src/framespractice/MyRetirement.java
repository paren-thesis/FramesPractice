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
public class MyRetirement extends Retirement {

    private double yr1, yr2, yr3;

    public MyRetirement(double yr1, double yr2, double yr3, LocalDate birthdate, LocalDate retiredate, int contributionmonths) {
        super(birthdate, retiredate, contributionmonths);
        this.yr1 = yr1;
        this.yr2 = yr2;
        this.yr3 = yr3;
    }

    public double averagesalary() {
        return (yr1 + yr2 + yr3) / 3;
    }
    
    public double annualpension() {
        return averagesalary() * (pensionright() / 100);
    }
    
    public double monthlypension(){
        return annualpension() / 12;
    }

}
