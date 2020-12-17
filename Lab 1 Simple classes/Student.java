import java.math.*; 
import java.util.Random; // for random 
import java.io.*; // for file IO
import java.util.*;

class Student{
    String name;
    int attendance;
    double attendance_per;
    public void cal(){
      this.attendance=  (int)(Math.random() *45);  //genarating random value and put into the attendance
      
    }
    public void percentage(){
        this.attendance_per=(this.attendance/45.0)*100;        // calculating percentage of attendance
    }
}