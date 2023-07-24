package com.jpademo.JPAdemo.Service;

import com.jpademo.JPAdemo.Entity.Department;
import com.jpademo.JPAdemo.Entity.Employee;
import com.jpademo.JPAdemo.Error.EmailShouldUniqException;
import com.jpademo.JPAdemo.Repo.DepartmentRepo;
import com.jpademo.JPAdemo.Repo.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServ {
    @Autowired
    MyRepo repo;

    @Autowired
    DepartmentRepo DepRepo;


    public Employee AddEmployee(Employee e, int DeptId) throws EmailShouldUniqException {
      try {

        Department depart = DepRepo.findById(DeptId).orElse(null);
        if (depart == null) {
            return repo.save(e);
        } else {
            e.setDepartment(depart);
            return repo.save(e);
        }
    }
       catch(Exception E)
    {
        throw new EmailShouldUniqException("Already Email Exsist");
    }

}


    public List<Employee> GetEmployee() {
        return repo.findAll();
    }

    public List<Employee> GetEmployeebyChar(String s) {
        return repo.findByNameContaining(s);
    }

    public List<Employee> GetEmployeebyName(String s) {
        return repo.findByName(s);
    }

    public List<Employee> GetEmployeebyCity(String c, String n) {
        return  repo.getbycity(c,n);
    }

    public Optional<Employee> UpdateCity(String c, int id) {
        repo.updateCity(c,id);
        return repo.findById(id);
    }
}
