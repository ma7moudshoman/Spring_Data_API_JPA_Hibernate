package com.springdata.first.Controllrt;


import com.springdata.first.Model.DTO.EmpDTO;
import com.springdata.first.Model.Entity.Employee;
import com.springdata.first.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    EmpService service;

@GetMapping("/getEmp")
    public EmpDTO getUser(@RequestParam int id){
        return service.getUser(id);

    }
    @GetMapping("/all")
    public List<Employee> getAll(){
    return service.GetAll();
    }
@PostMapping("/saveEmp")
public  Employee save( @RequestBody Employee employee){
    return service.save(employee);
}

@GetMapping("/deleteEmp")
public void delete(@RequestParam int id){
    service.delete(id);

}


    @PostMapping("/updateEmp")
    public  Employee update( @RequestBody Employee employee){
        return service.update(employee);
    }

}
