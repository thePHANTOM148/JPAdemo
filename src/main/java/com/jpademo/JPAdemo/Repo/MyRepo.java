package com.jpademo.JPAdemo.Repo;

import com.jpademo.JPAdemo.Entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyRepo extends JpaRepository<Employee,Integer> {

 //Already built in jdbc query methods
 public List<Employee> findByNameContaining(String S);
 public List<Employee> findByName(String S);

 //Own query methods off object type query
 @Query("select e from Employee e where e.address.Area=?1 and e.name=?2")
 public List<Employee> getbycity(String c,String n);

 //for traditional query with modifing query
 @Modifying
 @Transactional
 @Query(value = "update my_employee_table set city=:c where id=:id",
         nativeQuery = true)
 public void updateCity(@Param("c") String c,@Param("id") int id);
}
