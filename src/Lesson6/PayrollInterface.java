package Lesson6;

import java.util.Scanner;


public class PayrollInterface {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee emp; 
        String name; 
        int type; 
        double rate; 
        int hours;       
        
        while(true){ 
            emp = new Employee(); 
            //ask for the name 
            System.out.print("Enter data for a new employee\n-----------------\n");
            System.out.print(" >> Name or, <enter> to quit: ");
            name = scan.nextLine(); 
            //try to set name, if fail get out of program 
            if(emp.setName(name)==false) break; 
            //if no break fill in rest of data for employee 
            //type
            while(true){ 
                System.out.print(" >> Type: (" + emp.getTypeRules() + "): ");
                type = scan.nextInt(); 
                if(emp.setType(type)) break; 
            }
            //rate
            while(true){ 
                System.out.print(" >> Rate: (" + emp.getRateRules() + "): ");
                rate = scan.nextDouble(); 
                if(emp.setRate(rate)) break; 
            }   
            //hours
            while(true){ 
                System.out.print(" >> Hours: (" + emp.getHourRules() + "): ");
                hours = scan.nextInt(); 
                if(emp.setHours(hours)) break; 
            }
            
            //when I get to here the employee has all VALID data set to its properties 
            //print the pay 
            System.out.format("Weekly pay for %s is %.2f\n",emp.getName(),emp.getPay()); 
            System.out.format(""); 
            scan.nextLine(); //clear the scanner at bottom of loop 
        }
        System.out.println("Program ended"); 
        

    }
    
}
/*
Testing Loc
Attempt         Data        Expected        Actual
=======         ====        ========        ======
1               type=0      Type not set    Type not set
2               type=1      Type set        Type set
*/
