package com.enigma.student_enrollment.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "enroll")
public class Enroll {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enroll_seq")
    @SequenceGenerator(name = "enroll_seq", sequenceName = "enroll_id_seq", allocationSize = 1)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @OneToMany(cascade = {CascadeType.REMOVE})
    @JoinColumn(name = "enroll_id")
    private List<EnrollDetail> enrollDetailList;

    public Enroll() {
    }

    public Enroll(Student student) {
        this.student = student;
    }

    public Enroll(Integer id, Student student) {
        this.id = id;
        this.student = student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
