package com.jpademo.JPAdemo.Controller;

import com.jpademo.JPAdemo.Entity.Department;
import com.jpademo.JPAdemo.Repo.DepartmentRepo;
import com.jpademo.JPAdemo.Service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartController {
    @Autowired
    DepartService departService;

    @PostMapping("/DepartAdd") //not working
    public Department addDepart(@RequestBody Department D)
    {
        return departService.addDepart(D);
    }

    @GetMapping("/Depart")
    public List<Department> getDepart(){
        return departService.getDepart();
    }
}
