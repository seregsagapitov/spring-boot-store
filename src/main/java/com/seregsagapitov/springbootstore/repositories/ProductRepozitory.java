package com.seregsagapitov.springbootstore.repositories;

import com.seregsagapitov.springbootstore.entities.ProductHib;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepozitory extends CrudRepository<ProductHib, Long> {
}
