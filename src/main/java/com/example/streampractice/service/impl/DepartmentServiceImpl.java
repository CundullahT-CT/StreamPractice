package com.example.streampractice.service.impl;

import com.example.streampractice.entity.Department;
import com.example.streampractice.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl extends CrudServiceImpl<Department, Long> implements DepartmentService {

    @Override
    public Department create(Department object) {
        return super.create(object.getId(), object);
    }

    @Override
    public List<Department> createAll(List<Department> list) {
        return list.stream().map(this::create).collect(Collectors.toList());
    }

    @Override
    public void update(Department object) {
        super.update(object.getId(), object);
    }

    @Override
    public List<Department> readAll() {
        return super.readAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Department object) {
        super.delete(object);
    }

    @Override
    public Department readById(Long id) {
        return super.readById(id);
    }

}
