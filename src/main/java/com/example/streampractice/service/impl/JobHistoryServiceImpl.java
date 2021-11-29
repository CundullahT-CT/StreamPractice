package com.example.streampractice.service.impl;

import com.example.streampractice.entity.JobHistory;
import com.example.streampractice.service.JobHistoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobHistoryServiceImpl implements JobHistoryService {

    private final List<JobHistory> list = new ArrayList<>();

    @Override
    public JobHistory create(JobHistory object) {
        list.add(object);
        return object;
    }

    @Override
    public List<JobHistory> createAll(List<JobHistory> list) {
        return list.stream().map(this::create).collect(Collectors.toList());
    }

    @Override
    public void update(JobHistory object) {
        for (JobHistory jobHistory : list) {
            if (jobHistory.getEmployeeId().equals(object.getEmployeeId()) && jobHistory.getJobId().equals(object.getJobId())) {
                jobHistory.setEmployeeId(object.getEmployeeId());
                jobHistory.setStartDate(object.getStartDate());
                jobHistory.setEndDate(object.getEndDate());
                jobHistory.setJobId(object.getJobId());
                jobHistory.setDepartmentId(object.getDepartmentId());
            }
        }
    }

    @Override
    public List<JobHistory> readAll() {
        return list;
    }

    @Override
    public List<JobHistory> readByEmployeeId(Long id) {
        return list.stream().filter(jobHistory -> jobHistory.getEmployeeId().equals(id)).collect(Collectors.toList());
    }

    @Override
    public void delete(JobHistory object) {
        list.remove(object);
    }

    @Override
    public void deleteByEmployeeId(Long id) {
        list.removeIf(jobHistory -> jobHistory.getEmployeeId().equals(id));
    }

}
