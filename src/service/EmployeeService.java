package service;

import java.util.List;
import model.Employee;

/**
 * @author tombisnis@yahoo.com
 */
public interface EmployeeService {
    public void save(Employee employee);
    public void saveOrUpdate(Employee employee);
    public void delete(Employee employee);
    public List<Employee> getAllEmployees();
}