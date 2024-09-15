package com.hairbyjoyceline_marealle.hairbusiness.entity;

import jakarta.persistence.Entity;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
public class Admin implements Serializable {
    private Long admin_id;
    private String name;
    private String email;
    private List<HairService> services;

    public Admin(Long admin_id, String name, String email, List<HairService> services) {
        this.admin_id = admin_id;
        this.name = name;
        this.email = email;
        this.services = services;
    }

    public Long getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Long admin_id) {
        this.admin_id = admin_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<HairService> getServices() {
        return services;
    }

    public void setServices(List<HairService> services) {
        this.services = services;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(admin_id, admin.admin_id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(admin_id);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", services=" + services +
                '}';
    }
}
