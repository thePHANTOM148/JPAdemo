package com.jpademo.JPAdemo.Service;

import com.jpademo.JPAdemo.Entity.Desktop;
import com.jpademo.JPAdemo.Entity.Employee;
import com.jpademo.JPAdemo.Repo.DeskRepo;
import com.jpademo.JPAdemo.Repo.MyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesktopServ {
    @Autowired
    DeskRepo deskRepo;

    @Autowired
    MyRepo EmpRepo;

    public List<Desktop> getallDesk() {
        return deskRepo.findAll();
    }

    public Desktop addDesk(Desktop d) {

        Employee employee = d.getEmp();
        employee.setDesktop(d);
        EmpRepo.save(employee);
        return  deskRepo.save(d);
    }
}
