package com.jpademo.JPAdemo.Entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String DeptName;
private int DeptId;
@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
@JsonIgnoreProperties("department")
private List<Employee> DEmp;
}
