package com.enigma.student_enrollment.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "m_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
    @SequenceGenerator(name = "student_seq",sequenceName = "m_student_id_seq",allocationSize = 1)
    private Integer id;
    @Column(name = "student_name")
    private String studentName;
    @Column(name = "major")
    private String major;

    public Student(Integer id, String studentName, String major) {
        this.id = id;
        this.studentName = studentName;
        this.major = major;
    }

    public Student() {
    }

    public Student(String studentName, String major) {
        this.studentName = studentName;
        this.major = major;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}

