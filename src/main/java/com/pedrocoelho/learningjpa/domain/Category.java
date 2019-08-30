package com.pedrocoelho.learningjpa.domain;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Category {
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(departmentName, category.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName);
    }

    @Override
    public String toString() {
        return "Category{" +
                "departmentName='" + departmentName + '\'' +
                '}';
    }
}
