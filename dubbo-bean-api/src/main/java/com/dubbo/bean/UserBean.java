package com.dubbo.bean;

import java.io.Serializable;

/**
 * @Auther: zhanghui
 * @Date: 2020/1/15
 * @Description: com.dubbo.bean
 * @version: 1.0
 */
public class UserBean implements Serializable {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;

    public UserBean(Integer id, String name, String gender, Integer age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
