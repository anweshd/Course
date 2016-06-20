/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.course.courseDAO.impl;

import com.leapfrog.course.courseDAO.CourseDAO;
import com.leapfrog.course.entity.Course;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class CourseDAOImpl implements CourseDAO {

    ArrayList<Course> courseList = new ArrayList<>();

    @Override
    public boolean add(Course s) {
        courseList.add(s);
        return false;

    }

    @Override
    public Course getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Course> getAll() {
        return courseList;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
