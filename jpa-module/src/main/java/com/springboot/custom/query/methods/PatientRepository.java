package com.springboot.custom.query.methods;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface PatientRepository extends JpaRepository<Patient,String> {
        List<Patient> findByAge(int age);
        List<Patient> findByEmailId(String emailId);
}
