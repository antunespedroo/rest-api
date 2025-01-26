package employeeproject.employee_service.dao;

import employeeproject.employee_service.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);

}
