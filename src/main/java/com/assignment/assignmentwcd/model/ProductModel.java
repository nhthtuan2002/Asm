package com.assignment.assignmentwcd.model;

import com.assignment.assignmentwcd.entity.Product;

import java.util.List;

public interface ProductModel {
    boolean save(Product obj);
    boolean update(int id, Product updateObj);
    boolean delete(int id);
    List<Product> findAll();

    boolean Save(Product product);

    List<Product> getAll();

    Product findById(int id);
    Product findByProductName(String productName);

    boolean Update(int id, Product productUpdate);

    boolean Delete(int id);
}