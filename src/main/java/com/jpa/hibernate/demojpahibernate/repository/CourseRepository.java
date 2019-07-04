package com.jpa.hibernate.demojpahibernate.repository;

import com.jpa.hibernate.demojpahibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CourseRepository {

    @Autowired
    private EntityManager em;

    public Course findById(Long id) {
        return em.find(Course.class, id);
    }
//    public Course save(Course course)
//    public void deleteById(Long id)

}
