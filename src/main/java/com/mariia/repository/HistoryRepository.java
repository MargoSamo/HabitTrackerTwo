package com.mariia.repository;

import com.mariia.domain.History;
import com.mariia.domain.Record;
import org.springframework.data.repository.CrudRepository;

public interface HistoryRepository extends CrudRepository<History, Long> {

}
