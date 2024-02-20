package com.enigma.student_enrollment.dto.request;

import com.enigma.student_enrollment.entity.EnrollDetail;

import java.util.List;

public class DetailEnrollRequest {
    private Integer studentId;
    private List<EnrollDetail>enrollDetailList;

    public DetailEnrollRequest() {
    }

    public DetailEnrollRequest(Integer studentId, List<EnrollDetail> enrollDetailList) {
        this.studentId = studentId;
        this.enrollDetailList = enrollDetailList;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public List<EnrollDetail> getEnrollDetailList() {
        return enrollDetailList;
    }

    public void setEnrollDetailList(List<EnrollDetail> enrollDetailList) {
        this.enrollDetailList = enrollDetailList;
    }
}
