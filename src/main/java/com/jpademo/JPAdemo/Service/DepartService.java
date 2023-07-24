package com.jpademo.JPAdemo.Service;

import com.jpademo.JPAdemo.Entity.Department;
import com.jpademo.JPAdemo.Entity.Employee;
import com.jpademo.JPAdemo.Repo.DepartmentRepo;
import com.jpademo.JPAdemo.Repo.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartService {
    @Autowired
    DepartmentRepo departmentRepo;

    @Autowired
    MyRepo EmpRepo;
    public Department addDepart(Department d) {
        List<Employee> employees = d.getDEmp();
        if (employees != null && !employees.isEmpty()) {
            for (Employee employee : employees) {
                employee.setDepartment(d);
                EmpRepo.save(employee);
            }
            }
        return departmentRepo.save(d);
    }

    public List<Department> getDepart() {
        return departmentRepo.findAll();
    }
}
