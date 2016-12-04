/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epm.dao;

import com.epm.dto.Users;

/**
 *
 * @author PRODEP_SOL
 */
public interface UsersDAO {
    /**
    *This method is used to the user to DB 
    */
    public boolean addUser(Users user);
}
