package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component("studentInfo")
public class StudentInfo{
    
    @Autowired
    College college;

    public void getStudentInfo(){
        System.out.println("Hi Myself Bhaskar Adki and studing in " + college.getCollege());
    }
   
}
