package com.assignment.assignmentwcd.controller.admin.category;

import com.assignment.assignmentwcd.model.mysqlmodel.MySqlCategoryModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteServlet extends HttpServlet {
    private final MySqlCategoryModel categoryModel;
    public DeleteServlet() {
        categoryModel = new MySqlCategoryModel();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int cateId = Integer.parseInt(req.getParameter("cateId"));
        categoryModel.Delete(cateId);
        resp.sendRedirect("/admin/category");
    }
}
