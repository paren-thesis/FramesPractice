/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framespractice;

import java.time.LocalDate;

public class Retirement {
   private LocalDate birthdate;
   private LocalDate retiredate;
   private int contributionmonths;
   
   public Retirement(LocalDate birthdate, LocalDate retiredate, int contributionmonths){
       this.birthdate = birthdate;
       this.retiredate = retiredate;
       this.contributionmonths = contributionmonths;
   }
   
   public LocalDate dateofbirth() {
       return birthdate;
   }
   
   public LocalDate dateofretirement() {
       return retiredate;
   }
   
   public int age() {
       return LocalDate.now().getYear() - birthdate.getYear();
   }
   
   public int retireage() {
       return retiredate.getYear() - birthdate.getYear();
   }
   
     public double pensionright() {
        if (contributionmonths < 180) return 0.0;

        int extraMonths = contributionmonths - 180;
        double extraYears = extraMonths / 12.0;
        double extraPercent = extraYears * 1.125;
        double total = 37.5 + extraPercent;

        return Math.min(total, 60.0);
    }
}
