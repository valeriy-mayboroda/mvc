package com.mvc.registration.dao;

import com.mvc.registration.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Repository
@Transactional
public class UserDao {
    @Autowired
    SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<User> getAllUsers () {
        return this.sessionFactory.getCurrentSession().createQuery("from User").list();
    }
}
