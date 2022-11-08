package com.mariia.service;

import com.mariia.domain.History;
import com.mariia.repository.HistoryRepository;
import org.hibernate.cfg.NotYetImplementedException;
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

    public Iterable<History> createRecords() {
        var histories = historyRepository.findAll();
        for (History history : histories) {
            //history.getRecords().add(Record.FAILED);
            throw new NotYetImplementedException();
        }
        historyRepository.saveAll(histories);
        return historyRepository.findAll();
    }

}
