/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.course.studentDao.studentDaoImpl;

import com.leapfrog.course.entity.Course;
import com.leapfrog.course.entity.Student;
import com.leapfrog.course.studentDao.StudentDao;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class StudentDaoImpl implements StudentDao {
ArrayList<Student> studentList = new ArrayList<>();
    @Override
    public boolean add(Student s) {
      studentList.add(s);
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public ArrayList<Student> getAll() {
     return studentList;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
