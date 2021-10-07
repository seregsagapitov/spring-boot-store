package com.seregsagapitov.springbootstore.dao;

import com.seregsagapitov.springbootstore.entities.ClientHib;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class ClientHibImpl implements ClientDao{

    private SessionFactory sessionFactory;


    @Transactional
    @Override
    public ClientHib findById_client(Long id) {

        return sessionFactory.getCurrentSession().get(ClientHib.class, id);
    }

}
