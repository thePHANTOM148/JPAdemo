package com.jpademo.JPAdemo.Repo;

import com.jpademo.JPAdemo.Entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {

}
