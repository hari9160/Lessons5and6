package Lesson5;

public class Student {
    //define properties of the object 
    //instance variables = properties 
    //usually declared as private 
    private String name; 
    private int test1, test2, test3; 
    
    //constructor 
    //public <Name of the Class> 
    //this runs when object is made (instantied)
    //while the key word new
    //its job is to initialize some or all of the 
    //properties / instance variables of the object
    public Student(){ 
        name = ""; 
        test1 = 0; 
        test2 = 0; 
        test3 = 0; 
        System.out.println("Student has been created"); 
    }
    
    //another constructor to set all properties as you make it 
    public Student(String n, int t1, int t2, int t3) { 
        name = n; 
        test1 = t1; 
        test2 = t2; 
        test3 = t3; 
    }
    
    //3rd constructor to clone properties from another student 
    public Student(Student other) { 
        name = other.name;
        test1 = other.test1; 
        test2 = other.test2; 
        test3 = other.test3; 
        
    }
    //add instance methods to make up the abilities of the student 
    //access to name to set it and get it 
    
    public void setName(String n){ 
        name = n; 
    }
    
    public String getName(){ 
        return name; 
    }
    //access to test scores
    public void setScore(int which, int score){ 
        if(which==1) test1=score; 
        else if(which==2) test2 = score; 
        else test3 = score; 
    }
    public int getScore(int which){ 
        if (which==1) return test1; 
        else if(which==2) return test2; 
        else return test3; 
    }
    
    //average and highscore methods
    public int getHighScore(){ 
        int highscore = test1; 
        if(test2 > highscore) highscore=test2; 
        if(test3 > highscore) highscore=test3; 
        return highscore; 
    }
    
    public int getAverage(){ 
        return ((test1 + test2 + test3) / 3); 
    }
    
    public String validateData(){ 
        String em = null; 
        if (name.equals("")) //then a name was not entered
            em = "Name is required."; 
        if (test1<0 || test1>100 || test2<0 || test3<0 || test3>100)
            if (em == null) //then there has been no error yet
                em = "At least 1 mark is out of the acceptable range"; 
            else //add on to the message with += 
                em += "\nAt least mark is out of the acceptable range"; 
        if (em != null) //then we have an error so add the following line after it 
            em += "\nPlease re-enter all the data\n"; 
            return em; //return the error message, either as null or with a real message
    }
    
    //toString runs automaticall when you print an object 
    //all objects get a toString from parent Object class 
    //but you can make your own better version 
    public String toString(){ 
        String s = "Name:\t" + name; 
        s+= "\nTest 1: \t" + test1;
        s+= "\nTest 1: \t" + test1;
        s+= "\nTest 1: \t" + test1;
        s+= "\n-------------"; 
        s+= "\nAverage: \t" + getAverage(); 
        
        return s; 
        
    }
    
}
