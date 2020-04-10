package com.kodilla.ecommercee.repository;

import com.kodilla.ecommercee.domain.Address;
import com.kodilla.ecommercee.domain.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AddressRepository extends CrudRepository<Address, Long> {
    @Override
    List<Address> findAll();

    @Override
    Address save(Address address);

    @Override
    Optional<Address> findById(Long id);

    @Override
    void deleteById(Long id);
}
