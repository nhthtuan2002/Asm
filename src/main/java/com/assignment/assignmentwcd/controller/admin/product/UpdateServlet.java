package com.assignment.assignmentwcd.controller.admin.product;

import com.assignment.assignmentwcd.model.mysqlmodel.MySqlProductModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateServlet extends HttpServlet {
    private final MySqlProductModel productModel;
    public UpdateServlet() {
        productModel = new MySqlProductModel();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
