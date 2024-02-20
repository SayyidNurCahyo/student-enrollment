package com.enigma.student_enrollment.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="m_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
    @SequenceGenerator(name = "course_seq",sequenceName = "m_course_id_seq",allocationSize = 1)
    private Integer id;
    @Column(name="course_name")
    private String courseName;
    @Column(name = "credit")
    private Integer credit;

    public Course(Integer id, String courseName, Integer credit) {
        this.id = id;
        this.courseName = courseName;
        this.credit = credit;
    }

    public Course() {
    }

    public Course(String courseName, Integer credit) {
        this.courseName = courseName;
        this.credit = credit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }
}
