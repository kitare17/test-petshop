/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import java.util.ArrayList;
import model.entity.Food;
import model.entity.Pet;
import model.repository.ProductRepository;

/**
 *
 * @author PC
 */
public class ProductService {
    public static ArrayList<Pet> listPet(){
        return ProductRepository.listPet();
    }
    public static ArrayList<Food> listFood(){
        return ProductRepository.listFood();
    }
    public static ArrayList<Pet> listCat(){
        return ProductRepository.listCat();
    }
    public static ArrayList<Pet> listDog(){
        return ProductRepository.listDog();
    }
}
