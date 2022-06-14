package com.assignment.assignmentwcd.entity;

import com.assignment.assignmentwcd.entity.base.BaseEntity;
import com.assignment.assignmentwcd.entity.myenum.ObjStatus;

import javax.servlet.http.HttpServlet;

public class Category extends BaseEntity {
    private int id;
    private String name;
    private ObjStatus status;

    public Category() {
    }

    public Category(int id, String name, ObjStatus status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjStatus getStatus() {
        return status;
    }

    public void setStatus(ObjStatus status) {
        this.status = status;
    }
}
