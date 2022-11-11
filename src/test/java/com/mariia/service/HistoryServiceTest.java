package com.mariia.service;

import com.mariia.domain.History;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HistoryServiceTest {

    @Test
    public void shouldGetAll() {
        // Given
        var savedHistories = new ArrayList<History>();
        var history = new History();
        history.setId(1L);
        savedHistories.add(history);
        var historyRepository = new HistoryRepositoryTestImpl(savedHistories);
        var historyService = new HistoryService(historyRepository);

        // When
        var histories = historyService.getAll();

        // Then
        assertTrue(historyRepository.isFindAllInvoked());
        assertTrue(histories.iterator().hasNext());
        assertEquals(histories.iterator().next().getId(), history.getId());
    }
}