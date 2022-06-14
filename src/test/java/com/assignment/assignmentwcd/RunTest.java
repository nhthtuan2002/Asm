package com.assignment.assignmentwcd;

import com.assignment.assignmentwcd.entity.Category;
import com.assignment.assignmentwcd.model.mysqlmodel.MySqlCategoryModel;
import org.junit.jupiter.api.Test;

public class RunTest {
    @Test
    void saveCategory(){
        MySqlCategoryModel model = new MySqlCategoryModel();
        Category category = new Category();
        category.setName("Lau Nuong");
        boolean result = model.save(category);
        System.out.println(result);
    }
}
