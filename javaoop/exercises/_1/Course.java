package javaoop.exercises._1;

import java.util.ArrayList;

public class Course {
    String courseName = "";
    int maxStudent;
    int qualityRatingOutOf10;
    int weekOfCourse;
    double costOfCourse;
    ArrayList<Student> studentlist = new ArrayList<>();
    
    public double average(){
        double sum = 0;

        for (int i = 0; i < studentlist.size(); i++) {
            sum = sum + studentlist.get(i).age;
        }

        double average = sum /studentlist.size();
        return average;
    }
    
    
}
