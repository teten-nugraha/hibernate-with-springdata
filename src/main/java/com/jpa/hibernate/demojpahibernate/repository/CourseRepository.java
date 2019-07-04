package com.jpa.hibernate.demojpahibernate.repository;

import com.jpa.hibernate.demojpahibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository {

    @Autowired
    private EntityManager em;

    public Course findById(Long id) {
        return em.find(Course.class, id);
    }
    public Course save(Course course) {
        if( Long.valueOf(course.getId()) == null ) {
            //create
            em.persist(course);
        }else{
            //save
            em.merge(course);
        }

        return course;
    }

    public void deleteById(Long id) {
        Course course = em.find(Course.class, id);
        em.remove(course);
    }

}
