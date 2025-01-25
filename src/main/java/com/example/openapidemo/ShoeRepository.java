package com.example.openapidemo;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ShoeRepository implements EmployeeRepository {

    public ShoeRepository() {
    }

    public static ShoeRepository createShoeRepository() {
        return new ShoeRepository();
    }

    @Override
    public <S extends Employee> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Employee> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Employee> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<Employee> findAll() {
        return List.of();
    }

    @Override
    public List<Employee> findAllById(Iterable<Integer> integers) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Employee entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Employee> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
