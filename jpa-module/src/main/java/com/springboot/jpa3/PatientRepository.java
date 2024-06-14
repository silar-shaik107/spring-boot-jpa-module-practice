package com.springboot.jpa3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;
@Transactional
@Component
public interface PatientRepository extends CrudRepository<Patient,String> {
       List<Patient> deleteByContactNumber(long contactNumber);
}
