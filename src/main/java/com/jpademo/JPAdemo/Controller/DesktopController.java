package com.jpademo.JPAdemo.Controller;

import com.jpademo.JPAdemo.Entity.Desktop;
import com.jpademo.JPAdemo.Service.DesktopServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController
public class DesktopController {
    @Autowired
    DesktopServ desktopServ;

    @GetMapping("/Desktops")
    public List<Desktop> getallDesk(){
        return desktopServ.getallDesk();
    }

    @PostMapping("/DesktopsAdd")
    public Desktop addDesk(@RequestBody Desktop D){
        return desktopServ.addDesk(D);
    }
}
