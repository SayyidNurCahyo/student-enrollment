package com.enigma.student_enrollment.repository.impl;

import com.enigma.student_enrollment.dto.request.DetailEnrollRequest;
import com.enigma.student_enrollment.dto.response.DetailEnrollResponse;
import com.enigma.student_enrollment.entity.Enroll;
import com.enigma.student_enrollment.entity.EnrollDetail;
import com.enigma.student_enrollment.entity.Student;
import com.enigma.student_enrollment.repository.EnrollRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EnrollRepositoryImpl implements EnrollRepository {
    private final EntityManager entityManager;

    public EnrollRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public void save(DetailEnrollRequest request) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Enroll enroll = new Enroll(null,entityManager.find(Student.class,request.getStudentId()));
        for (int i = 0; i < request.getEnrollDetailList().size(); i++) {
            entityManager.persist(new EnrollDetail(null, enroll, request.getEnrollDetailList().get(i).getCourse(),
                    request.getEnrollDetailList().get(i).getPeriod()));
        }
        transaction.commit();
    }

    @Override
    public List<DetailEnrollResponse> findAll() {
        List<DetailEnrollResponse> result = new ArrayList<>();
        List<Object[]> objects = entityManager.createQuery("SELECT ed.id, ed.enroll.id, e.student.id, ed.course.id, ed.period.id FROM EnrollDetail as ed join Enroll as e on e.id=ed.enroll.id", Object[].class).getResultList();
        for(Object[] obj:objects){
            result.add(new DetailEnrollResponse((Integer) obj[0], (Integer) obj[1],(Integer) obj[2],(Integer) obj[3],(Integer) obj[4]));
        }
        return result;
    }

    @Override
    public List<DetailEnrollResponse> findByBillID(Integer id) {
        return null;
    }

    @Override
    public void update(EnrollDetail enrollDetail) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(enrollDetail);
        transaction.commit();
    }

    @Override
    public void deleteByEnrollment(Integer id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(entityManager.find(Enroll.class,id));
        transaction.commit();
    }

    @Override
    public void deleteEnrollmentDetail(Integer id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(entityManager.find(EnrollDetail.class,id));
        transaction.commit();
    }
}
