package rest.service;

import java.util.List;

import rest.entity.Employee;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Employee saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
