package com.example.openapidemo;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface EmployeeRepository extends ListCrudRepository<Employee, Integer> {
}

