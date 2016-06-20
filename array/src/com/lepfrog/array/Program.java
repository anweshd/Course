/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lepfrog.array;

import com.lepfrog.array.entity.Student;
import java.lang.reflect.Array;

/**
 *
 * @author hp
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] array = new String[6];
        array[0] = "1,Chirag,Awale,chirag@gmail.com,1";
        array[1] = "2,anwesh, devkota,anweshdevkota@gmail.com,0";
        array[2] = "3,sagar,ghimire,sagarghimire@gmail.com,0";
        array[3] = "1,,,";
        array[4] = "5,anwesh, devkota,,";

        for (int i = 0; i < array.length; i++) {
            String[] data = array[i].split(",");

            if (data.length >= 5) {
                   Student s=new Student();
                   s.setId(Integer.parseInt(data[1]));
                   s.setFirstName(data[2]);
                   s.setLastName(data[3]);
             
                   s.setStatus(Boolean.parseBoolean(data[4]));
            

        }
    }

}
