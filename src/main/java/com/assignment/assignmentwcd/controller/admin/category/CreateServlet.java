package com.assignment.assignmentwcd.controller.admin.category;

import com.assignment.assignmentwcd.entity.Category;
import com.assignment.assignmentwcd.entity.myenum.ObjStatus;
import com.assignment.assignmentwcd.model.mysqlmodel.MySqlCategoryModel;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class CreateServlet extends HttpServlet {
    private final MySqlCategoryModel categoryModel;
    public CreateServlet() {
        categoryModel = new MySqlCategoryModel();
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String status = req.getParameter("status");
        ObjStatus statusValue = ObjStatus.ACTIVE;
        if(status  == null) {
            statusValue = ObjStatus.DEACTIVE;
        }
        Category category = new Category();
        category.setName(name);
        category.setStatus(statusValue);
        boolean result = categoryModel.Save(category);
        resp.sendRedirect("/admin/category");
    }
}
