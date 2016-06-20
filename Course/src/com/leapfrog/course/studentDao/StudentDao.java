/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.course.studentDao;

import com.leapfrog.course.entity.Course;
import com.leapfrog.course.entity.Student;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public interface StudentDao {
    boolean add (Student s);
    
    ArrayList<Student> getAll(); 
}
