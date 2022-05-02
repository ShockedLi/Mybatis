package com.shockedli.mybatis_bean;

import java.util.Date;

public class User {

    private Integer id;
    private String usernameabc;
    private Date birthdayabc;
    private String sexabc;
    private String addressabc;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.usernameabc = username;
    }

    public void setBirthday(Date birthday) {
        this.birthdayabc = birthday;
    }

    public void setSex(String sex) {
        this.sexabc = sex;
    }

    public void setAddress(String address) {
        this.addressabc = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", usernameabc='" + usernameabc + '\'' +
                ", birthdayabc=" + birthdayabc +
                ", sexabc='" + sexabc + '\'' +
                ", addressabc='" + addressabc + '\'' +
                '}';
    }
}

