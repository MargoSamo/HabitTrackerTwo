package com.mariia.repository;

import com.mariia.domain.History;
import com.mariia.domain.HistoryRecord;
import org.springframework.data.repository.CrudRepository;

public interface HistoryRecordRepository extends CrudRepository<HistoryRecord, Long> {

}
