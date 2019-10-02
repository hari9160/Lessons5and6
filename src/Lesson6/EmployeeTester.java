package Lesson6;

public class EmployeeTester {

    public static void main(String[] args) {
        Employee e1, e2; 
        e1 = new Employee(); 
        e2 = new Employee(); 
        
        e1.setName("Joey Full Time"); 
        System.out.println(e1.setType(1)); 
        e1.setHours(45); 
        e1.setRate(20); 
        System.out.println("Joey full time type is " + e1.getType()); //Won't be 99
        
        e2.setName("Joey Part Time"); 
        e2.setType(2); 
        e2.setHours(45); 
        e2.setRate(20); 
        
        System.out.println(e1.getName() + "pay = $" + e1.getPay()); 
        System.out.println(e2.getName() + "pay = $" + e2.getPay()); 
    }
    
}
