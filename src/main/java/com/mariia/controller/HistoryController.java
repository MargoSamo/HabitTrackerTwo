package com.mariia.controller;

import com.mariia.domain.History;
import com.mariia.domain.Record;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class HistoryController {

  List<History> historiesList = new ArrayList<>();

  {
    historiesList = new ArrayList<>();
    var history = new History();
    history.setHabitName("Run");
    List<Record> recordList = new ArrayList<>();
    recordList.add(Record.ACHIEVED);
    recordList.add(Record.ACHIEVED);
    recordList.add(Record.FAILED);
    recordList.add(Record.ACHIEVED);
    history.setRecords(recordList);
    historiesList.add(history);

    var historyOne = new History();
    historyOne.setHabitName("Push");
    List<Record> recordListOne = new ArrayList<>();
    recordListOne.add(Record.ACHIEVED);
    recordListOne.add(Record.FAILED);
    recordListOne.add(Record.FAILED);
    recordListOne.add(Record.ACHIEVED);
    historyOne.setRecords(recordListOne);
    historiesList.add(historyOne);

    var historyTwo = new History();
    historyTwo.setHabitName("Yoga");
    List<Record> recordListTwo = new ArrayList<>();
    recordListTwo.add(Record.ACHIEVED);
    recordListTwo.add(Record.ACHIEVED);
    recordListTwo.add(Record.ACHIEVED);
    recordListTwo.add(Record.ACHIEVED);
    historyTwo.setRecords(recordListTwo);
    historiesList.add(historyTwo);
  }

  @GetMapping("/history")
  @CrossOrigin
  public List<History> getHistory() {
    System.out.println("Get");
    return historiesList;

  }

  @PostMapping("/history")
  @CrossOrigin
  public List<History> saveHistories(@RequestBody List<History> histories) {
    System.out.println("Post " + histories);
    this.historiesList = histories;
    return historiesList;
  }
}
