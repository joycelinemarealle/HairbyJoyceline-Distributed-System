package com.hairbyjoyceline_marealle.hairbusiness.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class hairService implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long service_id;
    private String name;
    private double duration;
    private double price;

    public hairService(Long service_id, String name, double duration, double price) {
        this.service_id = service_id;
        this.name = name;
        this.duration = duration;
        this.price = price;
    }



    public Long getServ_id() {
        return service_id;
    }

    public void setServ_id(Long serv_id) {
        this.service_id = serv_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hairService that = (hairService) o;
        return Objects.equals(service_id, that.service_id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(service_id);
    }

    @Override
    public String toString() {
        return "Service{" +
                "serv_id=" + service_id +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}
