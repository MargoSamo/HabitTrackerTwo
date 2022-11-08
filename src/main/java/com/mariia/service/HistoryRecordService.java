package com.mariia.service;

import com.mariia.domain.HistoryRecord;
import com.mariia.repository.HistoryRecordRepository;
import com.mariia.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class HistoryRecordService {

    @Autowired
    private HistoryRecordRepository historyRecordRepository;

    @Autowired
    private HistoryRepository historyRepository;

    public HistoryRecord saveOrUpdateHistoryRecord (HistoryRecord historyRecord, String habitName) {
    return null;

    }

}
