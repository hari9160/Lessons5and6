package Lesson6;

public class Employee {
    
    //step 1: Instance Variables 
    private String name; 
    private int type; //1 = FT emp, 2 = PT emp 
    private double rate; 
    private int hours; 
    
    //step 2: Constructor 
    public Employee(){ 
        name = ""; 
        type = 0; 
        rate = 0; 
        hours = 0; 
    }
    
    //step 3: Instance Methods
    //these 4 Return a "rule" message. 
    
    public String getTypeRules(){ 
        return "1 or 2"; 
    }
    public String getNameRule(){ 
        return "non - blank"; 
    }
    public String getRateRules(){ 
        return "between 6.75 and 30.50 inclusive"; 
    }
    public String getHourRules(){ 
        return "between 1 and 60 inclusive"; 
    }
    
    //Boolean Setters
    //If the incoming data breaks the rules the property WON'T be set. 
    //If the incoming data is OK, property is set, and true is returned. 
    //This accomplishes 2 things -> 
    //1) Protects the property from being set to "bad data" 
    //2) Sends a signal back to client class to let it know if property was set or not 
    
    public boolean setName(String nm){ 
        boolean nameblank = name.equals(""); 
        if(nameblank) return false; 
        else{ 
            name = nm; 
            return true; 
        }
    }
    
    public boolean setType(int t){ 
        boolean typeok = t==1 || t==2; 
        if(typeok){ 
            type = t; 
            return true; 
        }
        else 
            return false; 
    }
    
    public boolean setRate(double rt){ 
        boolean rateOk = rt >=6.75 && rt <=30.50; 
        if(rateOk){ 
            rate = rt; 
            return true; 
        }
        else return false; 
    }
    
    public boolean setHours(int h){ 
        boolean hoursOk = h>=1 && h <=60; 
        if(hoursOk)
            hours = h; 
        return hoursOk; 
    }
    
    public String getName(){ 
        return name; 
    }
    public double getPay(){ 
        boolean overtime = (type==1 && hours > 40); 
        double pay; 
        if(overtime){ 
            pay = (hours - 40) * rate * 2 + rate * 40; 
        }
        else 
            pay = hours * rate; 
        
        return pay; 
    }
}
