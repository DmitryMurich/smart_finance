package com.smartfinance.entities;

import java.util.Date;

/**
 * @author Murich Dmitry on 12.11.2015
 */
public class Revenue {
    private long id;
    private Date date;
    private double volume;
    private String category;
    private String description;

    public Revenue() {
    }

    public Revenue(long id, double volume, String category, String description) {
        this.id = id;
        this.date = new Date();
        this.volume = volume;
        this.category = category;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public Revenue setId(long id) {
        this.id = id;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Revenue setDate(Date date) {
        this.date = date;
        return this;
    }

    public double getVolume() {
        return volume;
    }

    public Revenue setVolume(double volume) {
        this.volume = volume;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Revenue setCategory(String category) {
        this.category = category;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Revenue setDescription(String description) {
        this.description = description;
        return this;
    }
}
