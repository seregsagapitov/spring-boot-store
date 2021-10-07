package com.seregsagapitov.springbootstore.dao;

import com.seregsagapitov.springbootstore.entities.ClientHib;
import org.springframework.transaction.annotation.Transactional;

public interface ClientDao {


    @Transactional
    ClientHib findById_client(Long id);
}
