package com.mariia.domain;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class History {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;

    String habitName;
    @ElementCollection(targetClass = Record.class)
    @CollectionTable
    @Enumerated(EnumType.STRING)
    List<Record> records = new ArrayList<>();

    public History() {
    }

    public String getHabitName() {
        return habitName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setHabitName(String habitName) {
        this.habitName = habitName;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", habitName='" + habitName + '\'' +
                ", records=" + records +
                '}';
    }
}