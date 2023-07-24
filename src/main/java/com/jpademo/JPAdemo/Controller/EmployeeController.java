package com.jpademo.JPAdemo.Controller;

import com.jpademo.JPAdemo.Entity.Employee;
import com.jpademo.JPAdemo.Error.EmailShouldUniqException;
import com.jpademo.JPAdemo.Service.EmployeeServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    public EmployeeServ serv;

    //Direct Repo methods
   @PostMapping("/EmployeeAdd")
    public Employee AddEmployee(@RequestBody Employee E,@RequestParam int DeptId) throws EmailShouldUniqException {
        return serv.AddEmployee(E,DeptId);
    }


    @GetMapping("/Employee")
    public List<Employee> GetEmployee(){
        return serv.GetEmployee();
    }

    //Already built in jdbc query methods
    @GetMapping("/Employee/{s}")
    public List<Employee> GetEmployeebyChar(@PathVariable String s ){

        return serv.GetEmployeebyChar(s);
    }
    @GetMapping("/GetByName")
    public List<Employee> GetEmployeebyName(@RequestParam String s ){

        return serv.GetEmployeebyName(s);
    }
    //Own query methods off object type query
    @GetMapping("/GetByCity")
    public List<Employee> GetEmployeebyCity(@RequestParam String c , @RequestParam String n){

        return serv.GetEmployeebyCity(c,n);
    }
    //for traditional query with modifing query
    @PutMapping("/UpdateCity/{id}")
    public Optional<Employee> UpdateCity(@PathVariable int id, @RequestParam String c){
       return  serv.UpdateCity(c,id);
    }
}


