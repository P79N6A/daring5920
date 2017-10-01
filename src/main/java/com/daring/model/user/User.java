package com.daring.model.user;

import java.math.BigDecimal;

public class User {
    private String id;

    private String name;

    private String gender;

    private BigDecimal heigth;

    private BigDecimal weight;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public BigDecimal getHeigth() {
        return heigth;
    }

    public void setHeigth(BigDecimal heigth) {
        this.heigth = heigth;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}