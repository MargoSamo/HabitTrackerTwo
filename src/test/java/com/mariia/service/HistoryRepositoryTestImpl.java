package com.mariia.service;

import com.mariia.domain.History;
import com.mariia.repository.HistoryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HistoryRepositoryTestImpl implements HistoryRepository {

    private boolean isFindAllInvoked = false;
    private List<History> history = new ArrayList<>();

    public HistoryRepositoryTestImpl(List<History> history) {
        this.history = history;
    }

    public boolean isFindAllInvoked() {
        return isFindAllInvoked;
    }

    @Override
    public <S extends History> S save(S entity) {
        return null;
    }

    @Override
    public <S extends History> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<History> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<History> findAll() {
        isFindAllInvoked = true;
        return history;
    }

    @Override
    public Iterable<History> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(History entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends History> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
