package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.TestAppointment;
import com.example.repository.TestAppointmentRepository;


@Service
public class TestAppointmentService {

    @Autowired
	private TestAppointmentRepository testRe;
	
    public List<TestAppointment> listSave() {
        return testRe.findAll();
    }
}
