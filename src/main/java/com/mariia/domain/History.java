package com.mariia.domain;

import java.util.ArrayList;
import java.util.List;

public class History {
    String habitName;
    List<Record> records = new ArrayList<>();

    public String getHabitName() {
        return habitName;
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
                "habitName='" + habitName + '\'' +
                ", records=" + records +
                '}';
    }
}