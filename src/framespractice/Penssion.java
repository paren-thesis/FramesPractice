
package framespractice;

import java.time.LocalDate;

/**
 *
 * @author Prosper
 */
public class Penssion {
    private LocalDate dob;
    private int months;

    public Penssion(LocalDate dob, int months) {
        this.dob = dob;
        this.months = months;
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
        if(months <= 420)
            return 37.50 + ((months-180) * 0.09375);
        else
            return 60.00;
    }
}
