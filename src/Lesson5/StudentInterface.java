package Lesson5;
import java.util.Scanner;

public class StudentInterface {

    public static void main(String[] args) {
        Student stu1 = new Student(); 
        Student stu2 = new Student(); 
        Scanner scan = new Scanner(System.in); 
        
        String name; 
        int score; 
        //Input first Student's data
        System.out.print("Enter name for first student (min 1 letter): "); 
        name = scan.nextLine(); 
        stu1.setName(name); 
        for (int i = 1; i <= 3; i++) { 
            System.out.format("Enter test score %d for %s> ", i, stu1.getName()); 
            score = scan.nextInt(); 
            stu1.setScore(i, score);
        }
        
        scan.nextLine(); //clear scanner buffer 
        System.out.println("\n----------------------\n");
        //input the second student's data 
        //input first student's data 
        System.out.print("Enter name for second student: "); 
        name = scan.nextLine(); 
        stu2.setName(name); 
        for (int i = 1; i <= 3; i++) { 
            System.out.format("Enter test score %d for %s> ", i, stu2.getName()); 
            score = scan.nextInt(); 
            stu2.setScore(i, score);
        }
        System.out.println("\n------------------------\n"); 
        //output the Student's information
        System.out.println(stu1);
        System.out.println(stu2);
    }
    
}
