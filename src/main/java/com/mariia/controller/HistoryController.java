package com.mariia.controller;

import com.mariia.domain.History;
import com.mariia.domain.Record;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HistoryController {

    @GetMapping("/history")
    public List<History> getHistory() {
        List<History> historiesList = new ArrayList<>();
        var history = new History();
        history.setHabitName("Run");
        List<Record> recordList = new ArrayList<>();
        recordList.add(Record.ACHIEVE);
        recordList.add(Record.ACHIEVE);
        recordList.add(Record.FAIL);
        recordList.add(Record.ACHIEVE);
        history.setRecords(recordList);
        historiesList.add(history);

        var historyOne = new History();
        historyOne.setHabitName("Push");
        List<Record> recordListOne = new ArrayList<>();
        recordListOne.add(Record.ACHIEVE);
        recordListOne.add(Record.FAIL);
        recordListOne.add(Record.FAIL);
        recordListOne.add(Record.ACHIEVE);
        historyOne.setRecords(recordListOne);
        historiesList.add(historyOne);

        var historyTwo = new History();
        historyTwo.setHabitName("Yoga");
        List<Record> recordListTwo = new ArrayList<>();
        recordListTwo.add(Record.ACHIEVE);
        recordListTwo.add(Record.ACHIEVE);
        recordListTwo.add(Record.ACHIEVE);
        recordListTwo.add(Record.ACHIEVE);
        historyTwo.setRecords(recordListTwo);
        historiesList.add(historyTwo);

        return historiesList;

    }
}