package com.seregsagapitov.springbootstore.repositories;

import com.seregsagapitov.springbootstore.entities.ClientHib;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends CrudRepository<ClientHib, Long> {

}
