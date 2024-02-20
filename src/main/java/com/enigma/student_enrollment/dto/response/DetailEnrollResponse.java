package com.enigma.student_enrollment.dto.response;

public class DetailEnrollResponse {
    private Integer detailId;
    private Integer enrollId;
    private Integer studentId;
    private Integer courseId;
    private Integer periodId;

    public DetailEnrollResponse() {
    }

    public DetailEnrollResponse(Integer enrollId, Integer studentId, Integer detailId, Integer courseId, Integer periodId) {
        this.enrollId = enrollId;
        this.studentId = studentId;
        this.detailId = detailId;
        this.courseId = courseId;
        this.periodId = periodId;
    }

    @Override
    public String toString() {
        return "DetailEnrollResponse{" +
                "detailId=" + detailId +
                ", enrollId=" + enrollId +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                ", periodId=" + periodId +
                '}';
    }

    public Integer getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(Integer enrollId) {
        this.enrollId = enrollId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Integer periodId) {
        this.periodId = periodId;
    }
}
