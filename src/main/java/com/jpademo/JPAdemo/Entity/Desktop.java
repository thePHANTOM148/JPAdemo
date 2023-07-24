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

public class Desktop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int SlNum;
    private String SerialNo;
    private String Company;
    @OneToOne(mappedBy = "desktop")
    @JsonIgnoreProperties("desktop")
    private Employee Emp;




}
