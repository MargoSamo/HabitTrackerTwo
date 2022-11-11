package com.mariia.controller;

import com.mariia.domain.History;
import com.mariia.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class HistoryController {

  @Autowired
  private HistoryService historyService;

  @GetMapping("/history")
  @CrossOrigin
  public Iterable<History> getHistory() {
    return historyService.getAll();
  }

  @PostMapping("/history")
  @CrossOrigin
  public Iterable<History> saveHistories(@RequestBody List<History> histories) {
    historyService.save(histories);
    return historyService.getAll();
  }

  @PostMapping("/record")
  @CrossOrigin
  public Iterable<History> createRecord() {
    return historyService.createRecords();
  }
}
