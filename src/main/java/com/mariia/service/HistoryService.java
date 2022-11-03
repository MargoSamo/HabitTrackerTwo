package com.mariia.service;

import com.mariia.domain.History;
import com.mariia.domain.Record;
import com.mariia.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public void save(List<History> histories) {
        historyRepository.saveAll(histories);
    }

    public Iterable<History> getAll() {
        return historyRepository.findAll();
    }
}
