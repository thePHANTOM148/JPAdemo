package com.jpademo.JPAdemo.Entity;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name = "MyEmployeeTable")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "EmailAdd",unique = true)
    private String emailid;
    private int salary;
    @Embedded
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Desk_id")
    @JsonIgnoreProperties("emp")
    private Desktop desktop;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Dept_id")
    @JsonIgnoreProperties("DEmp")
    private Department department;
}
