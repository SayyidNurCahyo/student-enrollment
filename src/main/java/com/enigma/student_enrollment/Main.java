package com.enigma.student_enrollment;

import com.enigma.student_enrollment.dto.request.DetailEnrollRequest;
import com.enigma.student_enrollment.entity.Course;
import com.enigma.student_enrollment.entity.Enroll;
import com.enigma.student_enrollment.entity.EnrollDetail;
import com.enigma.student_enrollment.entity.Period;
import com.enigma.student_enrollment.repository.EnrollRepository;
import com.enigma.student_enrollment.repository.impl.EnrollRepositoryImpl;
import com.enigma.student_enrollment.util.JpaUtil;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager= JpaUtil.getEM();
        EnrollRepository enrollRepository=new EnrollRepositoryImpl(entityManager);

//        List<EnrollDetail> enrollDetails = List.of(
//                new EnrollDetail(null,null,
//                        entityManager.find(Course.class,1),entityManager.find(Period.class,1)),
//                new EnrollDetail(null, null,
//                        entityManager.find(Course.class,4),entityManager.find(Period.class,1)),
//                new EnrollDetail(null, null,
//                        entityManager.find(Course.class,4), entityManager.find(Period.class,3)),
//                new EnrollDetail(null, null,
//                        entityManager.find(Course.class, 3), entityManager.find(Period.class,2)),
//                new EnrollDetail(null,null,entityManager.find(Course.class,2),
//                        entityManager.find(Period.class,2))
//        );
//
//        DetailEnrollRequest detailEnrollRequest=new DetailEnrollRequest(1,enrollDetails);
//        enrollRepository.save(detailEnrollRequest);

//        enrollRepository.delete(2);
        Enroll enroll = entityManager.find(Enroll.class,1);
        EnrollDetail enrollDetail = new EnrollDetail(1, enroll, entityManager.find(Course.class,4), entityManager.find(Period.class,2));
        enrollRepository.update(enrollDetail);
        enrollRepository.findAll().forEach(System.out::println);
        JpaUtil.shutdownEM();
        JpaUtil.shutdownEMF();
    }
}
