/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.course.controller;

import com.leapfrog.course.courseDAO.CourseDAO;
import com.leapfrog.course.courseDAO.impl.CourseDAOImpl;
import com.leapfrog.course.entity.Course;
import com.leapfrog.course.entity.Student;
import com.leapfrog.course.studentDao.StudentDao;
import com.leapfrog.course.studentDao.studentDaoImpl.StudentDaoImpl;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author hp
 */
public class Controller {

    CourseDAO courseDAO = new CourseDAOImpl();
    StudentDao studentDao = new StudentDaoImpl();

    public void CourseAdd() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\course.txt"));
            String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");

                Course course = new Course();
                course.setId(Integer.parseInt(tokens[0]));
                course.setCourseName(tokens[1]);
                courseDAO.add(course);

            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

       

    }
    public void StudentAdd(){
        try {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\stu.txt"));
         String line = "";
            while ((line = reader.readLine()) != null) {
                String[] tokens1 = line.split(",");
                
           Student student = new Student();
                
               student.setId(Integer.parseInt(tokens1[0]));              
               student.setFirstName(tokens1[1]);
             student.setLastName(tokens1[2]);
               
              for(Course c : courseDAO.getAll()){
                   if(Integer.parseInt(tokens1[3])==c.getId()){
                      student.setCourse(c.getCourseName());
                     
                  }
               }
                
                
               studentDao.add(student);

            }
        
    } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
         for (Student stu : studentDao.getAll()) {
            System.out.println(stu.getId());
            System.out.println(stu.getFirstName());
             System.out.println(stu.getLastName());
             System.out.println(stu.getCourse());
            

        }
    
}
}
