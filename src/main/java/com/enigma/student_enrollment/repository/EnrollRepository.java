package com.enigma.student_enrollment.repository;

import com.enigma.student_enrollment.dto.request.DetailEnrollRequest;
import com.enigma.student_enrollment.dto.response.DetailEnrollResponse;
import com.enigma.student_enrollment.entity.EnrollDetail;

import java.util.List;

public interface EnrollRepository {
    void save(DetailEnrollRequest request);
    List<DetailEnrollResponse> findAll();
    List<DetailEnrollResponse> findByBillID(Integer id);
    void update(EnrollDetail enrollDetail);
    void deleteByEnrollment(Integer id);
    void deleteEnrollmentDetail(Integer id);
}
