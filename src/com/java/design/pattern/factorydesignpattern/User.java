package com.java.design.pattern.factorydesignpattern;

import java.util.Objects;

public class User {
    private int id;
    private String name;
    private String cellPhone;
    private String emailId;

    public User() {
    }

    public User(int id, String name, String cellPhone, String emailId) {
        this.id = id;
        this.name = name;
        this.cellPhone = cellPhone;
        this.emailId = emailId;
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

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return this.getName() + this.getEmailId() + this.getCellPhone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                getCellPhone() == user.getCellPhone() &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getEmailId(), user.getEmailId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCellPhone(), getEmailId());
    }
}
