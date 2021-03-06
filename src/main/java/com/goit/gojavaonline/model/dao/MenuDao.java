package com.goit.gojavaonline.model.dao;

import com.goit.gojavaonline.model.Dish;
import com.goit.gojavaonline.model.Menu;

import java.util.List;


public interface MenuDao {
    void insertMenu(Menu menu);
    void deleteMenu(int id);
    void insertDishInMenu(int menuId, Dish dish);
    void deleteDishFromMenu(int menuId, Dish dish);
    Menu findByName(String name);
    List<Menu> getAll();
    List<Dish> getAllMenuDishes(int menuId);
}
