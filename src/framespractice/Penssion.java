package framespractice;

import java.time.LocalDate;

/**
 *
 * @author Prosper
 */
public class Penssion {
    private LocalDate dob;
    private int months;
    private boolean isPNDC; // true for PNDLaw 247, false for Act 643

    public Penssion(LocalDate dob, int months, boolean isPNDC) {
        this.dob = dob;
        this.months = months;
        this.isPNDC = isPNDC;
    }

    public LocalDate getDob() {
        return dob;
    }
    
    public int age() {
        return LocalDate.now().getYear()- getDob().getYear();
    }
    
    public LocalDate retireDate() {
        return dob.plusYears(60);
    }
    
    public String bornDay() {
        return dob.getDayOfWeek().toString();
    }
    
    public double pRight() {
        if (isPNDC) {
            // PNDLaw 247 calculation
            if (months <= 420) {
                return 37.50 + ((months - 240) * 0.09375);
            } else {
                return 60.00;
            }
        } else {
            // Act 643 calculation
            if (months <= 420) {
                return 37.50 + ((months - 180) * 0.09375);
            } else {
                return 60.00;
            }
        }
    }
}
