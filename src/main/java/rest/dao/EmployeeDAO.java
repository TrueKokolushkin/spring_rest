package rest.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import rest.entity.Employee;

@Service
public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public Employee saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(Employee employee);
}
