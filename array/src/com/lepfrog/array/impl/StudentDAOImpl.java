/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lepfrog.array.impl;

import com.lepfrog.array.inter.StudentDAO;

/**
 *
 * @author hp
 */
public class StudentDAOImpl implements StudentDAO  {

    String[] array;
    
    public StudentDAOImpl(String[] array)
    {
        this.array=array;
    }
    
    
    @Override
    public boolean hasId(int id) {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length;j++)
            {
                
            
            }
        
        }
    }

    @Override
    public boolean hasEmail(String email) {
  
    }

    @Override
    public boolean noEmail(String email) {
    
    }

    @Override
    public boolean isStatus(boolean status) {
    
    }
    
    
}
