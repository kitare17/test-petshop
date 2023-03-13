/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import model.entity.User;
import model.repository.UserRepository;

/**
 *
 * @author PC
 */
public class UserService {
    public static User addUser(User user){
        UserRepository.register(user);
        return user;
    }
    public static boolean checkUserNameExist(String username){
        return UserRepository.checkUserNameExist(username);
    }
    public static User checkLogin(String username,String password){
        return UserRepository.login(username, password);              
    }
}
