package com.lisa.mynews;

import android.graphics.drawable.shapes.RectShape;

/**
 * Created by Administrator on 2016/10/21.
 */
public class Student extends RectShape{
    private String name;
    private String age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
