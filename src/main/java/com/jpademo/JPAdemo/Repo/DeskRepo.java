package com.jpademo.JPAdemo.Repo;

import com.jpademo.JPAdemo.Entity.Department;
import com.jpademo.JPAdemo.Entity.Desktop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DeskRepo extends JpaRepository<Desktop,Long> {

}
