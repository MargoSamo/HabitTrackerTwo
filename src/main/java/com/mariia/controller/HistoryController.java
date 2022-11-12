package com.mariia.controller;

import com.mariia.domain.History;
import com.mariia.service.HistoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

  private static final Logger log = LoggerFactory.getLogger(HistoryController.class.getName());

  @Autowired
  private HistoryService historyService;

  @GetMapping("/history")
  @CrossOrigin
  public Iterable<History> getHistory() {
    var histories = historyService.getAll();
    log.info("Found histories {}", histories);
    /**
     * debug
     * info
     * warning
     * error
     */
    return histories;
  }

  @PostMapping("/history")
  @CrossOrigin
  public Iterable<History> saveHistories(@RequestBody List<History> histories) {
    log.info("Receiving history {}", histories);
    historyService.save(histories);
    var histories1 = historyService.getAll();
    log.info("Found histories {}", histories1);
    return histories1;
  }

  @PostMapping("/record")
  @CrossOrigin
  public Iterable<History> createRecord() {
    return historyService.createRecords();
  }
}
