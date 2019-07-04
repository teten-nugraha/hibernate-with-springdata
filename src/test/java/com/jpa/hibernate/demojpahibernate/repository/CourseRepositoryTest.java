package com.jpa.hibernate.demojpahibernate.repository;

import com.jpa.hibernate.demojpahibernate.DemoJpaHibernateApplication;
import com.jpa.hibernate.demojpahibernate.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoJpaHibernateApplication.class)
public class CourseRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void findById() {
        Course course = courseRepository.findById(1001L);
        assertEquals("Simple JPA", course.getName());
    }

    @Test
    public void deleteById() {
        courseRepository.deleteById(1001L);
        assertNull(courseRepository.findById(1001L));
    }
}