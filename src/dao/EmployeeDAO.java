package dao;

import java.sql.SQLException;
import java.util.List;
import model.Employee;

/**
 * @author tombisnis@yahoo.com
 */
public interface EmployeeDAO{
    public void save(Employee employee);
    public void saveOrUpdate(Employee employee);
    public void delete(Employee employee);
    public List<Employee> getAllEmployees();
}