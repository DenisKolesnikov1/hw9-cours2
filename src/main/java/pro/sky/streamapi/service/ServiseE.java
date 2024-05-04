package pro.sky.streamapi.service;

import org.springframework.stereotype.Service;
import pro.sky.streamapi.model.Employee;

import java.util.List;
import java.util.Map;

@Service
public interface ServiseE {
    Employee add(String firstName, int department, int salary);

    Employee find(String firstName, int department, int salary);

    Employee delete(String firstName, int department, int salary);

    List<Employee> findAll();

    Employee getEmployeeWithMaxSalary(Integer departmentId);

    Employee getEmployeeWithMinSalary(Integer departmentId);

    List<Employee> getAllEmployees(Integer departmentId);

    Map<Integer, List<Employee>> getAllEmployeesByDepartments();
}
