/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lepfrog.array.inter;

/**
 *
 * @author hp
 */
public interface StudentDAO {
    boolean hasId(int id);
    boolean hasEmail(String email);
    boolean noEmail(String email);
    boolean isStatus(boolean status);
    
   
}
