package com.dentalclinic.repository;


import com.dentalclinic.model.Staff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends CrudRepository<Staff,Long> {

}