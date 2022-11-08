package com.mariia.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

public class HistoryRecord {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long recordId;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate day = LocalDate.now();

    private Boolean record;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private History history;

    public HistoryRecord() {
    }

    public Long getRecordId() {
        return recordId;
    }

    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public boolean isRecord() {
        return record;
    }

    public void setRecord(boolean record) {
        this.record = record;
    }

    @Override
    public String toString() {
        return "HistoryRecord{" +
                "recordId=" + recordId +
                ", day=" + day +
                ", record=" + record +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryRecord that = (HistoryRecord) o;
        return record == that.record && Objects.equals(recordId, that.recordId) && Objects.equals(day, that.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, day, record);
    }
}
