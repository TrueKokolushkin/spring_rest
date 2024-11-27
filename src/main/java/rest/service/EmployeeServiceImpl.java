package rest.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import rest.dao.EmployeeDAO;
import rest.entity.Employee;
import rest.exception.NoSuchEmployeeException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee employee) {
        return employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        var employee = employeeDAO.getEmployee(id);
        validateResponse(employee, id);
        return employee;
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        var employee = getEmployee(id);
        validateResponse(employee, id);
        employeeDAO.deleteEmployee(employee);
    }

    private void validateResponse(Employee receivedEmployee, int requestedId) {
        if (Objects.isNull(receivedEmployee)) {
            throw new NoSuchEmployeeException("There is no employee with ID = " + requestedId + " in Database");
        }
    }

}
