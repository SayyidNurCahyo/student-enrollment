package com.enigma.student_enrollment.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enroll_detail")
public class EnrollDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enroll_detail_seq")
    @SequenceGenerator(name = "enroll_detail_seq",sequenceName = "enroll_detail_id_seq",allocationSize = 1)
    private Integer id;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "enroll_id")
    private Enroll enroll;
    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "course_id")
    private Course course;
    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "period_id")
    private Period period;

    public EnrollDetail(Enroll enroll, Course course, Period period) {
        this.enroll = enroll;
        this.course = course;
        this.period = period;
    }

    public EnrollDetail(Enroll enroll) {
        this.enroll = enroll;
    }

    public EnrollDetail() {
    }

    public EnrollDetail(Integer id, Enroll enroll, Course course, Period period) {
        this.id = id;
        this.enroll = enroll;
        this.course = course;
        this.period = period;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Enroll getEnroll() {
        return enroll;
    }

    public void setEnroll(Enroll enroll) {
        this.enroll = enroll;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
