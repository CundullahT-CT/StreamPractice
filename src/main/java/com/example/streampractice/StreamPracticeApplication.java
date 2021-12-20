package com.example.streampractice;

import com.example.streampractice.service.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class StreamPracticeApplication {

    CountryService countryService;
    DepartmentService departmentService;
    EmployeeService employeeService;
    JobHistoryService jobHistoryService;
    JobService jobService;
    LocationService locationService;
    RegionService regionService;

    public StreamPracticeApplication(CountryService countryService, DepartmentService departmentService, EmployeeService employeeService, JobHistoryService jobHistoryService, JobService jobService, LocationService locationService, RegionService regionService) {
        this.countryService = countryService;
        this.departmentService = departmentService;
        this.employeeService = employeeService;
        this.jobHistoryService = jobHistoryService;
        this.jobService = jobService;
        this.locationService = locationService;
        this.regionService = regionService;
    }

    public static void main(String[] args) {
        SpringApplication.run(StreamPracticeApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {

        System.out.println("///// READ ALL COUNTRIES /////");
        System.out.println(countryService.readAll());
        System.out.println();

        System.out.println("///// READ ALL DEPARTMENTS /////");
        System.out.println(departmentService.readAll());
        System.out.println();

        System.out.println("///// READ ALL EMPLOYEES /////");
        System.out.println(employeeService.readAll());
        System.out.println();

        System.out.println("///// READ ALL JOB HISTORIES /////");
        System.out.println(jobHistoryService.readAll());
        System.out.println();

        System.out.println("///// READ ALL JOBS /////");
        System.out.println(jobService.readAll());
        System.out.println();

        System.out.println("///// READ ALL LOCATIONS /////");
        System.out.println(locationService.readAll());
        System.out.println();

        System.out.println("///// READ ALL REGIONS /////");
        System.out.println(regionService.readAll());

        //ABC
    }

}
