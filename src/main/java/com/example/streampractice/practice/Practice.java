package com.example.streampractice.practice;

import com.example.streampractice.dto.Department;
import com.example.streampractice.dto.Employee;
import com.example.streampractice.dto.JobHistory;
import com.example.streampractice.service.*;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class Practice {

    public static CountryService countryService;
    public static DepartmentService departmentService;
    public static EmployeeService employeeService;
    public static JobHistoryService jobHistoryService;
    public static JobService jobService;
    public static LocationService locationService;
    public static RegionService regionService;

    public Practice(CountryService countryService, DepartmentService departmentService,
                    EmployeeService employeeService, JobHistoryService jobHistoryService,
                    JobService jobService, LocationService locationService,
                    RegionService regionService) {

        Practice.countryService = countryService;
        Practice.departmentService = departmentService;
        Practice.employeeService = employeeService;
        Practice.jobHistoryService = jobHistoryService;
        Practice.jobService = jobService;
        Practice.locationService = locationService;
        Practice.regionService = regionService;

    }

    // Display all the employees
    public static List<Employee> getAllEmployees() {
        return employeeService.readAll();
    }

    // Display all the employees' first name
    public static List<String> getAllEmployeesFirstName() {
        return employeeService.readAll().stream().map(Employee::getFirstName).collect(Collectors.toList());
    }

    // Display if there is any employee with salary less than 1000. If there is none, the method should return true
    public static boolean checkIfThereIsNoSalaryLessThan1000() {
//         return employeeService.readAll().stream().anyMatch(employee -> employee.getSalary() < 1000);
        return employeeService.readAll().stream().allMatch(employee -> employee.getSalary() > 1000);
    }

    // Check if the salaries of all the employees in IT department are greater than 2000 (departmentName: IT)
    public static boolean checkIfThereIsAnySalaryGreaterThan2000InITDepartment() {
//        return employeeService.readAll().stream().filter(employee -> employee.getSalary() > 2000)
//                .map(Employee::getDepartment).anyMatch(department -> department.getDepartmentName().equals("IT"));
        return employeeService.readAll().stream().filter(employee -> employee.getDepartment().getDepartmentName().equals("IT"))
                .anyMatch(employee -> employee.getSalary() > 2000);
    }

    // Display all the employees whose salary is less than 5000
    public static List<Employee> getAllEmployeesWithLessSalaryThan5000() {
        return employeeService.readAll().stream().filter(employee -> employee.getSalary() < 5000).collect(Collectors.toList());
    }

    // Display all the employees whose salary is between 6000 and 7000
    public static List<Employee> getAllEmployeesSalaryBetween() {
        return employeeService.readAll().stream().filter(employee -> employee.getSalary() > 6000 && employee.getSalary() < 7000).collect(Collectors.toList());
    }

    // Display the salary of the employee Grant Douglas (lastName: Grant, firstName: Douglas)
    public static Long getGrantDouglasSalary() throws Exception {
        return employeeService.readAll().stream()
                              .filter(employee -> employee.getFirstName().equals("Douglas") && employee.getLastName().equals("Grant"))
                              .map(Employee::getSalary).findAny()
                              .orElseThrow(() -> new Exception("Employee couldn't be found."));
    }

    // Display the maximum salary an employee gets
    public static Long getMaxSalary() throws Exception {
        return employeeService.readAll().stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(() -> new Exception("Something went wrong")).getSalary();

//        return employeeService.readAll().stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .findFirst().orElseThrow(() -> new Exception("Something went wrong")).getSalary();

//        return employeeService.readAll().stream()
//                              .map(Employee::getSalary)
//                              .reduce((a, b) -> a > b ? a : b)
//                              .orElseThrow(() -> new Exception("Employee couldn't be found."));
    }

    // Display the employee(s) who gets the maximum salary
    public static List<Employee> getMaxSalaryEmployee() {
        return employeeService.readAll().stream()
                              .filter(employee -> {
                                  try {
                                      return employee.getSalary().equals(getMaxSalary());
                                  } catch (Exception e) {
                                      e.printStackTrace();
                                  }
                                  return false;
                              }).collect(Collectors.toList());
    }

    // Display the second maximum salary an employee gets
    public static Long getSecondMaxSalary() throws Exception {
        return employeeService.readAll().stream()
                              .map(Employee::getSalary)
                              .reduce((a, b) -> {
                                  try {
                                      return a > b && a < getMaxSalary() ? a : b;
                                  } catch (Exception e) {
                                      e.printStackTrace();
                                  }
                                  return -1L;
                              }).orElseThrow(() -> new Exception("Employee couldn't be found."));
    }

    // Display the employee(s) who gets the second maximum salary
    public static List<Employee> getSecondMaxSalaryEmployee() {
        return employeeService.readAll().stream()
                              .filter(employee -> {
                                  try {
                                      return employee.getSalary().equals(getSecondMaxSalary());
                                  } catch (Exception e) {
                                      e.printStackTrace();
                                  }
                                  return false;
                              }).collect(Collectors.toList());
    }

    // Display the minimum salary an employee gets
    public static Long getMinSalary() throws Exception {
        return employeeService.readAll().stream()
                              .map(Employee::getSalary)
                              .reduce((a, b) -> a < b ? a : b)
                              .orElseThrow(() -> new Exception("Employee couldn't be found."));
    }

    // Display the employee(s) who gets the minimum salary
    public static List<Employee> getMinSalaryEmployee() {
        return employeeService.readAll().stream()
                              .filter(employee -> {
                                  try {
                                      return employee.getSalary().equals(getMinSalary());
                                  } catch (Exception e) {
                                      e.printStackTrace();
                                  }
                                  return false;
                              }).collect(Collectors.toList());
    }

    // Display the second minimum salary an employee gets
    public static Long getSecondMinSalary() throws Exception {
        return employeeService.readAll().stream()
                              .map(Employee::getSalary)
                              .reduce((a, b) -> {
                                  try {
                                      return a < b && a > getMinSalary() ? a : b;
                                  } catch (Exception e) {
                                      e.printStackTrace();
                                  }
                                  return -1L;
                              }).orElseThrow(() -> new Exception("Employee couldn't be found."));
    }

    // Display the employee(s) who gets the second minimum salary
    public static List<Employee> getSecondMinSalaryEmployee() {
        return employeeService.readAll().stream()
                              .filter(employee -> {
                                  try {
                                      return employee.getSalary().equals(getSecondMinSalary());
                                  } catch (Exception e) {
                                      e.printStackTrace();
                                  }
                                  return false;
                              }).collect(Collectors.toList());
    }

    // Display the average salary of the employees
    public static Double getAverageSalary() {
        return employeeService.readAll().stream()
                              .collect(Collectors.averagingDouble(Employee::getSalary));
    }

    // Display all the employees who are making more than average salary
    public static List<Employee> getAllEmployeesAboveAverage() {
        return employeeService.readAll().stream()
                              .filter(employee -> employee.getSalary() > getAverageSalary())
                              .collect(Collectors.toList());
    }

    // Display all the employees who are making less than average salary
    public static List<Employee> getAllEmployeesBelowAverage() {
        return employeeService.readAll().stream()
                              .filter(employee -> employee.getSalary() < getAverageSalary())
                              .collect(Collectors.toList());
    }

    // Display the total number of the departments
    public static Long getTotalDepartmentsNumber() {
        //return departmentService.readAll().stream().count();  // With stream
        return (long) departmentService.readAll().size();       // Without stream
    }

    // Display all the job histories in ascending order by start date
    public static List<JobHistory> getAllJobHistoriesInAscendingOrder() {
        return jobHistoryService.readAll().stream().sorted(Comparator.comparing(JobHistory::getStartDate))
                                .collect(Collectors.toList());
    }

    // Display all the job histories in descending order by start date
    public static List<JobHistory> getAllJobHistoriesInDescendingOrder() {
        return jobHistoryService.readAll().stream().sorted(Comparator.comparing(JobHistory::getStartDate).reversed())
                                .collect(Collectors.toList());
    }

    // Display all the employees whose first name starts with 'A'
    public static List<Employee> getAllEmployeesFirstNameStartsWithA() {
        return employeeService.readAll().stream().filter(employee -> employee.getFirstName().startsWith("A")).collect(Collectors.toList());
    }

    // Display all the employees whose job id contains 'IT'
    public static List<Employee> getAllEmployeesJobIdContainsIT() {
        return employeeService.readAll().stream().filter(employee -> employee.getJob().getId().contains("IT")).collect(Collectors.toList());
    }

    // Display all the employees whose department id is 50, 80, or 100
    public static List<Employee> getAllEmployeesDepartmentIdIs50or80or100() {
        return employeeService.readAll().stream()
                              .filter(employee -> employee.getDepartment().getId().equals(50L) || employee.getDepartment().getId().equals(80L) || employee.getDepartment().getId().equals(100L))
                              .collect(Collectors.toList());
    }

    // Display the initials of all the employees
    // Note: You can assume that there is no middle name
    public static List<String> getAllEmployeesInitials() {
        return employeeService.readAll().stream().map(employee -> {
            String firstInitial = employee.getFirstName().substring(0, 1);
            String lastInitial = employee.getLastName().substring(0, 1);
            return firstInitial + lastInitial;
        }).collect(Collectors.toList());
    }

    // Display the full names of all the employees
    public static List<String> getAllEmployeesFullNames() {
        return employeeService.readAll().stream().map(employee -> employee.getFirstName() + " " + employee.getLastName()).collect(Collectors.toList());
    }

    // Display the length of the longest full name(s)
    public static Integer getLongestNameLength() throws Exception {

        Employee employee = employeeService.readAll().stream()
                                           .reduce((employee1, employee2) ->
                                                   employee1.getFirstName().length() + employee1.getLastName().length() > employee2.getFirstName().length() + employee2.getLastName().length() ? employee1 : employee2)
                                           .orElseThrow(() -> new Exception("Something went wrong, try again."));

        return employee.getFirstName().length() + employee.getLastName().length() + 1;

    }

    // Display the employee(s) with the longest full name(s)
    public static List<Employee> getLongestNamedEmployee() {
        return employeeService.readAll().stream().filter(employee -> {
            try {
                return employee.getFirstName().length() + employee.getLastName().length() + 1 == getLongestNameLength();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return false;
        }).collect(Collectors.toList());
    }

    // Display all the employees whose department id is 90, 60, 100, 120, or 130
    public static List<Employee> getAllEmployeesDepartmentIdIs90or60or100or120or130() {
        return employeeService.readAll().stream()
                              .filter(employee -> employee.getDepartment().getId().equals(90L) || employee.getDepartment().getId().equals(60L) ||
                                      employee.getDepartment().getId().equals(100L) || employee.getDepartment().getId().equals(120L) || employee.getDepartment().getId().equals(130L))
                              .collect(Collectors.toList());
    }

    // Display all the employees whose department id is NOT 90, 60, 100, 120, or 130
    public static List<Employee> getAllEmployeesDepartmentIdIsNot90or60or100or120or130() {
        return employeeService.readAll().stream()
                              .filter(employee -> !(employee.getDepartment().getId().equals(90L) || employee.getDepartment().getId().equals(60L) ||
                                      employee.getDepartment().getId().equals(100L) || employee.getDepartment().getId().equals(120L) || employee.getDepartment().getId().equals(130L)))
                              .collect(Collectors.toList());
    }


}
