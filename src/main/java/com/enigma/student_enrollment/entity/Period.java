package com.enigma.student_enrollment.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "m_period")
public class Period {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "period_seq")
    @SequenceGenerator(name = "period_seq",sequenceName = "m_period_id_seq",allocationSize = 1)
    private Integer id;
    @Column(name = "period_name")
    private String periodName;

    public Period() {
    }

    public Period(String periodName) {
        this.periodName = periodName;
    }

    public Period(Integer id, String periodName) {
        this.id = id;
        this.periodName = periodName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }
}
