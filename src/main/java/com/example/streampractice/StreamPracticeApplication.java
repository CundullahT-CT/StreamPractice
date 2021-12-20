package com.example.streampractice;

import com.example.streampractice.practice.Practice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class StreamPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamPracticeApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runPractices() throws Exception {

        System.out.println("Display all the employees");
        System.out.println(Practice.getAllEmployees());
        System.out.println();

        System.out.println("Display all the employees' first name");
        System.out.println(Practice.getAllEmployeesFirstName());
        System.out.println();

        System.out.println("Display all the employees whose salary is less than 5000");
        System.out.println(Practice.getAllEmployeesWithLessSalaryThan5000());
        System.out.println();

        System.out.println("Display all the employees whose salary is between 6000 and 7000");
        System.out.println(Practice.getAllEmployeesSalaryBetween());
        System.out.println();

        System.out.println("Display the salary of the employee Grant Douglas (lastName: Grant, firstName: Douglas)");
        System.out.println(Practice.getGrantDouglasSalary());
        System.out.println();

        System.out.println("Display the maximum salary an employee gets");
        System.out.println(Practice.getMaxSalary());
        System.out.println();

        System.out.println("Display the employee(s) who gets the maximum salary");
        System.out.println(Practice.getMaxSalaryEmployee());
        System.out.println();

        System.out.println("Display the second maximum salary an employee gets");
        System.out.println(Practice.getSecondMaxSalary());
        System.out.println();

        System.out.println("Display the employee(s) who gets the second maximum salary");
        System.out.println(Practice.getSecondMaxSalaryEmployee());
        System.out.println();

        System.out.println("Display the minimum salary an employee gets");
        System.out.println(Practice.getMinSalary());
        System.out.println();

        System.out.println("Display the employee(s) who gets the minimum salary");
        System.out.println(Practice.getMinSalaryEmployee());
        System.out.println();

        System.out.println("Display the second minimum salary an employee gets");
        System.out.println(Practice.getSecondMinSalary());
        System.out.println();

        System.out.println("Display the employee(s) who gets the second minimum salary");
        System.out.println(Practice.getSecondMinSalaryEmployee());
        System.out.println();

        System.out.println("Display the average salary of the employees");
        System.out.println(Practice.getAverageSalary());
        System.out.println();

        System.out.println("Display all the employees who are making more than average salary");
        System.out.println(Practice.getAllEmployeesAboveAverage());
        System.out.println();

        System.out.println("Display all the employees who are making less than average salary");
        System.out.println(Practice.getAllEmployeesBelowAverage());
        System.out.println();

        System.out.println("Display the total number of the departments");
        System.out.println(Practice.getTotalDepartmentsNumber());
        System.out.println();

        System.out.println("Display all the job histories in ascending order by start date");
        System.out.println(Practice.getAllJobHistoriesInAscendingOrder());
        System.out.println();

        System.out.println("Display all the job histories in descending order by start date");
        System.out.println(Practice.getAllJobHistoriesInDescendingOrder());
        System.out.println();

        System.out.println("Display all the employees whose first name starts with 'A'");
        System.out.println(Practice.getAllEmployeesFirstNameStartsWithA());
        System.out.println();

        System.out.println("Display all the employees whose job id contains 'IT'");
        System.out.println(Practice.getAllEmployeesJobIdContainsIT());
        System.out.println();

        System.out.println("Display all the employees whose department id is 50, 80, or 100");
        System.out.println(Practice.getAllEmployeesDepartmentIdIs50or80or100());
        System.out.println();

        System.out.println("Display the initials of all the employees");
        System.out.println(Practice.getAllEmployeesInitials());
        System.out.println();

        System.out.println("Display the full names of all the employees");
        System.out.println(Practice.getAllEmployeesFullNames());
        System.out.println();

        System.out.println("Display the length of the longest full name(s)");
        System.out.println(Practice.getLongestNameLength());
        System.out.println();

        System.out.println("Display the employee(s) with the longest full name(s)");
        System.out.println(Practice.getLongestNamedEmployee());
        System.out.println();

        System.out.println("Display all the employees whose department id is 90, 60, 100, 120, or 130");
        System.out.println(Practice.getAllEmployeesDepartmentIdIs90or60or100or120or130());
        System.out.println();

        System.out.println("Display all the employees whose department id is NOT 90, 60, 100, 120, or 130");
        System.out.println(Practice.getAllEmployeesDepartmentIdIsNot90or60or100or120or130());
        System.out.println();

    }

}
