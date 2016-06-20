/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.course;

import com.leapfrog.course.controller.Controller;



/**
 *
 * @author hp
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller control = new Controller();
        control.CourseAdd();
        control.StudentAdd();
       
    }
    
}
