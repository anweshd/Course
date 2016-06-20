/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.course.courseDAO;

import com.leapfrog.course.entity.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public interface CourseDAO {
    boolean add (Course s);
    Course getById(int id);
    ArrayList<Course> getAll();
    
    
}
