package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bean.TestAppointment;



public interface TestAppointmentRepository extends JpaRepository<TestAppointment, Integer>{

}
