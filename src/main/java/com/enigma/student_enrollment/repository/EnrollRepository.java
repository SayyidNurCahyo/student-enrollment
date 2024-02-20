package com.enigma.student_enrollment.repository;

import com.enigma.student_enrollment.dto.request.DetailEnrollRequest;
import com.enigma.student_enrollment.dto.response.DetailEnrollResponse;

import java.util.List;

public interface EnrollRepository {
    void save(DetailEnrollRequest request);
    List<DetailEnrollResponse> findAll();
    List<DetailEnrollResponse> findByBillID(Integer id);
    void update(Integer id, DetailEnrollRequest request);
    void delete(Integer id);
}
