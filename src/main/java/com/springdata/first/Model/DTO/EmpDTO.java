package com.springdata.first.Model.DTO;


import com.springdata.first.Model.Entity.Employee;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpDTO {


    private  int id;

    private String firstname;

    private  String lastname;

    private  Double Salary;

    public static EmpDTO fromEntitytoDTO(Employee entity){
        return EmpDTO.builder()
                .id(entity.getId())
                .firstname(entity.getFirstname())
                .lastname(entity.getLastname())
                .Salary(entity.getSalary())
                .build();

    }
}
