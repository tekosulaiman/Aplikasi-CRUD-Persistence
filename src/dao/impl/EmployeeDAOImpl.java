package dao.impl;

import dao.EmployeeDAO;
import java.util.List;
import javax.persistence.EntityManager;
import model.Employee;
import resources.PersistenceUtil;

/**
 * @author tombisnis@yahoo.com
 */
public class EmployeeDAOImpl implements EmployeeDAO{

    private EntityManager entityManager;
    
    public EmployeeDAOImpl(){
        entityManager = PersistenceUtil.getFactory().createEntityManager();
    }
    
    @Override
    public void save(Employee employee) {   
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
    }

    @Override
    public void saveOrUpdate(Employee employee){
        entityManager.getTransaction().begin();
        entityManager.merge(employee);
        entityManager.getTransaction().commit();;
    }

    @Override
    public void delete(Employee employee){
        entityManager.getTransaction().begin();
        entityManager.remove(employee);
        entityManager.getTransaction().commit();
    }

    @Override
    public List<Employee> getAllEmployees(){
        return (List<Employee>) entityManager.createQuery("select e from Employee e").getResultList();
    }
}