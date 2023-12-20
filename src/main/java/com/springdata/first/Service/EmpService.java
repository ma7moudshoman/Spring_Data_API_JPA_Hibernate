package com.springdata.first.Service;

import com.springdata.first.Model.DTO.EmpDTO;
import com.springdata.first.Model.Entity.Employee;
import com.springdata.first.Rrepository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {
    @Autowired
    private EmpRepo empRepo;

    public List<Employee> GetAll(){
        return  empRepo.findAll();
    }
    public EmpDTO getUser(int id){
        Optional<Employee>employee=this.empRepo.findById(id);
                  return EmpDTO.fromEntitytoDTO(employee.get());
    }
public Employee save(Employee employee){
        return empRepo.save(employee);
}
public  void  delete (int id){
         empRepo.deleteById(id);
}
public Employee update(Employee employee){
        return empRepo.save(employee);

}
}
