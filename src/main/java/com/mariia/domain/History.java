package com.mariia.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class History {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String habitName;

    //OneToMany with Project
    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, mappedBy = "history", orphanRemoval = true)
    private List<HistoryRecord> historyRecords = new ArrayList<>();

    public History() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHabitName() {
        return habitName;
    }

    public void setHabitName(String habitName) {
        this.habitName = habitName;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", habitName='" + habitName + '\'' +
                '}';
    }
}