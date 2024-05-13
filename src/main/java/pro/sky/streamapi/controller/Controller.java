package pro.sky.streamapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.streamapi.model.Employee;
import pro.sky.streamapi.service.ServiseE;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class Controller {

    private final ServiseE serviseE;

    public Controller(ServiseE serviseE) {
        this.serviseE = serviseE;
    }

    @GetMapping("/max-salary")
    public Employee getEmployeeWithMaxSalary(@RequestParam Integer departmentId) {
        return serviseE.getEmployeeWithMaxSalary(departmentId);
    }

    @GetMapping("/min-salary")
    public Employee getEmployeeWithMinSalary(@RequestParam Integer departmentId) {
        return serviseE.getEmployeeWithMinSalary(departmentId);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees(@RequestParam Integer departmentId) {
        return serviseE.getAllEmployees(departmentId);
    }

    @GetMapping("/all-by-departments")
    public Map<Integer, List<Employee>> getAllEmployeesByDepartments() {
        return serviseE.getAllEmployeesByDepartments();
    }
}

