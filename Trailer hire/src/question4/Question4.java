
package question4;

import java.util.Scanner;


public class Question4 {

    
    final public double dfee;
    
    public Question4(){
        
        dfee = 250;
        double answer1,answer2,add;
        
        
        System.out.println("How many days have you used the trailer?");
        Scanner d = new Scanner(System.in);
        String value = d.next();
        double day = Double.parseDouble(value);
         answer1 = dfee*day;
        
        System.out.println("How much kilometers have you driven with the trailer?");
        Scanner k = new Scanner(System.in);
        value = k.next();
        double km = Double.parseDouble(value);
        
        if (km < 60) {
            
          add = answer1*0.03 ;
          answer2 = answer1 + add;
          
          System.out.println("Your total is: " + answer2);
            
        }else if (km > 350) {
            
          add = answer1*0.09;
          answer2 = answer1 - add;
          
            System.out.println("Your total is: " + answer2);
            
        }
        
    }
    
    public static void main(String[] args) {
        
        new Question4();
        
    }
    
    
}
