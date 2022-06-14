package com.assignment.assignmentwcd.model;

import com.assignment.assignmentwcd.entity.Category;

import java.util.List;

public interface CategoryModel {
    boolean save(Category obj);
    boolean update(int id, Category updateObj);
    boolean delete(int id);
    List<Category> findAll();

    List<Category> getAll();

    Category findById(int id);
}
