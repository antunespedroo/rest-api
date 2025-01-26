package employeeproject.employee_service.service;

import employeeproject.employee_service.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);

}
