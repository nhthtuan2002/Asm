package com.assignment.assignmentwcd.model.mysqlmodel;

import com.assignment.assignmentwcd.constant.SqlConstant;
import com.assignment.assignmentwcd.entity.Category;
import com.assignment.assignmentwcd.entity.myenum.ObjStatus;
import com.assignment.assignmentwcd.model.CategoryModel;
import com.assignment.assignmentwcd.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlCategoryModel implements CategoryModel {

    Connection connection = ConnectionHelper.getConnection();

    @Override
    public boolean save(Category obj) {
        try {
            PreparedStatement preparedStatement
                    = connection.prepareStatement(SqlConstant.CATEGORY_INSERT);
            preparedStatement.setString(1, obj.getName());
            preparedStatement.setString(2, obj.getCreatedAt().toString());
            preparedStatement.setString(3, obj.getUpdatedAt().toString());
            preparedStatement.setInt(4, 1);
            preparedStatement.setInt(5, 1);
            preparedStatement.setInt(6, 1);
            preparedStatement.execute();
            return true;
        }catch(SQLException e){
            e.printStackTrace();
        }
      return false;
    }

    @Override
    public boolean update(int id, Category updateObj) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SqlConstant.CATEGORY_UPDATE);
            preparedStatement.setString(1, updateObj.getName());
            preparedStatement.setString(2, updateObj.getUpdatedAt().toString());
            preparedStatement.setInt(3, updateObj.getUpdatedBy());
            preparedStatement.setInt(4, updateObj.getStatus().getValue());
            preparedStatement.setInt(5, id);
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            PreparedStatement preparedStatement =
                    connection.prepareStatement(SqlConstant.CATEGORY_DELETE);
            preparedStatement.setInt(1, ObjStatus.DELETED.getValue());
            preparedStatement.setInt(2, id);
            preparedStatement.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Category> findAll() {
        return null;
    }


    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.CATEGORY_FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Category category = new Category();
                category.setId(resultSet.getInt(SqlConstant.CATEGORY_FIELD_ID));
                category.setName(resultSet.getString(SqlConstant.CATEGORY_FIELD_NAME));
                category.setStatus(ObjStatus.getAccountStatus(resultSet.getInt(SqlConstant.CATEGORY_FIELD_STATUS)));
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }
    @Override
    public Category findById(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.CATEGORY_FIND_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                Category category = new Category();
                category.setId(resultSet.getInt(SqlConstant.CATEGORY_FIELD_ID));
                category.setName(resultSet.getString(SqlConstant.CATEGORY_FIELD_NAME));
                category.setStatus(ObjStatus.getAccountStatus(resultSet.getInt(SqlConstant.CATEGORY_FIELD_STATUS)));
                return category;
            }
            return null;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
