package com.example.streampractice.service.impl;

import com.example.streampractice.dto.Location;
import com.example.streampractice.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LocationServiceImpl extends CrudServiceImpl<Location, Long> implements LocationService {

    @Override
    public Location create(Location object) {
        return super.create(object.getId(), object);
    }

    @Override
    public List<Location> createAll(List<Location> list) {
        return list.stream().map(this::create).collect(Collectors.toList());
    }

    @Override
    public void update(Location object) {
        super.update(object.getId(), object);
    }

    @Override
    public List<Location> readAll() {
        return super.readAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Location object) {
        super.delete(object);
    }

    @Override
    public Location readById(Long id) {
        return super.readById(id);
    }

}
